Feature: Desktops Test
  In Order to perform successful product add to cart and verify product Name, Model and Price


  @smoke @regression
Scenario: verifyProductArrangeInAlphaBaticalOrder
  Given I am on home page
  And I hover mouse on Desktops tab and click
  And I call selectMenu method and pass the menu show AllDesktops
  And I select sort by position "Name (Z - A)"
  Then I Verify the Product will arrange in Descending order.

  @sanity @regression
  Scenario Outline: verifyProductAddedToShoppingCartSuccessFully
    Given I am on home page
    And I hover mouse on Currency Dropdown and click
    And I hover mouse on £Pound Sterling and click
    And I hover mouse on Desktops tab and click
    And I click on show AllDesktops
    And I select sort by position "Name (A - Z)"
    And I select product "<product>"
    And I verify the text "<product>"
    And I enter Qty using select class
    And I click on Add to cart
    And I verify message Success: You have added "<product>" to your shopping cart!
    And I click on shopping cart link
    And I Verify the text Shopping Cart
    And I Verify the Product name "<product>"
    And I Verify the Model "<model>"
    And I Verify the Total "<price>"

    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |

