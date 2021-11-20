@wip
Feature:User should be able to search by selecting Date

  Background: Login as a hrUser
    Given the user is on the login page
    When the user enters the hrUser information
    And the user click on filter and search field
@LUE-652
    Scenario:select any date
      When the user click date area and select Current day
      #And the user click search button
      #Then the user should be see only selected date
