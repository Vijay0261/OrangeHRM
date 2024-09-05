Feature: Manage Job Titles in OrangeHRM

 Background:
    Given I am logged into OrangeHRM as an admin with valid details "Admin" and "admin123"
    When I navigate to the Job Titles page

  Scenario Outline: Add a new Job Title
    When I click on Add button
    And I enter "<JobTitle>" as the Job Title and "<JobDescription>" as the Job Description
    And I upload "<JobSpecification>" as the Job Specification file
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<JobTitle>" listed in the Job Titles table

    Examples:
      | JobTitle        | JobDescription                       | JobSpecification  |
      | Software Tester | Responsible for software development | software_spec.pdf |

  Scenario Outline: Edit an existing Job Title
    When I select "<ExistingJobTitle>" from the Job Titles table and click on Edit button
    And I update the Job Title to "<UpdatedJobTitle>" and Job Description to "<UpdatedJobDescription>"
    And I upload "<UpdatedJobSpecification>" as the updated Job Specification file
    And I click on Save button
    Then I should see Successfully Updated message
    And I should see "<UpdatedJobTitle>" listed in the Job Titles table

    Examples:
      | ExistingJobTitle | UpdatedJobTitle        | UpdatedJobDescription     | UpdatedJobSpecification  |
      | Software Tester  | Senior Software Tester | Lead software development | senior_software_spec.pdf |

  Scenario Outline: Delete a Job Title
    When I select "<JobTitleToDelete>" from the Job Titles table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<JobTitleToDelete>" listed in the Job Titles table

    Examples:
      | JobTitleToDelete       |
      | Senior Software Tester |