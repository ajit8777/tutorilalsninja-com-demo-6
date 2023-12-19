package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.LogoutPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class LogoutPageSteps {
    @And("I verify the text Account logout")
    public void iVerifyTheTextAccountLogout() {
        Assert.assertEquals(new LogoutPage().getTextFromLogout(), "Account Logout", "Account successfully not logout");
    }
}
