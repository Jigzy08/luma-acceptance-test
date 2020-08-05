$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountLoginRegisteredCustomer.feature");
formatter.feature({
  "line": 2,
  "name": "Account Management",
  "description": "",
  "id": "account-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AccountLogin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Account Login Registered Customer",
  "description": "",
  "id": "account-management;account-login-registered-customer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on the sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user also enter \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click Sign in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "My Dashboard screen should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "account-management;account-login-registered-customer;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 15,
      "id": "account-management;account-login-registered-customer;;1"
    },
    {
      "cells": [
        "johnbodle@gmail.com",
        "Testing@1"
      ],
      "line": 16,
      "id": "account-management;account-login-registered-customer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Account Login Registered Customer",
  "description": "",
  "id": "account-management;account-login-registered-customer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AccountLogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter \"johnbodle@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user also enter \"Testing@1\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click Sign in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "My Dashboard screen should display",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginRegisteredCustomerSteps.userIsOnTheSignInPage()"
});
formatter.result({
  "duration": 13307181200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "johnbodle@gmail.com",
      "offset": 12
    }
  ],
  "location": "AccountLoginRegisteredCustomerSteps.userEnter(String)"
});
formatter.result({
  "duration": 305782600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing@1",
      "offset": 17
    }
  ],
  "location": "AccountLoginRegisteredCustomerSteps.userAlsoEnter(String)"
});
formatter.result({
  "duration": 124131000,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginRegisteredCustomerSteps.userClickSignIn()"
});
formatter.result({
  "duration": 4639625300,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginRegisteredCustomerSteps.myDashboardScreenShouldDisplay()"
});
formatter.result({
  "duration": 20600,
  "status": "passed"
});
});