Feature: MyAccount Test
  In Order to perform successful Register, Login and Logout on Myaccount link.
  As a User
  I have to enter correct username and password

  @smoke @regression@sanity
  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on home page
    And I click on My Account link
    And I called selectMyAccountOptions method and pass parameter "Register"
    Then I should navigate to Register Account page.

  @sanity @regression
  Scenario: verifyUserShouldNavigateToLoginPageSuccessfully
    Given I am on home page
    And I click on My Account link
    And I called selectMyAccountOptions method and pass parameter "Login"
    Then I should navigate to Login page.

  @regression
  Scenario: verifyThatUserRegisterAccountSuccessfully
    Given I am on home page
    When I click on My Account link
    And I called selectMyAccountOptions method and pass parameter "Register"
    And I Enter First Name "Tesco"
    And I Enter Last Name "Extra"
    And I Enter Email "tescoextra917@gmail.com"
    And I Enter Telephone "08008527895"
    And I Enter Password "Tesco999"
    And I Enter Password Confirm "Tesco999"
    And I Select Subscribe Yes radio button
    And I Click on Privacy Policy check box
    And I Click on Continue button on Register page
    Then I Verify the message Your Account Has Been Created!
    And I Click on Continue button
    And I click on My Account link
    And I called selectMyAccountOptions method and pass parameter "Logout"
    And I verify the text Account logout
    And I click on continue Button

  @regression
  Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
    Given I am on home page
    When I click on My Account link
    And I called selectMyAccountOptions method and pass parameter "Login"
    And I Enter an Email "tescoextra917@gmail.com"
    And I Enter a Password "Tesco999"
    And I click on a Login Button
    Then I verify text My Account
    And I called selectMyAccountOptions method and pass parameter "Logout"
    And I verify the text Account logout
    And I click on continue Button


