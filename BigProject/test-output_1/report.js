$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/leavePage.feature");
formatter.feature({
  "line": 2,
  "name": "User can Assign \u0026 search Leave",
  "description": "",
  "id": "user-can-assign-\u0026-search-leave",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Leave"
    }
  ]
});
formatter.before({
  "duration": 14024833200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User  failed to assign leave",
  "description": "",
  "id": "user-can-assign-\u0026-search-leave;user--failed-to-assign-leave",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@assignLeave"
    },
    {
      "line": 4,
      "name": "@negativeLeave"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User 6 on homepage with authorization using \"Admin\" as username \u0026 \"s3Kol4HQA!*\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User 6 click leave button \u0026 assign leave button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User input \"rere\" as xEmployeeNameToLeave \u0026 select leave type \u0026 input \"2021-05-28\" as leaveFromDate \u0026 select partialDays \u0026 input \"2021-05-28\" as leaveToDate \u0026 input \"mudik\" as commentLeave \u0026 click assign button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User cant assign leave and get error Message bellow employee name",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 45
    },
    {
      "val": "s3Kol4HQA!*",
      "offset": 67
    }
  ],
  "location": "leaveStep.VisitLoginPage4(String,String)"
});
formatter.result({
  "duration": 11436535699,
  "status": "passed"
});
formatter.match({
  "location": "leaveStep.goToAssignLeave1()"
});
formatter.result({
  "duration": 8771187200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rere",
      "offset": 12
    },
    {
      "val": "2021-05-28",
      "offset": 71
    },
    {
      "val": "2021-05-28",
      "offset": 130
    },
    {
      "val": "mudik",
      "offset": 166
    }
  ],
  "location": "leaveStep.inputFailedAssign(String,String,String,String)"
});
formatter.result({
  "duration": 1094301499,
  "status": "passed"
});
formatter.match({
  "location": "leaveStep.UnsuccessfulAssignLeave()"
});
formatter.result({
  "duration": 68573500,
  "status": "passed"
});
formatter.after({
  "duration": 753140799,
  "status": "passed"
});
});