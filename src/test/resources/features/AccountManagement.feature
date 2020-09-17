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
      | FirstName | LastName | Email                | Password  | ConfirmPassword |
      | John      | Bodle    | johnbodle7@gmail.com | Testing@1 | Testing@1       |


  @logIn
  Scenario Outline: Account Login Registered Customer
    When user is on the sign in page
    And user enter "<Email>" and "<Password>"
    And user click Sign in
    Then My Dashboard screen should display


    Examples:
      | Email                | Password  |
      | johnbodle7@gmail.com | Testing@1 |

  @AddAddress
  Scenario Outline: Add new Address for Registered Customer
    When user is on the sign in page
    And user enter "<Email>" and "<Password>"
    And user click Sign in
    And My Dashboard screen should display
    And user click Manage Addresses
    And user enter "<StreetAddress>" and "<City>" and "<State>" and "<Postcode>" and "<PhoneNumber>"
    And user select country from dropdown
    And user click Save Address button
    Then Address should be updated


    Examples:
      | Email                | Password  | StreetAddress  | City      | State | Postcode | PhoneNumber |
      | johnbodle7@gmail.com | Testing@1 | 56 Ariel close | Lemington | Basel | 23-345   | 08765379203 |
