$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "As an end user\r\nI want a search in english",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10731047253,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search wikipedia",
  "description": "",
  "id": "search;search-wikipedia",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@search"
    },
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user on Main Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Type search item as \"London\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select Language as \"Deutsch\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user submit",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I user should see search result set \"London\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultSteps.user_on_main_page()"
});
formatter.result({
  "duration": 479840426,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 26
    }
  ],
  "location": "SearchResultSteps.user_type_search_item_as_something(String)"
});
formatter.result({
  "duration": 197560320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deutsch",
      "offset": 25
    }
  ],
  "location": "SearchResultSteps.user_select_language_as_something(String)"
});
formatter.result({
  "duration": 683687254,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultSteps.user_submit()"
});
formatter.result({
  "duration": 1882073600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 37
    }
  ],
  "location": "SearchResultSteps.i_user_should_see_search_result_set(String)"
});
formatter.result({
  "duration": 181661013,
  "status": "passed"
});
formatter.after({
  "duration": 2924133974,
  "status": "passed"
});
});