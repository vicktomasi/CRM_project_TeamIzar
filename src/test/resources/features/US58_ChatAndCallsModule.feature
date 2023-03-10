
Feature: Chat and Calls module accessibility

  @wip
  Scenario: Chat and Calls module all options verification
    Given users are on the homepage
    When users click the Chat and Calls module
    Then verify users see following four options:
      | Message       |
      | Notification  |
      | Settings      |
      | Active Stream |


# This is the same Scenario that can be done this way too:
  Scenario: Chat and Calls module all options verification
    Given users are on the homepage
    When users click the Chat and Calls module
    Then verify users see following "<4>" options: "<Message Notification Settings Active Stream>"