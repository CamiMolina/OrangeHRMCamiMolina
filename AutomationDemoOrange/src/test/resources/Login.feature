Feature: Login Demo Orange Web

  Background: User Login into Demo Orange
    Given I am in Demo Orange web page

    @loginWithValidCredentials
    Scenario: Login into Demo Orange page with valid credentials
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The home page should be displayed
      And I click on the logout button