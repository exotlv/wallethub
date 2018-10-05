package lv.vsikhvart.cucumber.pageobjects;

import lv.vsikhvart.cucumber.config.ApplicationProperties;
import lv.vsikhvart.cucumber.core.WebElementHelper;
import lv.vsikhvart.cucumber.enums.CategorySelector;
import lv.vsikhvart.cucumber.pageobjects.base.Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.APP_URL;
import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.APP_URL4;
import static org.junit.Assert.assertTrue;


public class WalletHub extends Page {

    @FindBy(css = ".reviewinfo[itemprop='aggregateRating']")
    private WebElement rating;

    @FindBy(xpath = "//a[@href='#'][contains(text(),'5')]")
    private WebElement rating2;

    @FindBy(css = ".wh-rating-choices")
    private WebElement info;

    @FindBy(css = ".dropdown-list-new")
    private WebElement dropdown;

    @FindBy(xpath= "//a[contains(text(),'Health')]")
    private WebElement healthSelector;

    @FindBy(xpath= "//textarea[@id='review-content']")
    private WebElement reviewField;

    @FindBy(xpath= "//div[@class='dropdown-title'] //span[contains(text(), 'Please select your policy')]")
    private WebElement validation;

    @FindBy(xpath= "//form[@id='reviewform']//div[@class='content']")
    private WebElement enableContent;

    @FindBy(xpath= "//input[@value='Submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//span[@id='overallRating']//a[5]")
    private WebElement fifthStar;

    @FindBy(xpath = "//div[@class='big-title small']//h1 [contains(text(), 'Awesome!')]")
    private WebElement confirmation;

    @FindBy(css = ".reviews")
    private WebElement reviews;

    public WalletHub() {
        wait.until(ExpectedConditions.visibilityOf(rating));
    }

    public void ratingHover() {
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector(".wh-rating.rating_4_5"));
        builder.moveToElement(element).build().perform();
        wait.until(ExpectedConditions.visibilityOf(rating2));
        builder.moveToElement(rating2).build().perform();
        WebElementHelper.click(rating2);
    }

    public void chooseHealth() {
        WebElementHelper.waitForVisibility(validation);
        WebElementHelper.click(dropdown);
        WebElementHelper.waitForVisibility(dropdown);
        WebElementHelper.waitForVisibility(healthSelector);
        WebElementHelper.click(healthSelector);
    }

    public void addReviewData(String text) {
        WebElementHelper.waitForVisibility(enableContent);
        WebElementHelper.waitForVisibility(fifthStar);
        WebElementHelper.click(fifthStar);
        WebElementHelper.click(reviewField);
        WebElementHelper.sendKeys(reviewField, text);
        WebElementHelper.click(submitBtn);
        WebElementHelper.waitForVisibility(confirmation);

    }

//        public Facebook chooseCategoryId(CategorySelector categorySelector) {
//      WebElementHelper.selectByValue(categorySelectors, categorySelector.toString());
//      return this;
//  }

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

