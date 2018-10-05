package lv.vsikhvart.cucumber.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lv.vsikhvart.cucumber.config.ApplicationProperties;
import lv.vsikhvart.cucumber.pageobjects.WalletLoginPage;

import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class WalletLoginSteps {
    private WalletLoginPage walletLoginPage;

    @Then("^Login - wallet user logs in$")
    public void userLogsInWithWalletHubCredentials() throws Throwable {
        walletLoginPage = new WalletLoginPage();
        walletLoginPage.login(ApplicationProperties.getString(TEST_USER_NAME), ApplicationProperties.getString(TEST_USER_PASSWORD2));
    }

    @When("^Wallet Login - is displayed$")
    public void WalletLoginIsDisplayed() throws Throwable {
        walletLoginPage = new WalletLoginPage();
        assertThat(walletLoginPage.isPageDisplayed()).isTrue();
    }
}
