package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.ComponentsPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ComponentsPageSteps {
    @Then("I should navigate to Components page.")
    public void iShouldNavigateToComponentsPage() {
        String expectedText = "Components";
        String actualText = new ComponentsPage().getComponentsText();
        Assert.assertEquals(actualText, expectedText, "User not navigate to Laptops & Notebooks page");
    }
}
