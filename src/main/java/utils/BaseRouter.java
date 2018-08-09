package utils;

import pages.AuthorizationPage;
import pages.CountingPage;
import pages.PayPage;
import pages.PersonalAreaPage;

public class BaseRouter {

    public AuthorizationPage authorizationPage = new AuthorizationPage();
    public PersonalAreaPage personalAreaPage = new PersonalAreaPage();
    public CountingPage countingPage = new CountingPage();
    public PayPage payPage = new PayPage();

}
