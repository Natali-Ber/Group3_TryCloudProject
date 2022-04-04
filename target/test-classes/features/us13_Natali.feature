Feature: As a user, I should be able to view the contact list.


  @Natali
  Scenario:verify users can see all the contact names on the contact list
    Given user on the dashboard page
    When the user clicks the contacts module
    Then verify the contact names are in the list
      |AAA Arlington Heights|
      |AAA South Elgin|
      |AAA Wheaton Car Care Plus|