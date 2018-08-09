package steps;

import io.qameta.allure.Step;

public class PayPageStep extends BaseSteps{

    @Step("send code")
    public PayPageStep sendCode(String code){
        baseRouter.payPage.code().sendText(code);
        return this;
    }

    @Step("click button")
    public void clickButton(){
        baseRouter.payPage.submit().click();
    }

}
