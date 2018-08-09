package api;

import io.restassured.RestAssured;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.equalTo;

public class Registration {

    ArrayList<String> list = new ArrayList();

    private Map<String, Object> generateUserData(){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("email", RandomStringUtils.randomAlphabetic(8) + "@mailinator.com");
        data.put("first_name", RandomStringUtils.randomAlphabetic(4) + "test_first");
        data.put("last_name", RandomStringUtils.randomAlphabetic(4) + "test_last");
        data.put("password", RandomStringUtils.randomAlphanumeric(8));
        data.put("terms_accepted", true);
        return data;
    }

    private void registration() {
        Map<String, Object> data = generateUserData();
        System.out.println(data.get("email").toString());
        RestAssured.given().baseUri("https://iqoption.com")
                .params(data)
                .post("api/register")
                .then();

        list.add(data.get("email").toString());
        list.add(data.get("password").toString());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

    public ArrayList<String> getData(){
        registration();
        return list;
    }

}
