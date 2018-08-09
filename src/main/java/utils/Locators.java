package utils;

import org.openqa.selenium.By;

public interface Locators {

    interface AuthorizationPage {

        By tabEnter = By.xpath("//*[@class = \"SidebarUnauthorised__container\"]/div/button[1]");
        By mail = By.xpath("//*[@class = \"SidebarLogin\"]/div[1]//input");
        By password = By.xpath("//*[@class = \"SidebarLogin\"]/div[2]//input");
        By okButton = By.xpath("//*[@class = \"SidebarLogin\"]//button[1]");

    }

    interface PersonalAreaPage{

        By depositButton = By.xpath("//*[@class=\"SidebarProfile__buttons\"]/a[1]");

    }

    interface CountingPage{

        By goToPaymentButton = By.xpath(".//button[@class='btn btn-success btn--with-icon']");
        By cardNumber = By.xpath(".//input[@id='card-number']");
        By month = By.xpath(".//input[@id='card-exp-month']");
        By year = By.xpath(".//input[@id='card-exp-year']");
        By cvv = By.xpath(".//input[@id='card-cvv']");
        By cardholdersName = By.xpath(".//input[@id='card-holder']");
        By payButton = By.xpath(".//button[@class='btn btn-success btn--with-icon']");

    }

    interface PayPage{

        By code = By.xpath("");
        By submit = By.xpath(".//input[@type='submit']");

    }

}
