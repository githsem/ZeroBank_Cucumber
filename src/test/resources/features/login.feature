@smoke @regression
Feature: Login Tests

  Background:
    Given The user is on the home zero bank entrance page
    When The user clicks on sign in button

  @positiveLogin
  Scenario: Positive Login Test
    And The user logins with credentials "username" and "password"
    And The user navigates back
    Then The user should be able to see own name: "username" on the home page

  @negativeLogin
  Scenario Outline: Negative Login Test(Invalid data)
    When The user logins with credentials "<username>" and "<password>"
    Then The warning "<message>" should be appear
    Examples:
      | username      | password      | message                          |
      | username      | wrongpassword | Login and/or password are wrong. |
      | wrongUsername | password      | Login and/or password are wrong. |
      | username      |               | Login and/or password are wrong. |
      |               | wrongpassword | Login and/or password are wrong. |
      |               |               | Login and/or password are wrong. |
      | wrongUsername |               | Login and/or password are wrong. |
      |               | wrongpassword | Login and/or password are wrong. |
