package wiget;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.BaseRouter;

import static com.codeborne.selenide.Selenide.$;

public class Edit extends BaseRouter {

    private SelenideElement edit;

    public Edit(By locator){
        edit = $(locator);
    }

    public BaseRouter sendText(String text){
        edit.sendKeys(text);
        return this;
    }

}
