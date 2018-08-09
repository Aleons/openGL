package pages;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wiget.Button;
import wiget.Edit;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static utils.Locators.CountingPage.*;

public class CountingPage {

    public CountingPage(){
        new WebDriverWait(WebDriverRunner.getWebDriver(), 30)
                .until((WebDriver d) -> executeJavaScript("return document.readyState;").toString().equals("complete"));
    }

    public Button goToPaymentButton(){return new Button(goToPaymentButton);}
    public Edit cardNumber(){return new Edit(cardNumber);}
    public Edit month(){return new Edit(month);}
    public Edit year(){return new Edit(year);}
    public Edit cardholdersName(){return new Edit(cardholdersName);}
    public Edit cvv(){return new Edit(cvv);}
    public Button payButton(){return new Button(payButton);}

}
