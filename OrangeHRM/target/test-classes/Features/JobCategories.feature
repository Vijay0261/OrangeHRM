Feature: Manage Job Categories in OrangeHRM

  Scenario Outline: Add a new Job Category
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Job Categories page 
    And I click on Add button
    And I enter "<JobCategoryName>" as the Job Category Name
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<JobCategoryName>" listed in the Job Categories table

    Examples:
      | JobCategoryName    |
      | IT Management      |
     
  Scenario Outline: Edit an existing Job Category
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Job Categories page 
    And I select "<ExistingJobCategoryName>" from the Job Categories table
    And I click on Edit button
    And I update the Job Category Name to "<UpdatedJobCategoryName>"
    And I click on Save button
    Then I should see Successfully Updated message
    And I should see "<UpdatedJobCategoryName>" listed in the Job Categories table

    Examples:
      | ExistingJobCategoryName | UpdatedJobCategoryName |
      | IT Management           | IT & Development       |
     
  Scenario Outline: Delete a Job Category
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Job Categories page 
    And I select "<JobCategoryNameToDelete>" from the Job Categories table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<JobCategoryNameToDelete>" listed in the Job Categories table

    Examples:
      | JobCategoryNameToDelete |
      | IT & Development        |
      