@UITest
Feature:

  Background:
    Given User is on home page

  @LoginLogoutTest
  Scenario Outline: Positive Test
    Given user clicks girisYapButton
    Given user provides email id "<email>"
    And user provides password id "<password>"
    And user clicks passwordGirisYapButton
    And user verifies hesabimText
    Then user clicks cikisYapButton
    Examples:
      |     email             |password   |
      |testingylmz@yopmail.com|Meryem123*-|
  @LoginLogoutTest
  Scenario Outline: Negative Test
    Given user clicks girisYapButton
    Given user provides email id "<email>"
    And user provides password id "<password>"
    And user clicks passwordGirisYapButton
    Then user receives error message
    Examples:
      |     email             |password  |
      |testingylmz@yopmail.com|Meryem123*|