package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wiget.Button;
import wiget.Edit;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static utils.Locators.PayPage.*;

public class PayPage {

    public PayPage(){
        new WebDriverWait(WebDriverRunner.getWebDriver(), 30)
                .until((WebDriver d) -> executeJavaScript("return document.readyState;").toString().equals("complete"));
    }

    public Edit code(){return new Edit(code);}
    public Button submit(){return new Button(submit);}

}
