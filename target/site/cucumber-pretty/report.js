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
      "name": "@OrderManagement"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Add product to basket",
  "description": "",
  "id": "ordermanagement;add-product-to-basket",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@AddProduct"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user move mouse over Women",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user moves mouse over Tops",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click Jackets",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks Juno Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user also click Small",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user then click Purple",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enter \"\u003cQty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks Add to Cart",
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
      "name": "@OrderManagement"
    },
    {
      "line": 5,
      "name": "@AddProduct"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user move mouse over Women",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user moves mouse over Tops",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click Jackets",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks Juno Jacket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user also click Small",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user then click Purple",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enter \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks Add to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductSteps.userIsOnHomePage()"
});
formatter.result({
  "duration": 7561803300,
  "status": "passed"
});
formatter.match({
  "location": "AddProductSteps.userMoveMouseOverWomen()"
});
formatter.result({
  "duration": 176814200,
  "status": "passed"
});
formatter.match({
  "location": "AddProductSteps.userMovesMouseOverTops()"
});
formatter.result({
  "duration": 34365700,
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: Failed to execute \u0027elementsFromPoint\u0027 on \u0027Document\u0027: The provided double value is non-finite.\n  (Session info: chrome\u003d85.0.4183.83)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JIGZY-PC\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_262\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.83, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\sunmi\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59642}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 75fa6bc1768d5171b76f3a1a7795ef2e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:595)\r\n\tat com.lamtech.luma.stepDefinition.AddProductSteps.userMovesMouseOverTops(AddProductSteps.java:52)\r\n\tat ✽.And user moves mouse over Tops(OrderManagement.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddProductSteps.userClickJackets()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductSteps.userClicksJunoJacket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductSteps.userAlsoClickSmall()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductSteps.userThenClickPurple()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 12
    }
  ],
  "location": "AccountManagementSteps.userEnter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddProductSteps.userClicksAddToCart()"
});
formatter.result({
  "status": "skipped"
});
});