@smoke @regression
Feature: Account Summary Checks

  Background:
    Given The user is on the home zero bank entrance page
    When The user clicks on sign in button
    And The user logins with credentials "username" and "password"
    And The user navigates back

  @accountSummary
  Scenario: Account Summary Test-1
    When The user navigates to "Online Banking" tab menu
    And The user navigates to "Account Summary" section
    Then The user should be able to see page title: "Zero - Account Summary"

  Scenario: Account Summary Test-2
    When The user navigates to "Online Banking" tab menu
    And The user navigates to "Account Summary" section
    Then The user should be able to see following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    And The user should be able to see following credit accounts columns
      | Account     |
      | Credit Card |
      | Balance     |

