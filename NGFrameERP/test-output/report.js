$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/JavaProgram/NGFrameERP/src/test/java/Features/TestSteps.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "Verify if user is able to Login into the site",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login as an authenticated user",
  "description": "",
  "id": "login-feature;login-as-an-authenticated-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "success Login and Home Page display",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "stepdefinition.user_navigates_to_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdefinition.success_login_and_home_Page_displayed()"
});
formatter.result({
  "status": "skipped"
});
});