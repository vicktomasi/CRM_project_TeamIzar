Feature: access the Employees page functionality
  Agile story:  As a user, I want to access the Employees page.

  I should view all modules on the Employees page:

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
    When users click the Employees modul
    Then verify the users see flowing options:
      |Company Structure|
      |Find Employee|
      |Telephone Directory|
      |Staff Changes|
      |Efficiency Report|
      |Honored Employees|
      |Birthdays|
      |New page|




