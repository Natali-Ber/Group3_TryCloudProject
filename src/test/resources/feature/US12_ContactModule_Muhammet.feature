Feature: As a user, I should be able to access to Contacts module

  @us-12
  Scenario: As a user, I should be able to access to Talks module
    Given user on the dashboard page
    When user clicks "Talk" module
    Then verify the page title is "Contacts - Trycloud QA"