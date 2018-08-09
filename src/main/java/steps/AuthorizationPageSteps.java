package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class AuthorizationPageSteps extends BaseSteps{

    @Step("click tab enter")
    public AuthorizationPageSteps clickTabEnter(){
        baseRouter.authorizationPage.tabEnter().click();
        return this;
    }

    @Step("send mail")
    public AuthorizationPageSteps sendMail(String mail){
        baseRouter.authorizationPage.mail().sendText(mail);
        return this;
    }

    @Step("send password")
    public AuthorizationPageSteps sendPassword(String password){
        baseRouter.authorizationPage.password().sendText(password);
        return this;
    }

    @Step("click enter button")
    public PersonalAreaPageSteps clickEnterButton(){
        baseRouter.authorizationPage.okButton().click();
        return page(PersonalAreaPageSteps.class);
    }

}
