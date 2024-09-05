Feature: Manage Skills in OrangeHRM

  Scenario Outline: Add a new Skill
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Skills page 
    And I click on Add button
    And I enter "<SkillName>" as the Skill Name
    And I enter "<SkillDescription>" as the Skill Description
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<SkillName>" listed in the Skills table

    Examples:
      | SkillName        | SkillDescription        |
      | Java Programming | Proficient in Java      |
      

  Scenario Outline: Edit an existing Skill
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Skills page 
    And I select "<ExistingSkillName>" from the Skills table
    And I click on Edit button
    And I update the Skill Name to "<UpdatedSkillName>"
    And I update the Skill Description to "<UpdatedSkillDescription>"
    And I click on Save button
    Then I should see Successfully Updated message
    And I should see "<UpdatedSkillName>" listed in the Skills table

    Examples:
      | ExistingSkillName | UpdatedSkillName | UpdatedSkillDescription  |
      | Java Programming  | Advanced Java    | Advanced Java knowledge  |
     
  Scenario Outline: Delete a Skill
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Skills page 
    And I select "<SkillNameToDelete>" from the Skills table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<SkillNameToDelete>" listed in the Skills table

    Examples:
      | SkillNameToDelete   |
      | Advanced Java       |
     