Feature: Test Login Functionality

  Scenario: Login Successfull With Valid Credentials
    Given Open Browser
    And User Is on Login Page
    When User Enters UserName and Password
    And Clicks on LoginButton
    Then User Is on Application Home Page
