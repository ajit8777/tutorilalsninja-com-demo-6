package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.RegisterAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterAccountPageSteps {

    @Then("I should navigate to Register Account page.")
    public void iShouldNavigateToRegisterAccountPage() {
        Assert.assertEquals(new RegisterAccountPage().getTextOfRegisterAccountText(), "Register Account", "Not On Register Page");
    }

    @And("I Select Subscribe Yes radio button")
    public void iSelectSubscribeYesRadioButton() {
        new RegisterAccountPage().clickOnSubscribeToNewsletter();
    }

    @And("I Click on Privacy Policy check box")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterAccountPage().clickOnPrivacyPolicy();
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new RegisterAccountPage().clickOnContinueAfterAccountCreation();
    }

    @And("I Click on Continue button on Register page")
    public void iClickOnContinueButtonOnRegisterPage() {
        new RegisterAccountPage().clickOnContinueAfterPrivacyButton();
    }

    @And("I Enter First Name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterAccountPage().sendFirstName(firstName);
    }

    @And("I Enter Last Name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterAccountPage().sendLastName(lastName);
    }

    @And("I Enter Email {string}")
    public void iEnterEmail(String email) {
        new RegisterAccountPage().sendEmail(email);
    }

    @And("I Enter Telephone {string}")
    public void iEnterTelephone(String telephone) {
        new RegisterAccountPage().sendTelephone(telephone);
    }

    @And("I Enter Password {string}")
    public void iEnterPassword(String pass) {
        new RegisterAccountPage().sendPassword(pass);
    }

    @And("I Enter Password Confirm {string}")
    public void iEnterPasswordConfirm(String coPass) {
        new RegisterAccountPage().sendConfirmPassword(coPass);
    }
}
