
Feature: User should be able to save filter

  Background: Login as a hrUser
    Given the user is on the login page
    When the user enters the hrUser information
    And the user click on filter and search field
@LUE-651
  Scenario:User should be save filter
    When User click SAVE FILTER button
    Then User wright "TEAM ACTIVITY" and click SAVE button
    And  User check last filters
