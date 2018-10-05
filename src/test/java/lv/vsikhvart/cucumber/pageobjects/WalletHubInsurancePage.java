package lv.vsikhvart.cucumber.pageobjects;


import lv.vsikhvart.cucumber.config.ApplicationProperties;
import lv.vsikhvart.cucumber.core.WebElementHelper;
import lv.vsikhvart.cucumber.pageobjects.base.Page;

import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.APP_URL2;
import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.APP_URL3;

public class WalletHubInsurancePage extends Page {

    public static WalletHubInsurancePage navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(APP_URL3));
        return new WalletHubInsurancePage();
    }



}
