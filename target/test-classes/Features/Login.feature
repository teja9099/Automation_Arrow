Feature: feature to test login functionality

  Scenario: Check login is successfull with valid credintials
    Given User Is on login page
    When User enters username and password
    And Click on login button
    Then User Navigate to the home page
