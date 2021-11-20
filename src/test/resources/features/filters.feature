
Feature:User should be able to see default filters as "WORKFLOWS,ANNOUNCEMENTS,MY ACTIVITY,FAVORITES,and WORK"

  Background: Login as a hrUser
    Given the user is on the login page
    When the user enters the hrUser information
    And the user click on filter and search field
@LUE-650
  Scenario: Check default filters
    Then the user should see following values
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
