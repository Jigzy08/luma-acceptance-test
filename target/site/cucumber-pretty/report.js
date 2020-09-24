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
  "line": 9,
  "name": "Add product to basket",
  "description": "",
  "id": "ordermanagement;add-product-to-basket",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@addProduct"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user moves mouse over Women and Tops and clicks Jackets",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks Juno Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user also click Small and click Purple",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user will also enter \"\u003cQty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "item is added to basket",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "ordermanagement;add-product-to-basket;",
  "rows": [
    {
      "cells": [
        "Qty"
      ],
      "line": 19,
      "id": "ordermanagement;add-product-to-basket;;1"
    },
    {
      "cells": [
        "2"
      ],
      "line": 20,
      "id": "ordermanagement;add-product-to-basket;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8165817900,
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
  "duration": 442067000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Add product to basket",
  "description": "",
  "id": "ordermanagement;add-product-to-basket;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@orderManagement"
    },
    {
      "line": 8,
      "name": "@addProduct"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user moves mouse over Women and Tops and clicks Jackets",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks Juno Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user also click Small and click Purple",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user will also enter \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks Add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "item is added to basket",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderManagementSteps.userMovesMouseOverWomenAndTopsAndClicksJackets()"
});
formatter.result({
  "duration": 16305578500,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.userClicksJunoJacket()"
});
formatter.result({
  "duration": 763154500,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.userAlsoClickSmallAndClickPurple()"
});
formatter.result({
  "duration": 723319100,
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
  "duration": 192836800,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.userClicksAddToCart()"
});
formatter.result({
  "duration": 95494100,
  "status": "passed"
});
formatter.match({
  "location": "OrderManagementSteps.itemIsAddedToBasket()"
});
formatter.result({
  "duration": 22400,
  "status": "passed"
});
formatter.after({
  "duration": 796875400,
  "status": "passed"
});
});