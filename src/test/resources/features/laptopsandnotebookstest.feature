Feature: Laptops and Notebooks Test
  In Order to perform successful Product add to Cart and Proceed to Checkout

  @smoke @regression
  Scenario: verifyProductsPriceDisplayHighToLowSuccessfully
    Given I am on home page
    When I hover mouse on LaptopsAndNotebooks tab and click
    And I call selectMenu method and pass the menu show All Laptops And Notebooks
    And I select sort by "Price (High > Low)"
    Then I Verify the Product price will arrange in High to Low order

  @sanity @regression
  Scenario: verifyThatUserPlaceOrderSuccessfully
    Given I am on home page
    When I hover mouse on LaptopsAndNotebooks tab and click
    And I call selectMenu method and pass the menu show All Laptops And Notebooks
    And I select sort by "Price (High > Low)"
    And I Select Product MacBook
    And I Verify the text MacBook
    And I click on Add to cart button
    And I Verify the message “Success: You have added MacBook to your shopping cart!”
    And I Click on link shopping cart display into success message
    And I Verify the text Shopping Cart
    And I Verify the Product name MacBook
    And I Change Quantity "2"
    And I Click on “Update” Tab
    And I Verify the message “Success: You have modified your shopping cart!”
    And I Click on “Checkout” button
    Then I Verify the text “Checkout”
    And I Verify the Text “New Customer”
    And I Click on “Guest Checkout” radio button
    And I Click on “Continue” tab
    And I Fill the mandatory fields
    And I Click on “Continue” Button
    And I Add Comments About your order into text area
    And I Check the Terms & Conditions check box
    And I Click on a “Continue” button
    And I Verify the message “Warning: Payment method required!”
