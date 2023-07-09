Feature: This file is for cucumber feature
  Scenario: Login functionality of an application
    Given login to application
    When user enter the valid userName
    And user should be able to see the website
    Then verify the home page of the application