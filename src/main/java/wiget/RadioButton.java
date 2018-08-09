package wiget;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RadioButton {

    private SelenideElement radioButton;

    public RadioButton (By locator){
        radioButton = $(locator);
    }

}
