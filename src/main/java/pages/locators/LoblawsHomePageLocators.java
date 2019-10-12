package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoblawsHomePageLocators {
    @FindBy(how= How.XPATH, using="//*[@class='primary-nav__list__item__link__text'][contains(text(),'My Shop')]")
    public WebElement myShop;

    @FindBy(how= How.XPATH, using="//*[contains(text(),'Sign In')]")
    public WebElement signIn;
}
