package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class ShoppingCartPageSteps {


    @And("I Verify the text Shopping Cart")
    public void iVerifyTheTextShoppingCart() {
        new ShoppingCartPage().getTextOfShoppingCart();
    }

    @And("I Verify the Product name {string}")
    public void iVerifyTheProductName(String productName) {
        Assert.assertTrue(new ShoppingCartPage().getProductText().contains(productName), "Product name not matching");
    }

    @And("I Verify the Model {string}")
    public void iVerifyTheModel(String modelName) {
       Assert.assertTrue(new ShoppingCartPage().getModelText().contains(modelName), "Model name not matched");
    }


    @And("I Verify the Total {string}")
    public void iVerifyTheTotal(String total) {
        Assert.assertTrue(new ShoppingCartPage().getTotalText().contains(total), "Total price not matching");
    }
//
//    @And("I {int} Verify the text {string}")
//    public void iVerifyTheText(int arg0, String arg1) {
//    }

    @And("I Verify the Product name MacBook")
    public void iVerifyTheProductNameMacBook() {
        Assert.assertEquals(new ShoppingCartPage().getTextOfShoppingCart().substring(0,13), "Shopping Cart", "product not added");
    }

    @And("I Change Quantity {string}")
    public void iChangeQuantity(String qty) {
        new ShoppingCartPage().changeProductQtyTo2(qty);
    }

    @And("I Click on “Update” Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateButton();
    }

    @And("I Verify the message “Success: You have modified your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertTrue(new ShoppingCartPage().getTextOfModifiedShoppingCartText().contains("Success: You have modified your shopping cart!"));
    }
//
//    @And("I Verify the Total £{double}")
//    public void iVerifyTheTotal£(int arg0, int arg1) {
//
//    }

    @And("I Click on “Checkout” button")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }
}
