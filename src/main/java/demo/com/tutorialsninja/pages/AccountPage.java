package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    @CacheLookup
            @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement continueAfterLogout;
    @CacheLookup
            @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccountText;
    @CacheLookup
            @FindBy(xpath = "//a[@title='My Account']")
    WebElement myAccountLink;

    public void clickOnContinueAfterLogout() {
        clickOnElement(continueAfterLogout);
    }

    public String getMyAccountText() {
        return getTextFromElement(myAccountText);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }
}
