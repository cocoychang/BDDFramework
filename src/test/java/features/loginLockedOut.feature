Feature: user is locked

  Scenario: Validate the locked user
    Given User navigate to login page
    When User unable to login
    Then Error message is appeared