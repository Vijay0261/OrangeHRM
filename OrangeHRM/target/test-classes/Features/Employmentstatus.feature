
Feature: Manage Employment Status in OrangeHRM

  Scenario Outline: Add a new Employment Status
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Employment Status page
    And I click on Add button
    And I enter "<EmploymentStatusName>" as the Employment Status Name
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<EmploymentStatusName>" listed in the Employment Status table

    Examples:
      | EmploymentStatusName |
      | Full-Time Permanent  |
      

  Scenario Outline: Edit an existing Employment Status
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Employment Status page 
    And I select "<ExistingEmploymentStatusName>" from the Employment Status table
    And I click on Edit button
    And I update the Employment Status Name to "<UpdatedEmploymentStatusName>"
    And I click on Save button
    Then I should see Successfully Updated message
    And I should see "<UpdatedEmploymentStatusName>" listed in the Employment Status table

    Examples:
      | ExistingEmploymentStatusName | UpdatedEmploymentStatusName |
      | Full-Time Permanent          | Full-Time                   |
      
  Scenario Outline: Delete an Employment Status
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Employment Status page
    And I select "<EmploymentStatusNameToDelete>" from the Employment Status table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<EmploymentStatusNameToDelete>" listed in the Employment Status table

    Examples:
      | EmploymentStatusNameToDelete |
      | Full-Time                    |
      