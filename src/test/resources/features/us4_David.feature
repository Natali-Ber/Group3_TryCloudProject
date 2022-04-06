Feature: AS a user, I should be able to access to Talks module

  @US4
Scenario: Verify the user can access the talks module
    Given User is on the dashboard page
    When User clicks on the talks icon
    Then The the talks page is accessible to the user