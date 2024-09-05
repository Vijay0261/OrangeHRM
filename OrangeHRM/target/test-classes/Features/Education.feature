Feature: Manage Education Levels in OrangeHRM

  Scenario Outline: Add a new Education Level
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Education page
    And I click on Add button
    And I enter "<EducationLevel>" as the Education Level
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<EducationLevel>" listed in the Education table

    Examples:
      | EducationLevel         |
      | B.tech                 |
     
  Scenario Outline: Edit an existing Education Level
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Education page 
    And I select "<ExistingEducationLevel>" from the Education table
    And I click on Edit button
    And I update the Education Level to "<UpdatedEducationLevel>"
    And I click on Save button
    Then I should see Successfully Updated message
    And I should see "<UpdatedEducationLevel>" listed in the Education table

    Examples:
      | ExistingEducationLevel | UpdatedEducationLevel    |
      | B.Tech                 | degree                   |
     
  Scenario Outline: Delete an Education Level
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Education page 
    And I select "<EducationLevelToDelete>" from the Education table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<EducationLevelToDelete>" listed in the Education table

    Examples:
      | EducationLevelToDelete   |
      | Degree                   |
     