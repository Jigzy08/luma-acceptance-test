@CreateAccount
Feature: account management

  Scenario Outline: Create an Account
    Given user is on create account page
    When user enters "<FirstName>"
    And user enters the "<LastName>"
    And user enters an "<Email>"
    And user will enter "<Password>"
    And users also enter "<ConfirmPassword>"
    And user click on Create Account
    Then My Dashboard screen should be displayed






    Examples:
      | FirstName | LastName | Email               | Password  | ConfirmPassword |
      | John      | Bodle    | johnbodle@gmail.com | Testing@1 | Testing@1       |