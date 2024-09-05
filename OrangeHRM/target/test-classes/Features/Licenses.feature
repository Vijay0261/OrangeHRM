Feature: Manage Licenses in OrangeHRM

  Scenario Outline: Add a new License
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Licenses page 
    And I click on Add button
    And I enter "<LicenseName>" as the License Name
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<LicenseName>" listed in the Licenses table

    Examples:
      | LicenseName         |
      | Driver's License    |
     
  Scenario Outline: Edit an existing License
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Licenses page 
    And I select "<ExistingLicenseName>" from the Licenses table
    And I click on Edit button
    And I update the License Name to "<UpdatedLicenseName>"
    And I click on Save button
    Then I should see Successfully Updated message
    And I should see "<UpdatedLicenseName>" listed in the Licenses table

    Examples:
      | ExistingLicenseName | UpdatedLicenseName  |
      | Driver's License    | Commercial License  |
      
  Scenario Outline: Delete a License
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Licenses page 
    And I select "<LicenseNameToDelete>" from the Licenses table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<LicenseNameToDelete>" listed in the Licenses table

    Examples:
      | LicenseNameToDelete  |
      | Commercial License   |
      