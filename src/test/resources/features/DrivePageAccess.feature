@wip
Feature: User accesses the Drive page

  Scenario:Users should be able to see all modules in the Drive page
    Given the user is on the home page
    When user clicks the Drive option in the menu
    Then verify users see following options
      | My Drive                 |
      | All Documents            |
      | Company Drive            |
      | Sales and Marketing      |
      | Top management documents |
      | Drive Cleanup            |