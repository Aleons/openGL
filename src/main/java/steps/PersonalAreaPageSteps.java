package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class PersonalAreaPageSteps extends BaseSteps {

    @Step("click deposit button")
    public CountingPageSteps clickDepositButton(){
        baseRouter.personalAreaPage.depositButton().click();
        return page(CountingPageSteps.class);
    }

}
