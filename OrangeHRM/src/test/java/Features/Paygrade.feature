Feature: Manage Pay Grades in OrangeHRM

  Background:
    Given I am logged into OrangeHRM as an admin with valid details "<username>" and "<password>"

  Scenario Outline: Add a new Pay Grade
    When I navigate to the Pay Grades page
    And I click on Add button
    And I enter "<PayGradeName>" as the Pay Grade name
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<PayGradeName>" listed in the Pay Grades table

    Examples: 
      | username | password | PayGradeName |
      | Admin    | admin123 | Vijay Ch     |

  Scenario Outline: Add a Currency to a Pay Grade
    When I navigate to the Pay Grades page
    And I select "<PayGradeName>" from the Pay Grades table
    And I click on Add Currency button
    And I select "<Currency>" as the currency
    And I enter "<MinSalary>" as the Minimum Salary and "<MaxSalary>" as the Maximum Salary
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<Currency>" listed in the currencies table for "<PayGradeName>"

    Examples: 
      | username | password | PayGradeName | Currency | MinSalary | MaxSalary |
      | Admin    | admin123 | Vijay Ch     | INR      |     30000 |     50000 |

  Scenario Outline: Delete a Pay Grade
    When I navigate to the Pay Grades page
    And I select "<ExistingPayGradeName>" from the Pay table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<ExistingPayGradeName>" listed in the Pay Grades table

    Examples: 
      | username | password | ExistingPayGradeName |
      | Admin    | admin123 | Vijay Ch             |