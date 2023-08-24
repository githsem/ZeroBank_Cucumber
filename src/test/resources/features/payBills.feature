@regression
Feature: PayBills Checks

  Background:
    Given The user is on the home zero bank entrance page
    When The user clicks on sign in button
    And The user logins with credentials "username" and "password"
    And The user navigates back
    And The user navigates to "Online Banking" tab menu

  Scenario: Positive Pay Bills Test
    When The user navigates to "Pay Bills" section
    Then The user should be able to see page title: "Zero - Pay Bills"
    When The user sends 50 dollars to the amount box
    And The user sends "2023-08-24" to the date box
    And The user sends "Test" data to the description box
    And The user clicks on Pay button
    Then The user should be able to see success message: "The payment was successfully submitted."

  Scenario: Negative Pay Bills Test-1
    When The user navigates to "Pay Bills" section
    And The user sends "2023-08-24" to the date box
    And The user sends "Test" data to the description box
    And The user clicks on Pay button
    Then The user should be able to see error message: "Please fill in this field." on amount Box

  @wip
  Scenario: Date Invalid character test
    When The user navigates to "Pay Bills" section
    When The user sends 50 dollars to the amount box
    And The user sends "test" to the date box
    Then The user should be able to verify that the date box is still empty



