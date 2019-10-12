package pages.action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.LoblawsHomePageLocators;
import utils.SeleniumDriver;

public class LoblawsHomePageAction {
    LoblawsHomePageLocators loblawsHomePageLocators = null;
    Actions action = new Actions(SeleniumDriver.getDriver());
    public LoblawsHomePageAction(){
        this.loblawsHomePageLocators = new LoblawsHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), loblawsHomePageLocators);
    }

    public void clickMyShop(){
        loblawsHomePageLocators.myShop.click();
    }

    public void clickSignIn(){
        loblawsHomePageLocators.signIn.click();
    }
}
