Feature: Logged user new

  Scenario: Validate user able to login
    Given User navigate to login page
    When User successfully enters login credentials
    Then User able to view the dashboard