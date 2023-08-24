@regression
Feature: Account Activity Checks

  Background:
    Given The user is on the home zero bank entrance page
    When The user clicks on sign in button
    And The user logins with credentials "username" and "password"
    And The user navigates back
    And The user navigates to "Online Banking" tab menu

  Scenario: Account Activity Test-1
    When The user navigates to "Account Activity" section
    Then The user should be able to see page title: "Zero - Account Activity"

  Scenario: Account Activity Test-2
    When The user navigates to "Account Activity" section
    Then The user should be able to see "Savings" account type as default
    And The user should be able to see following account types at the drop down menu
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

    And The user should be able to see followings Show Transactions table columns
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |