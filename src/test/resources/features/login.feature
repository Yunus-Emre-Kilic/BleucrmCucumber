
Feature: Users should be able to login

  @LUE-653
  Scenario: Login as a hrUser
    Given the user is on the login page
    When the user enters the hrUser information
    Then the user should be able to login
    And the user click on filter and search field