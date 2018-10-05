package lv.vsikhvart.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lv.vsikhvart.cucumber.config.ApplicationProperties;
import lv.vsikhvart.cucumber.enums.CategorySelector;
import lv.vsikhvart.cucumber.pageobjects.*;
import lv.vsikhvart.cucumber.util.TestDataContext;

import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.TEST_DATA;
import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.TEST_DATA2;

public class CommonSteps {
    private FacebookPage FacebookPage;
    private Facebook facebook;
    private WalletHubPage Wallethubpage;
    private WalletHub walletHub;
    private WalletProfilePage walletProfile;
    private WalletHubInsurancePage walletHubInsurancePage;
    private TestDataContext testDataContext = TestDataContext.getInstance();

    @Given("^open Facebook webpage$")
    public void openFacebookPage() throws Throwable {
      FacebookPage = FacebookPage.navigate();
    }

    @Given("^open WalletHub webpage$")
    public void openWalletHubPage() throws Throwable {
        Wallethubpage = Wallethubpage.navigate();
    }

    @Then("^open WalletHub insurance webpage$")
    public void openWalletHubInsurancePage() throws Throwable {
        walletHubInsurancePage = walletHubInsurancePage.navigate();
    }

    @When("^page is loaded - check navigation menu$")
    public void pageNavigationbuttons() throws Throwable {
        facebook = new Facebook();
        facebook.checkMenu();
    }

    @When("^check rating hover on page for number 5$")
    public void checkRatingHoverOnPage() throws Throwable {
        walletHub = new WalletHub();
        walletHub.ratingHover();
    }

        @And("^click on status field and enter \"Hello World\"$")
    public void clickStatusFieldAndEnterText() throws Throwable {
        facebook.statusField(ApplicationProperties.getString(TEST_DATA));
    }

    @When("^choose Health from Policy dropdown$")
    public void chooseHealthFromPolicyDropdown() throws Throwable {
        walletHub.chooseHealth();
    }

    @And("^add random text with min 200 characters$")
    public void addReviewData() throws Throwable {
        walletHub.addReviewData(ApplicationProperties.getString(TEST_DATA2));
    }

    @And("^then open Reviews page in profile and check entered text$")
    public void checkReviewData() throws Throwable {
        walletProfile = WalletProfilePage.navigate();
        walletProfile = new WalletProfilePage();
        walletProfile.checkReviewData(ApplicationProperties.getString(TEST_DATA2));
    }
//
//    @And("^open Reports page$")
//    public void openReportsPage() throws Throwable {
//        reports = new Reports();
//        reports.reportsPage();
//    }
//
//    @And("^check that Reports page contain 2 Panels$")
//    public void checkReportspageforTwoPanels() throws Throwable {
//        reports.reportsPagePanels();
//  }
//
//    @And("^check that Budget grid exist and contains 3 elements$")
//    public void navigationUserLogsOut() throws Throwable {
//        budget.budgetGrid();
//    }
//
//    @And("^check Balance Container$")
//    public void checkBalanceContainer() throws Throwable {
//        budget.balanceContainer();
//    }
//
//    @And("^check active fields for adding in budget changes$")
//    public void checkActiveFields() throws Throwable {
//        budget.activeFields();
//    }
//
//    @And("^click on category selector and choose inflow category (Income|Outcome)$")
//    public void chooseInflowCategory(String categoryId) throws Throwable {
//        budget.chooseCategoryId(CategorySelector.valueOf(categoryId));
//
//    }
//
//    @And("^click on category field$")
//    public void chooseCategoryField() throws Throwable {
//        budget.chooseCategoryField();
//        budget = new Budget();
//
//    }
//
//    @And("^click on description field and enter \"Test\"$")
//    public void clickDescriptionFieldAndEnterText() throws Throwable {
//        budget.descriptionField(ApplicationProperties.getString(TEST_DATA));
//
//    }
//
//    @And("^enter value 100$")
//    public void enterValueHundred() throws Throwable {
//        budget.valueField(ApplicationProperties.getString(VALUE_DATA));
//
//  }
//    @And("^click on Add button$")
//    public void clickAddButton() throws Throwable {
//        budget.clickAddButton();
//
//  }
//
//    @And("^store Total Inflow sum$")
//    public void storeTotalInflow(String totalInflow) throws Throwable {
//        String inflowSum = budget.getTotalInflow();
//        testDataContext.getTestDataMap().put(totalInflow, () -> inflowSum);
//
//  }
}
