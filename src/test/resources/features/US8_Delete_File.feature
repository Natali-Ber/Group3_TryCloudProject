Feature: As a user, I should be able to delete a file/folder.
@US8
  Scenario: Verify users to write comments to files/folder
    Given user on the login page
  When user enter valid "user28" and "Userpass123"
  And user click login button
    When the user clicks the "Files" module
    And user click action-icon from any file in order to delete
  And user choose "Delete f" option
  When user click "Deleted files" sub-module on the left side
  Then Verify the deleted file is displayed on the page.


