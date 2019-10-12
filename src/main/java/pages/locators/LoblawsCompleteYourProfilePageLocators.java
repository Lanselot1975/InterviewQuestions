package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoblawsCompleteYourProfilePageLocators {


    @FindBy(how= How.XPATH, using="//*[@class='text-center login-registration-page-heading']")
    public WebElement completeYourProfile;
}
