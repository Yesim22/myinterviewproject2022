@UITest
Feature:

  Background:
    Given User on home page

  @SearchBoxTest
  Scenario Outline: Positive Test
      Given user provides item "<item>"
      And user returns the search result
    Examples:
      |item  |
      |elbise|
  @SearchBoxTest
  Scenario Outline: Negative Test
    Given user provides item "<item>"
    Then user receive error message
    Examples:
      |item    |
      |<<srlawefbvkdgmsegv |