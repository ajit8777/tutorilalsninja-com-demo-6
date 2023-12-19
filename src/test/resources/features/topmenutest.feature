Feature: TopMenu Test
  In Order to perform successful navigate to TopMenu page


  @smoke @regression
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on home page
    And I hover mouse on Desktops tab and click
    And I call selectMenu method and pass the menu show AllDesktops
    Then I should navigate to Desktops page.

  @sanity @regression
  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given I am on home page
    And I hover mouse on LaptopsAndNotebooks tab and click
    And I call selectMenu method and pass the menu show All Laptops And Notebooks
    Then I should navigate to Laptops And Notebooks page.

  @regression
  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given I am on home page
    And I hover mouse on Components tab and click
    And I call selectMenu method and pass the menu show AllComponents
    Then I should navigate to Components page.