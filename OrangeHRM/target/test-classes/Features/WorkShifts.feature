Feature: Manage Work Shifts in OrangeHRM

  Scenario Outline: Add a new Work Shift
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Work Shifts page 
    And I click on Add button
    And I enter "<ShiftName>" as the Shift Name
    And I select "<FromTime>" as the From time
    And I select "<ToTime>" as the To time
    And I select "<AssignedEmployees>" as assigned employees
    And I click on Save button
    Then I should see Successfully Saved message
    And I should see "<ShiftName>" listed in the Work Shifts table

    Examples:
      | ShiftName    | FromTime | ToTime  | AssignedEmployees               |
      | Morning Shift | 08:00 AM | 04:00 PM | Vijay Ch , Rukmini ,krishna   |
      

  Scenario Outline: Edit an existing Work Shift
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Work Shifts page 
    And I select "<ExistingShiftName>" from the Work Shifts table
    And I click on Edit button
    And I update the Shift Name to "<UpdatedShiftName>"
    And I update the From time to "<UpdatedFromTime>"
    And I update the To time to "<UpdatedToTime>"
    And I update assigned employees to "<UpdatedAssignedEmployees>"
    And I click on Save button
    Then I should see Successfully Updated message
    And I should see "<UpdatedShiftName>" listed in the Work Shifts table

    Examples:
      | ExistingShiftName | UpdatedShiftName | UpdatedFromTime | UpdatedToTime | UpdatedAssignedEmployees |
      | Morning Shift     | Day Shift        | 09:00 AM        | 05:00 PM      |  Vijay Ch , Rukmini ,krishna    |
      

  Scenario Outline: Delete a Work Shift
    Given I am logged into OrangeHRM as an admin
    When I navigate to the Work Shifts page 
    And I select "<ShiftNameToDelete>" from the Work Shifts table
    And I click on Delete button
    And I confirm the deletion
    Then I should see Successfully Deleted message
    And I should not see "<ShiftNameToDelete>" listed in the Work Shifts table

    Examples:
      | ShiftNameToDelete   |
      | Day Shift           |
     