Feature: Search
  As an end user
  I want a search in english

   @search @smoke
  Scenario: Search wikipedia
    Given user on Main Page
    And user Type search item as "London"
    And user select Language as "Deutsch"
    When user submit
    Then I user should see search result set "London"
