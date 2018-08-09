package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wiget.Button;
import wiget.Edit;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static utils.Locators.AuthorizationPage.*;

public class AuthorizationPage {

    public AuthorizationPage(){
        new WebDriverWait(WebDriverRunner.getWebDriver(), 30)
                .until((WebDriver d) -> executeJavaScript("return document.readyState;").toString().equals("complete"));
    }

    public Button tabEnter(){return new Button(tabEnter);}
    public Edit mail(){return new Edit(mail);}
    public Edit password(){return new Edit(password);}
    public Button okButton(){return new Button(okButton);}

}
