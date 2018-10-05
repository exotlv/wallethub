package lv.vsikhvart.cucumber.pageobjects;


import lv.vsikhvart.cucumber.config.ApplicationProperties;
import lv.vsikhvart.cucumber.core.WebElementHelper;
import lv.vsikhvart.cucumber.pageobjects.base.Page;

import static lv.vsikhvart.cucumber.config.ApplicationProperties.ApplicationProperty.APP_URL2;

public class WalletHubPage extends Page {

    public static WalletHubPage navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(APP_URL2));
        return new WalletHubPage();
    }



}
