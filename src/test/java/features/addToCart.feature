Feature: Add to cart
  Scenario: Validate the user is able to add item in the cart
    Given User navigate to login page
    And User able to login
    When User click the add to cart of desire item
    Then It will display the remove button and will display the one item in the cart
