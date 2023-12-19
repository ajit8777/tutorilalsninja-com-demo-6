package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksSteps {
    @Then("I should navigate to Laptops And Notebooks page.")
    public void iShouldNavigateToLaptopsAndNotebooksPage() {
        String expectedText = "Laptops & Notebooks";
        String actualText = new LaptopsAndNotebooksPage().getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText, expectedText, "User not navigate to Laptops & Notebooks page");
    }

    @And("I select sort by {string}")
    public void iSelectSortBy(String sortBy) {
        new LaptopsAndNotebooksPage().selectPriceHighToLow(sortBy);
    }

    @Then("I Verify the Product price will arrange in High to Low order")
    public void iVerifyTheProductPriceWillArrangeInHighToLowOrder() {
        // Get all the products price and stored into array list
        List<Double> originalProductsPrice = new LaptopsAndNotebooksPage().getProductsPriceList();
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        // Select sort by Price (High > Low)
        new LaptopsAndNotebooksPage().selectPriceHighToLow("Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        ArrayList<Double> afterSortByPrice = new LaptopsAndNotebooksPage().getProductsPriceList();
        Assert.assertEquals(originalProductsPrice, afterSortByPrice, "Product not sorted by price High to Low");
    }
}
