package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import demo.com.tutorialsninja.pages.MacBookPage;
import demo.com.tutorialsninja.pages.ProductPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class ProductPageSteps {
    @And("I verify the text {string}")
    public void iVerifyTheText(String productText) {
        Assert.assertEquals(new ProductPage().getProductNameText(),productText,"Product name not matching");
    }

    @And("I click on Add to cart")
    public void iClickOnAddToCart() {
        new ProductPage().clickOnAddToCart();
    }



//    @And("I verify message Success: You have added {String} to your shopping cart!")
//    public void iVerifyMessageSuccessYouHaveAddedProductToYourShoppingCart(String product) {
//        Assert.assertEquals(new ProductPage().getSuccessMessage(), product, "Product name not displayed");
//    }


    @And("I click on shopping cart link")
    public void iClickOnShoppingCartLink() {
        new ProductPage().clickOnShoppingCartTab();
    }


    @And("I enter Qty using select class")
    public void iEnterQtyUsingSelectClass() {
        new ProductPage().enterQuantity("1");
    }

    @And("I verify message Success: You have added {string} to your shopping cart!")
    public void iVerifyMessageSuccessYouHaveAddedToYourShoppingCart(String productName) {
        Assert.assertTrue(new ProductPage().getSuccessMessage().contains("Success: You have added " + productName + " to your shopping cart!"));
    }

    @And("I Select Product MacBook")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().selectMacBookProduct();
    }

    @And("I Verify the text MacBook")
    public void iVerifyTheTextMacBook() {
        Assert.assertEquals(new MacBookPage().getMacBookText(), "MacBook", "MacBook Product not display");
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() {
        new MacBookPage().clickOnAddToCartButton();
    }

    @And("I Verify the message “Success: You have added MacBook to your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new MacBookPage().getTextOfProductSuccessfullyAdd().substring(0,54), "Success: You have added MacBook to your shopping cart!", "Product not added to cart");
    }

    @And("I Click on link shopping cart display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new MacBookPage().clickOnShoppingCart();

    }
}
