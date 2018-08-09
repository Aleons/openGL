package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wiget.Button;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static utils.Locators.PersonalAreaPage.*;

public class PersonalAreaPage {

    public PersonalAreaPage(){
        new WebDriverWait(WebDriverRunner.getWebDriver(), 30)
                .until((WebDriver d) -> executeJavaScript("return document.readyState;").toString().equals("complete"));
    }

    public Button depositButton(){return new Button(depositButton);}

}
