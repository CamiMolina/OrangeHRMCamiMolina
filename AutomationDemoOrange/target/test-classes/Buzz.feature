Feature: Buzz Page
  Background: Buzz Page should display a publication
    Given I am in Demo Orange web page

    @VerifyMessageIsDisplayedInBuzz
    Scenario: Verify is Displayed a publication
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then I click on the buzz button
      And I Write one message "Amo a Taylor Swift" in the Post TextBox
      And I click on Post Button
      Then I verification post message in buzz page is "Amo a Taylor Swift"
      And I click on the logout button