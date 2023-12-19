package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginPageSteps {
    @Then("I should navigate to Login page.")
    public void iShouldNavigateToLoginPage() {
        Assert.assertEquals(new LoginPage().getReturnCustomerText(), "Returning Customer", "Login page not navigate");
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogin();
    }

    @And("I Enter an Email {string}")
    public void iEnterAnEmail(String email) {
        new LoginPage().sendEmail(email);
    }

    @And("I Enter a Password {string}")
    public void iEnterAPassword(String password) {
        new LoginPage().sendPassword(password);
    }

    @And("I click on a Login Button")
    public void iClickOnALoginButton() {
        new LoginPage().clickOnLogin();
    }
}
