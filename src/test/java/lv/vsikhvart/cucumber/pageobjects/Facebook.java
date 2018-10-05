package lv.vsikhvart.cucumber.pageobjects;


import lv.vsikhvart.cucumber.core.WebElementHelper;
import lv.vsikhvart.cucumber.enums.CategorySelector;
import lv.vsikhvart.cucumber.pageobjects.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static lv.vsikhvart.cucumber.config.Constants.WAIT_LONG_SECONDS;

public class Facebook extends Page {

    @FindBy(css = "[name='email']")
    private WebElement login;

    @FindBy(css = "[data-testid='status-attachment-mentions-input']")
    private WebElement statusField;

    @FindBy(css = "[data-testid='react-composer-post-button']")
    private WebElement postButton;

    @FindBy(css = "[title='Profile']")
    private WebElement profileIcon;

    @FindBy(css = ".hasLeftCol")
    private WebElement clickOnPage;

    public Facebook() {
        wait.until(ExpectedConditions.visibilityOf(login));
    }

    public void checkMenu() {
        WebElementHelper.waitForVisibility(login);
    }

    public void statusField (String text) throws InterruptedException {
        WebElementHelper.click(clickOnPage);
        WebElementHelper.waitForVisibility(profileIcon);
        WebElementHelper.click(profileIcon);
        WebElementHelper.waitForVisibility(statusField);
        WebElementHelper.click(statusField);
        WebElementHelper.sendKeys(statusField, text);
        WebElementHelper.waitForVisibility(By.cssSelector("[data-testid='react-composer-post-button']"), WAIT_LONG_SECONDS);
        WebElementHelper.waitForElementToBeClickable(postButton);
        WebElementHelper.click(postButton);
        WebElementHelper.waitForVisibility(By.cssSelector("[title='Profile']"), WAIT_LONG_SECONDS);
        Thread.sleep(10000);
        WebElementHelper.click(By.cssSelector("[title='Profile']"), WAIT_LONG_SECONDS);
//        WebElementHelper.waitForElementToBeClickable(profileIcon);
//        WebElementHelper.scrollToCenterOfScreen(profileIcon);
//        WebElementHelper.click(profileIcon);
    }

//    public void budgetGrid() {
//      wait.until(ExpectedConditions.visibilityOf(budgetGrid));
//      WebElementHelper.waitForVisibility(category);
//      WebElementHelper.waitForVisibility(description);
//      WebElementHelper.waitForVisibility(amount);
//  }
//
//    public void balanceContainer() {
//      wait.until(ExpectedConditions.visibilityOf(balanceContainer));
//      WebElementHelper.waitForVisibility(inflow);
//      WebElementHelper.waitForVisibility(outflow);
//      WebElementHelper.waitForVisibility(workingBalance);
//  }
//
//    public void activeFields() {
//      wait.until(ExpectedConditions.visibilityOf(budgetGrid));
//      WebElementHelper.waitForVisibility(categorySelectors);
//      WebElementHelper.waitForVisibility(descriptionField);
//      WebElementHelper.waitForVisibility(valueField);
//  }
//
//    public void chooseCategoryField () {
//      WebElementHelper.waitForVisibility(categorySelectors);
//      WebElementHelper.click(categorySelectors);
//    }
//
//
//    public void valueField (String value) {
//      WebElementHelper.waitForVisibility(valueField);
//      WebElementHelper.click(valueField);
//      WebElementHelper.sendKeys(valueField, value);
//  }
//
//    public void clickAddButton () {
//      WebElementHelper.waitForVisibility(addButton);
//      WebElementHelper.waitForElementToBeClickable(addButton);
//      WebElementHelper.click(addButton);
//  }
//
//    public Facebook chooseCategoryId(CategorySelector categorySelector) {
//      WebElementHelper.selectByValue(categorySelectors, categorySelector.toString());
//      return this;
//  }
//
//    public String getTotalInflow () {
//      return WebElementHelper.getText(inflowSum);
//    }
}
