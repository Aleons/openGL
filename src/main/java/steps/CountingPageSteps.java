package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class CountingPageSteps extends BaseSteps {

    @Step("click goToPaymentButton")
    public CountingPageSteps goToPaymentButton(){
        baseRouter.countingPage.goToPaymentButton().click();
        return this;
    }

    @Step("Send number card")
    public CountingPageSteps sendNumberCard(String numberCard){
        baseRouter.countingPage.cardNumber().sendText(numberCard);
        return this;
    }

    @Step("Send month")
    public CountingPageSteps sendMonth(String month){
        baseRouter.countingPage.month().sendText(month);
        return this;
    }

    @Step("Send year")
    public CountingPageSteps sendYear(String year){
        baseRouter.countingPage.year().sendText(year);
        return this;
    }

    @Step("send cardholders name")
    public CountingPageSteps sendCardholdersName(String name){
        baseRouter.countingPage.cardholdersName().sendText(name);
        return this;
    }

    @Step("Send cvv")
    public CountingPageSteps sendCVV(String cvv){
        baseRouter.countingPage.cvv().sendText(cvv);
        return this;
    }

    @Step("Click pay button")
    public PayPageStep clickPayButton(){
        baseRouter.countingPage.payButton().click();
        return page(PayPageStep.class);
    }

}
