package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreatePage extends Utility {

    @CacheLookup
            @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreationText;
    @CacheLookup
            @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueAfterAccountCreation;

    public String getAccountCreationMessage(){
        return getTextFromElement(accountCreationText);

    }

    public void clickOnContinueAfterAccountCreation(){
        clickOnElement(continueAfterAccountCreation);
    }
}
