package lv.vsikhvart.cucumber.pageobjects;

import lv.vsikhvart.cucumber.core.WebElementHelper;
import lv.vsikhvart.cucumber.pageobjects.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static lv.vsikhvart.cucumber.config.Constants.WAIT_NORMAL_SECONDS;

public class WalletLoginPage extends Page {

    @FindBy(css = "[name='em']")
    private WebElement inptUserName;

    @FindBy(css = "[name='pw']")
    private WebElement inptPassword;

    @FindBy(css = ".btn.blue")
    private WebElement btnLogin;

    public WalletLoginPage() {
        wait.until(ExpectedConditions.visibilityOf(inptUserName));
    }


    public void login(String userName, String password) {
        WebElementHelper.sendKeys(inptUserName, userName);
        WebElementHelper.sendKeys(inptPassword, password);
        WebElementHelper.scrollToCenterOfScreen(btnLogin);
        WebElementHelper.click(btnLogin);
        // wait until you will be logged in
        WebElementHelper.waitForVisibility(By.cssSelector(".mywallet"), WAIT_NORMAL_SECONDS);
    }

    public boolean isPageDisplayed() {
        return WebElementHelper.isElementDisplayed(inptUserName);
    }

}
