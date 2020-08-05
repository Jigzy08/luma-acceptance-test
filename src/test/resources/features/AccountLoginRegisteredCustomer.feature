@AccountLogin
Feature: Account Management


  Scenario Outline: Account Login Registered Customer
    Given user is on the sign in page
    When user enter "<Email>"
    And user also enter "<Password>"
    And user click Sign in
    Then My Dashboard screen should display



    Examples:
      | Email               | Password  |
      | johnbodle@gmail.com | Testing@1 |