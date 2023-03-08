@wip
Feature: Chat and Calls module accessibility

  Scenario: Chat and Calls module all options verification
    Given users are on the homepage
    When users click the Chat and Calls module
    Then verify users see following four options:
      | Message       |
      | Notification  |
      | Settings      |
      | Active Stream |

