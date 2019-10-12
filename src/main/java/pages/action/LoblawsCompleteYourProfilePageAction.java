package pages.action;

import pages.locators.LoblawsCompleteYourProfilePageLocators;
import pages.locators.LoblawsCreatePCIDPageLocators;

public class LoblawsCompleteYourProfilePageAction {
    LoblawsCompleteYourProfilePageLocators loblawsCompleteYourProfilePageLocators = null;
    public String verifyPageCompleteYourProfile() {
        return loblawsCompleteYourProfilePageLocators.completeYourProfile.getText();
    }
}
