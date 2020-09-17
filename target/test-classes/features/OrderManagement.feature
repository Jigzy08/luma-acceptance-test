@orderManagement @SmokeTest
Feature: OrderManagement

  Background:
    Given Luma application is displayed successfully


  @addProduct
  Scenario Outline: Add product to basket
    When user moves mouse over Women and Tops and clicks Jackets
    And user clicks Juno Jacket
    And user also click Small and click Purple
    And user will also enter "<Qty>"
    And user clicks Add to Cart
    Then item is added to basket


    Examples:
      | Qty |
      | 2   |

  @deleteItem
  Scenario Outline: Delete item from cart
    When user moves mouse over Women and Tops and clicks Jackets
    And user clicks Juno Jacket
    And user also click Small and click Purple
    And user will also enter "<Qty>"
    And user clicks Add to Cart
    And user delete the item
    Then item should be removed from cart


    Examples:
      | Qty |
      | 2   |


  @CreateOrderGuest
  Scenario Outline: Create an Order as Guest
    When user moves mouse over Women and Tops and clicks Jackets
    And user clicks Juno Jacket
    And user also click Small and click Purple
    And user will also enter "<Qty>"
    And user clicks Add to Cart
    And user click Cart and click proceed to checkout
    And user then enters "<Email>" and "<FirstName>" and "<LastName>"
    And user also enter "<StreetAddress>" and "<City>" and "<State>" and "<PostalCode>"
    And user selects "<Country>" from dropdown
    And user selects shipping option
    And user click Next
    And user select payment method and click place order
    Then Order is placed


    Examples:
      | Qty | Email                 | FirstName | LastName | StreetAddress       | City       | State | PostalCode | Country |
      | 3   | philtilburn@gmail.com | Phil      | Tilburn  | 41 Rossendale Close | Farrenbone | Kent  | 12-345     | Poland  |

@createOrderRegisteredUser
  Scenario Outline: Create Order as Registered Customer
  When user is on the sign in page
  And user enter "<Email>" and "<Password>"
  And user click Sign in
  Then My Dashboard screen should display
  And user moves mouse over Women and Tops and clicks Jackets
  And user clicks Juno Jacket
  And user also click Small and click Purple
  And user will also enter "<Qty>"
  And user clicks Add to Cart
  And user click Cart and click proceed to checkout
  And user selects shipping option
  And user click Next
  And user select payment method and click place order
  Then Order is placed

  Examples:
    | Email                | Password  |Qty|
    | johnbodle7@gmail.com | Testing@1 |2  |

@viewOrder
  Scenario Outline:
  When user is on the sign in page
  And user enter "<Email>" and "<Password>"
  And user click Sign in
  Then My Dashboard screen should display
  And user click My orders
  And user click View Orders
  Then orders are displayed



  Examples:
    | Email                | Password  |
    | johnbodle7@gmail.com | Testing@1 |

@deleteItemPopUp
Scenario Outline: Delete item from cart
  When user moves mouse over Women and Tops and clicks Jackets
  And user clicks Juno Jacket
  And user also click Small and click Purple
  And user will also enter "<Qty>"
  And user clicks Add to Cart
  And user click cart button and delete button
  Then item should be removed from cart


  Examples:
    | Qty |
    | 2   |




















