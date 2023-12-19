package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement productQty;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='shopping cart'])[1]")
    WebElement shoppingCartTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'content']//h1")
    WebElement productText;


    public void enterQuantity(String qty) {
        sendTextToElement(productQty, "1");
    }

   public String getProductNameText(){
      return   getTextFromElement(productText);
   }



    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getSuccessMessage() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartTab() {
        clickOnElement(shoppingCartTab);
    }


}

