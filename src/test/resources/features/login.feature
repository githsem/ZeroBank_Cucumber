@smoke @regression
Feature: Login Tests

  @positiveLogin
  Scenario: Positive Login Test
    Given The user is on the home zero bank entrance page
    When The user clicks on sign in button
    And The user logins with valid credentials "username" and "password"
    And The user navigates back
    Then The user should be able to see own name: "username" on the home page
