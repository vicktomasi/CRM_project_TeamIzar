Feature: CRM "Remember me on this computer"

  User Story: As a user, I should be able to access login page features.


  Scenario: Verify the users can check the "Remember me on this computer" checkbox on the login page.
    Given the users go to the login page
    Then Verify there is a “Remember me on this computer” message displayed
    Then verify the check box is clickable


