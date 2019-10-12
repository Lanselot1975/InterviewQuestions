package testcases;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.action.LoblawsCompleteYourProfilePageAction;
import pages.action.LoblawsCreatePCIDPageAction;
import pages.action.LoblawsHomePageAction;
import pages.locators.LoblawsCreatePCIDPageLocators;
import utils.SeleniumDriver;

public class UITesting {


    @BeforeTest()
    public void setUp(){

        SeleniumDriver.setDriver("chrome");
        SeleniumDriver.openPage("https://www.loblaws.ca");

    }

    @Test
    public void cretePCId() throws InterruptedException {
        LoblawsHomePageAction loblawsHomePageAction = new LoblawsHomePageAction();
        LoblawsCreatePCIDPageAction loblawsCreatePCIDPageAction = new LoblawsCreatePCIDPageAction();
        LoblawsCompleteYourProfilePageAction loblawsCompleteYourProfilePageAction = new LoblawsCompleteYourProfilePageAction();
        loblawsHomePageAction.clickMyShop();
        loblawsHomePageAction.clickSignIn();

        loblawsCreatePCIDPageAction.clickCreatePcId();
        Thread.sleep(1000);
        loblawsCreatePCIDPageAction.enterEmail();
        Thread.sleep(1000);
        loblawsCreatePCIDPageAction.enterPassword();
        Thread.sleep(1000);
        loblawsCreatePCIDPageAction.checkCheckBox();
        Thread.sleep(1000);
        loblawsCreatePCIDPageAction.createApcID();
        Thread.sleep(2000);
        Assert.assertEquals(loblawsCompleteYourProfilePageAction.verifyPageCompleteYourProfile(),"Complete Your Profile");
    }

    @AfterTest
    public void tearDown(){
        SeleniumDriver.tearDown();
    }
}
