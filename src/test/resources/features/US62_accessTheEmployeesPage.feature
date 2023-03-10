Feature: access the Employees page functionality

  Background:  User is already in the log in page
    Given the user is on the login page
    When the user logged in as "hr"
  #Agile story:  As a user, I want to access the Employees page.

  #I should view all modules on the Employees page:

  #Company Structure
  #Find Employee
  #Telephone Directory
  #Staff Changes
  #Efficiency Report
  #Honored Employees
  #Birthdays
  #New page

  Scenario: As a user, I want to access the Employees
    Given users are on the homepage
    When users click the Employees module
    Then verify the users see flowing options:
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |




