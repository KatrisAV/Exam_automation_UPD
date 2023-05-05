Feature: Enter in account with valid and invalid credential

  As a user I want to log in on page and to check available products

  Scenario Outline: Login to the personal account
    Given the site page is opened
    When is opened modal menu named My Account and select log in
    And the users eneters correct <Email> and <Password>
    Then user is log in
    Examples:
      | Email | Password |
      |alena.catris@gmail.com| AsdLkj123|
      |test@mail.eu|abracadabra|

  Scenario: open the product via the quick preview on the page
    Given the site page is opened
    When  user is click on pop up button fast view on product
    And is opened additional window with product
    Then user close the aditional window

  Scenario: Check available products Apparel
    Given the site page is opened
    When click to available products
    Then apears list of avaliable products

  Scenario: Choose only Apparel for children
    Given the site page is opened
    When user chose in menu apparel childen
    Then the list of children apparel



 Scenario : Log out from personal account
   Given the user is logged in
   When is opened modal menu named My Account
   Then user is logged out
