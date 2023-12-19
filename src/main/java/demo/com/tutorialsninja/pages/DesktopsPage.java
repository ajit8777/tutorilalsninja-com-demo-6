package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    private static final Utility utility = new Utility();

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "//img[@title='HTC Touch HD']")
    WebElement HTCTouchHD;

    @CacheLookup
    @FindBy(linkText = "iPhone")
    WebElement iPhone;

    @CacheLookup
    @FindBy(linkText = "Palm Treo Pro")
    WebElement PalmTreoPro;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopsText;

    public ArrayList<String> getProductNameList(){
        List<WebElement> products = productsList;
        ArrayList<String> originalProductName = new ArrayList<>();
        for (WebElement e : products){
            originalProductName.add(e.getText());
        }
        return originalProductName;

    }

    public void selectProductByName(String product){
              List<WebElement> products = webElementList(By.xpath("//h4/a"));
        for (WebElement e : products){
            if (e.getText().equals(product)){
                e.click();
                break;
            }
        }

    }

    public String getDesktopText() {
        return getTextFromElement(desktopsText);
    }

    public void selectSortByOption(String option){
        selectByVisibleTextFromDropDown(sortBy, option);
    }

    public void sortByPositionNameAToZ(String text) {
        selectByVisibleTextFromDropDown(sortByDropdown, text);
    }


}
