package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "email")
    WebElement email;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

 @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returnCustomerText;


 public String getReturnCustomerText(){
     return getTextFromElement(returnCustomerText);
 }
    public void sendEmail(String inputEmail) {
        sendTextToElement(email, inputEmail);
    }

    public void sendPassword(String inputPassword) {
        sendTextToElement(password, inputPassword);
    }

    public void clickOnLogin() {
        clickOnElement(loginButton);
    }

    public void fillLoginDetailsAndClickOnLoginButton() {

        sendEmail("iampatel@gmail.com");
        sendPassword("HelloNum1");
        clickOnLogin();
    }
}
