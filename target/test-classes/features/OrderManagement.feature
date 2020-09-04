@OrderManagement @SmokeTest
Feature: OrderManagement

  Background:
    Given user has launched Luma application successfully


  @AddProduct
  Scenario Outline: Add product to basket
    When user moves mouse over Women and Tops and clicks Jackets
    And user clicks Juno Jacket
    And user also click Small and click Purple
    And user will also enter "<Qty>"
    And user clicks Add to Cart
    Then item is added to basket


    Examples:
    |Qty|
    |2  |

    @DeleteItemFromCart
    Scenario Outline: Delete item from Cart
      When user click on cart and click on view and edit cart
      And user click remove item button
      Then item should be removed from cart



