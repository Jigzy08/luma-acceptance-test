@accountManagement
Feature: Account Management
  This feature is for customer account creation and account login

  Background:
    Given Luma application is displayed successfully


@createAccount @SanityTest
  Scenario Outline: Create an Account
    When user is on create account page
    And user enters "<FirstName>" and "<LastName>"
    And user enters an "<Email>"
    And user will enter "<Password>" and "<ConfirmPassword>"
    And user click on Create Account
    Then My Dashboard screen should be displayed


    Examples:
      | FirstName | LastName | Email               | Password  | ConfirmPassword |
      | John      | Bodle    | johnbodle5@gmail.com | Testing@1 | Testing@1       |


@logIn
  Scenario Outline: Account Login Registered Customer
    When user is on the sign in page
    And user enter "<Email>" and "<Password>"
    And user click Sign in
    Then My Dashboard screen should display


    Examples:
      | Email               | Password  |
      | johnbodle5@gmail.com | Testing@1 |



