package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutPageSteps {
    @Then("I Verify the text “Checkout”")
    public void iVerifyTheTextCheckout() {
        Assert.assertTrue(new CheckoutPage().getTextOfCheckOutButton().contains("Checkout"));
    }

    @And("I Verify the Text “New Customer”")
    public void iVerifyTheTextNewCustomer() {
        Assert.assertEquals(new CheckoutPage().getTextOfNewCustomerText(), "New Customer","New customer not found");
    }

    @And("I Click on “Guest Checkout” radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new CheckoutPage().clickOnGuestCheckoutButton();
    }

    @And("I Click on “Continue” tab")
    public void iClickOnContinueTab() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("I Fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        new CheckoutPage().fillAllTheMandatoryField();
    }

    @And("I Click on “Continue” Button")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueButtonOnRegisterPage();
    }

    @And("I Add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new CheckoutPage().sendTextToCommentField("Order");
    }

    @And("I Check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new CheckoutPage().clickOnTermsAndConditionTextBox();
    }

    @And("I Verify the message “Warning: Payment method required!”")
    public void iVerifyTheMessageWarningPaymentMethodRequired() {
        Assert.assertEquals(new CheckoutPage().getTextOfWarningMessage().substring(0,33), "Warning: Payment method required!", "No warning Message");
    }

    @And("I Click on a “Continue” button")
    public void iClickOnAContinueButton() {
        new CheckoutPage().clickOnContinueButtonInPaymentMethodPage();
    }
}
