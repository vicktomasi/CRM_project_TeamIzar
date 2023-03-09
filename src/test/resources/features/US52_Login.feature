Feature: As a user, I should be able to log in to the with valid credentials.

  @B28G23-92
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>" and password "<password>"
    And user click the login button
    Then verify the user should be at the home page
    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing4@cydeo.com | UserUser |