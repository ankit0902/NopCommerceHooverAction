$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/category.feature");
formatter.feature({
  "name": "Category",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "java.lang.NullPointerException\r\n\tat NopCommHooverAct1.BrowserSelector.SetUpBrowser(BrowserSelector.java:23)\r\n\tat NopCommHooverAct1.Hooks.openBrowser(Hooks.java:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "NopCommHooverAct1.MyStepdefs.userIsOnHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "user should be able to perform hoover action",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hoover"
    }
  ]
});
formatter.step({
  "name": "user hoover over category \"Computers\" link",
  "keyword": "When "
});
formatter.match({
  "location": "NopCommHooverAct1.MyStepdefs.userHooverOverCategoryLink(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on subcategory \"Notebooks\" link",
  "keyword": "And "
});
formatter.match({
  "location": "NopCommHooverAct1.MyStepdefs.clickOnSubcategoryLink(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to navigate to subcategory page \"notebooks\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NopCommHooverAct1.MyStepdefs.userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});