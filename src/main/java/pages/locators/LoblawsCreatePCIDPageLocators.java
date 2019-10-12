package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoblawsCreatePCIDPageLocators {

    @FindBy(how= How.XPATH, using="//*[contains(text(),'Create a')]")
    public WebElement createPCid;

    @FindBy(how= How.XPATH, using="//*[@id='email']")
    public WebElement enterEmail;

    @FindBy(how= How.XPATH, using="//*[@id='newPassword']")
    public WebElement enterPassword;

    @FindBy(how= How.XPATH, using="//div[@class='checkbox-group__input-wrapper']")
    public WebElement checkBox;

    @FindBy(how= How.XPATH, using="//button[@class='button button--block button--submit button--theme-base button--theme-dark submit-button']")
    public WebElement createPCAPcId;


    //h2[@class='text-center login-registration-page-heading']
}
