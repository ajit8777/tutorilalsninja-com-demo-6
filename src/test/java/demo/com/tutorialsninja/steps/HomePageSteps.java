package demo.com.tutorialsninja.steps;

import demo.com.tutorialsninja.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @And("I hover mouse on Desktops tab and click")
    public void iHoverMouseOnDesktopsTabAndClick() {
        new HomePage().mouseHoverAndClickOnDesktop();
    }

    @And("I call selectMenu method and pass the menu {string}")
    public void iCallSelectMenuMethodAndPassTheMenu() {
        new HomePage().clickOnDesktopShowAllDesktops();
    }

    @And("I call selectMenu method and pass the menu show AllDesktops")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllDesktops() {
        new HomePage().clickOnDesktopShowAllDesktops();
    }

    @And("I hover mouse on LaptopsAndNotebooks tab and click")
    public void iHoverMouseOnLaptopsAndNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I call selectMenu method and pass the menu show All Laptops And Notebooks")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllLaptopsAndNotebooks() {
        new HomePage().clickOnShowAllLaptopsAndNoteBooksAndClick();
    }

    @And("I hover mouse on Components tab and click")
    public void iHoverMouseOnComponentsTabAndClick() {
        new HomePage().clickOnComponents();
    }

    @And("I call selectMenu method and pass the menu show AllComponents")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllComponents() {
        new HomePage().clickOnShowAllComponents();
    }

    @And("I hover mouse on Currency Dropdown and click")
    public void iHoverMouseOnCurrencyDropdownAndClick() {
        new HomePage().mouseHoverCurrencyTabAndClick();
    }

    @And("I hover mouse on £Pound Sterling and click")
    public void iHoverMouseOn£PoundSterlingAndClick() {
        new HomePage().selectCurrency();
    }

    @And("I click on show AllDesktops")
    public void iClickOnShowAllDesktops() {
        new HomePage().clickOnDesktopShowAllDesktops();
    }

    @And("I click on My Account link")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccountLink();
    }

    @And("I called selectMyAccountOptions method and pass parameter {string}")
    public void iCalledSelectMyAccountOptionsMethodAndPassParameter(String link) {
        new HomePage().selectMyAccountOptions(link);
    }
}
