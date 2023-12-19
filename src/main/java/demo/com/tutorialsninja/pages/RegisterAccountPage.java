package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement registerAccountText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='well']/h2[text()='Returning Customer']")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(name = "email")
    WebElement email;
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(name = "confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(name = "newsletter")
    WebElement newsletter;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicy;

    @CacheLookup
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueAfterPrivacyButton;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueAfterAccountCreation;

    public String getTextOfRegisterAccountText() {
        return getTextFromElement(registerAccountText);
    }

    public String getTextOfReturningCustomerText() {
        return getTextFromElement(returningCustomerText);
    }

    public void sendFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
    }

    public void sendEmail(String text) {

        sendTextToElement(email, text);
    }

    public void sendTelephone(String inputTelephone) {
        sendTextToElement(telephone, inputTelephone);
    }

    public void sendPassword(String inputPassword) {
        sendTextToElement(password, inputPassword);
    }

    public void sendConfirmPassword(String inputConfirmPassword) {
        sendTextToElement(confirmPassword, inputConfirmPassword);
    }

    public void clickOnSubscribeToNewsletter() {
        clickOnElement(newsletter);
    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueAfterPrivacyButton() {
        clickOnElement(continueAfterPrivacyButton);
    }

    public void fillAllFieldAndClickOnContinueButton() {
        sendFirstName("Tesco");
        sendLastName("Extra");
        sendEmail("Tesco");
        sendTelephone("07896541230");
        sendPassword("Tesco1234");
        sendConfirmPassword("Tesco1234");
        clickOnSubscribeToNewsletter();
        clickOnPrivacyPolicy();
        clickOnContinueAfterPrivacyButton();
    }

    public void clickOnContinueAfterAccountCreation(){
        clickOnElement(continueAfterAccountCreation);
    }
}
