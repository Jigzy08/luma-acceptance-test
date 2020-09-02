@accountManagement
Feature: Account Management
  This feature is for customer account creation and account login

@createAccount @SanityTest
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
      | John      | Bodle    | johnbodle2@gmail.com | Testing@1 | Testing@1       |


@logIn
  Scenario Outline: Account Login Registered Customer
    Given user is on the sign in page
    When user enter "<Email>"
    And user also enter "<Password>"
    And user click Sign in
    Then My Dashboard screen should display


    Examples:
      | Email               | Password  |
      | johnbodle2@gmail.com | Testing@1 |



