Feature: Logout Demo Orange Web

  Background: User Logout into Demo Orange
    Given I am in Demo Orange web page

  @logoutOrangePage
  Scenario: Logout into Demo Orange page
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on the login button
    Then I click on the logout button
    And The Login page should be displayed