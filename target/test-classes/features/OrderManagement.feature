@OrderManagement @SmokeTest
Feature: OrderManagement


  @AddProduct
  Scenario Outline: Add product to basket
    Given user is on home page
    And user move mouse over Women
    And user moves mouse over Tops
    And user click Jackets
    And user clicks Juno Jacket
    And user also click Small
    And user then click Purple
    And user enter "<Qty>"
    Then user clicks Add to Cart


    Examples:
    |Qty|
    |2  |



