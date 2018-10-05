package lv.vsikhvart.cucumber.pageobjects;

import lv.vsikhvart.cucumber.config.ApplicationProperties;
import lv.vsikhvart.cucumber.core.WebElementHelper;
import lv.vsikhvart.cucumber.pageobjects.base.Page;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.APP_URL4;


public class WalletProfilePage extends Page {

    @FindBy(css = ".reviews")
    private WebElement reviews;

    public WalletProfilePage() {
        wait.until(ExpectedConditions.visibilityOf(reviews));
    }

    public static WalletProfilePage navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(APP_URL4));
        return new WalletProfilePage();
    }

    public void checkReviewData(String text) {
        WebElementHelper.waitForVisibility(reviews);
        Assert.assertTrue(text.contains("Lorem"));
    }

}
