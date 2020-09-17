$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrderManagement.feature");
formatter.feature({
  "line": 2,
  "name": "OrderManagement",
  "description": "",
  "id": "ordermanagement",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@orderManagement"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Delete item from cart",
  "description": "",
  "id": "ordermanagement;delete-item-from-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@deleteItem"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user moves mouse over Women and Tops and clicks Jackets",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user clicks Juno Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user also click Small and click Purple",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user will also enter \"\u003cQty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user clicks Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user delete the item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "item should be removed from cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "ordermanagement;delete-item-from-cart;",
  "rows": [
    {
      "cells": [
        "Qty"
      ],
      "line": 34,
      "id": "ordermanagement;delete-item-from-cart;;1"
    },
    {
      "cells": [
        "2"
      ],
      "line": 35,
      "id": "ordermanagement;delete-item-from-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7154938100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Luma application is displayed successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountManagementSteps.lumaApplicationIsDisplayedSuccessfully()"
});
formatter.result({
  "duration": 184959600,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Delete item from cart",
  "description": "",
  "id": "ordermanagement;delete-item-from-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@orderManagement"
    },
    {
      "line": 22,
      "name": "@deleteItem"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user moves mouse over Women and Tops and clicks Jackets",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user clicks Juno Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user also click Small and click Purple",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user will also enter \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user clicks Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user delete the item",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "item should be removed from cart",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderManagementSteps.userMovesMouseOverWomenAndTopsAndClicksJackets()"
});
formatter.result({
  "duration": 15900096200,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.userClicksJunoJacket()"
});
formatter.result({
  "duration": 380738100,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.userAlsoClickSmallAndClickPurple()"
});
formatter.result({
  "duration": 811608600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "OrderManagementSteps.userWillAlsoEnter(String)"
});
formatter.result({
  "duration": 119816300,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.userClicksAddToCart()"
});
formatter.result({
  "duration": 68546500,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.userDeleteTheItem()"
});
formatter.result({
  "duration": 1826953100,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.itemShouldBeRemovedFromCart()"
});
formatter.result({
  "duration": 22500,
  "status": "passed"
});
formatter.after({
  "duration": 23200,
  "status": "passed"
});
});