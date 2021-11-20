
Feature:User should be able to add and remove field

  Background: Login as a hrUser
    Given the user is on the login page
    When the user enters the hrUser information
    And the user click on filter and search field

  @LUE-654
  Scenario:User should be add and remove field
    When the user click addfield
    And Unselect "Date","Type","Author","To" and Select "Favorites","Tag","Extranet"
    Then the user check last selected fields



