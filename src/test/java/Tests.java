import api.Registration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.AuthorizationPageSteps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tests {

    AuthorizationPageSteps authorizationPageSteps = new AuthorizationPageSteps();
    Registration registration = new Registration();



    @Test
    void test(){
        ArrayList<String> list = registration.getData();
        System.out.println(list.get(0));
        Selenide.open("https://iqoption.com");
        authorizationPageSteps.clickTabEnter().sendMail(list.get(0)).sendPassword(list.get(1))
        .clickEnterButton().clickDepositButton().goToPaymentButton().sendNumberCard("NumberCard").sendMonth("Month")
        .sendYear("Year").sendCVV("CVV").sendCardholdersName("CardholdersName").clickPayButton()
        //.sendCode("code").clickButton()
        ;
        Selenide.close();
    }



}
