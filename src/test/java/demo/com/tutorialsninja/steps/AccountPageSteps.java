package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.AccountCreatePage;
import demo.com.tutorialsninja.pages.AccountPage;
import demo.com.tutorialsninja.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AccountPageSteps {

    @And("I click on continue Button")
    public void iClickOnContinueButton() {
        new LogoutPage().clickOnContinueButton();
    }

    @Then("I Verify the message Your Account Has Been Created!")
    public void iVerifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new AccountCreatePage().getAccountCreationMessage(), "Your Account Has Been Created!", "Account not created");

    }

    @Then("I verify text My Account")
    public void iVerifyTextMyAccount() {
        Assert.assertEquals(new AccountPage().getMyAccountText(), "My Account", "Not on my account");
    }
}
