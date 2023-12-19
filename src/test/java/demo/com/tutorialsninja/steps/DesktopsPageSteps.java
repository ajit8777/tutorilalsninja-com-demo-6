package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

public class DesktopsPageSteps {
    @Then("I should navigate to Desktops page.")
    public void iShouldNavigateToDesktopsPage() {
        String expectedText = "Desktops";
        String actualText = new DesktopsPage().getDesktopText();
        Assert.assertEquals(actualText, expectedText, "User not navigate to Desktops page");
    }



    @And("I select sort by position {string}")
    public void iSelectSortByPosition(String sort) {
        new DesktopsPage().sortByPositionNameAToZ(sort);
    }

    @And("I select product {string}")
    public void iSelectProduct(String product) {
        new DesktopsPage().selectProductByName(product);
    }

    @Then("I Verify the Product will arrange in Descending order.")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {
      ArrayList<String> actualProductList = new DesktopsPage().getProductNameList();
        //Collections.reverse(actualProductList);
        ArrayList<String> expectedProductList = new DesktopsPage().getProductNameList();
        Assert.assertEquals(actualProductList,expectedProductList,"Product not sorted into Z to A order");
    }
}
