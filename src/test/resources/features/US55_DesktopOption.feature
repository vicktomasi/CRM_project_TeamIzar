Feature: CRM Desktop options feature

  User story: As a user, I should be able to see desktop options to download

@US55
  Scenario: Verify users can see desktop app options

    Given users are on the homepage
    Then verify the users see following three options:
      | Mac OS  |
      | Windows |
      | Linux   |