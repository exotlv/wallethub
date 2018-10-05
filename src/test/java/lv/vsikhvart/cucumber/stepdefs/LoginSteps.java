package lv.vsikhvart.cucumber.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lv.vsikhvart.cucumber.config.ApplicationProperties;
import lv.vsikhvart.cucumber.pageobjects.LoginPage;

import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.TEST_USER_NAME;
import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.TEST_USER_PASSWORD2;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class LoginSteps {
    private LoginPage loginPage;


    @Then("^Login - default user logs in$")
    public void userLogsInWithFollowingCredentials() throws Throwable {
        loginPage = new LoginPage();
        loginPage.login(ApplicationProperties.getString(TEST_USER_NAME), ApplicationProperties.getString(TEST_USER_PASSWORD2));
    }

    @When("^Login - is displayed$")
    public void loginWalletIsDisplayed() throws Throwable {
        assertThat(loginPage.isPageDisplayed()).isTrue();
    }
}
