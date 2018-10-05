package lv.vsikhvart.cucumber.pageobjects;

import lv.vsikhvart.cucumber.core.WebElementHelper;
import lv.vsikhvart.cucumber.pageobjects.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static lv.vsikhvart.cucumber.config.Constants.WAIT_NORMAL_SECONDS;

public class LoginPage extends Page {

    @FindBy(css = "[name='email']")
    private WebElement inptUserName;

    @FindBy(css = "[name='pass']")
    private WebElement inptPassword;

    @FindBy(css = "[id='loginbutton']")
    private WebElement btnLogin;

    public LoginPage() {
        wait.until(ExpectedConditions.visibilityOf(inptUserName));
    }

    public void login(String userName, String password) {
        WebElementHelper.sendKeys(inptUserName, userName);
        WebElementHelper.sendKeys(inptPassword, password);
        WebElementHelper.scrollToCenterOfScreen(btnLogin);
        WebElementHelper.click(btnLogin);
        // wait until you will be logged in
        WebElementHelper.waitForVisibility(By.cssSelector("[title='Profile']"), WAIT_NORMAL_SECONDS);
    }


    public boolean isPageDisplayed() {
        return WebElementHelper.isElementDisplayed(inptUserName);
    }

}
