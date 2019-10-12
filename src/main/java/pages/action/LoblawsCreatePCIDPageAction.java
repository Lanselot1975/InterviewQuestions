package pages.action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.LoblawsCreatePCIDPageLocators;
import pages.locators.LoblawsHomePageLocators;
import utils.SeleniumDriver;

public class LoblawsCreatePCIDPageAction {

    LoblawsCreatePCIDPageLocators loblawsCreatePCIDPageLocators = null;
    Actions action = new Actions(SeleniumDriver.getDriver());

    public LoblawsCreatePCIDPageAction() {

        this.loblawsCreatePCIDPageLocators = new LoblawsCreatePCIDPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), loblawsCreatePCIDPageLocators);
    }

    public void clickCreatePcId() {
        loblawsCreatePCIDPageLocators.createPCid.click();
    }

    public void enterEmail(){
        loblawsCreatePCIDPageLocators.enterEmail.sendKeys("test2sw@gmail.com");
    }
    public void enterPassword(){
        loblawsCreatePCIDPageLocators.enterPassword.sendKeys("!Q2w3e4r5t");

    }
    public void checkCheckBox(){

           loblawsCreatePCIDPageLocators.checkBox.click();
    }
    public void createApcID(){
        loblawsCreatePCIDPageLocators.createPCAPcId.click();
    }

}
