Feature: As a user I should be able to input data in the fields
  Scenario: User is writing some text

    Given User navigates to "https://qa-automation-interview.dtdms.io/StartingPage.html"
    When User sends text as "First Name" to "user_inputElement"
    And User clicks on "loginButton"
    Then Verify that "First Name" is displayed on "loggedInUser"

    When User sends text as "5" to "firstNumberInput"
    And User sends text as "6" to "secondNumberInput"
    And User clicks on "additionButton"
    Then Verify that "11" is displayed on "sum"


 #   Given User navigates to "google.com"
