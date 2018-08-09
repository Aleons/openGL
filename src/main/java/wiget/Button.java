package wiget;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.BaseRouter;

import static com.codeborne.selenide.Selenide.$;

public class Button extends BaseRouter {

    private SelenideElement button;

    public Button(By locator){
        button = $(locator);
    }

    public BaseRouter click(){
        button.click();
        return this;
    }

}
