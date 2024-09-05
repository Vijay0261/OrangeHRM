Feature: Viewing and Adding of system users in User Management under admin

  @viewtest
  Scenario Outline: Viewing system users in Admin-User Management
    Given I login to HRMlive page "<username>" and "<password>"
    And I am on admin view system users page
    When I enter system user details  "<Username>" and "<employeeName>"
    And I select system user information "<userRole>" and "<status>"
    And I click on search option
    Then System users should be displayed

    Examples: 
      | username | password | employeeName | userRole | status  |
      | Admin    | admin123 | manda        | Admin    | Enabled |

  @addtest
  Scenario Outline: Adding new system users in Admin-User Management
    Given I login to HRMlive page
    And I navigate to admin view system users page
    When I click on Add button
    And I redirected to admin save users page
    And I select system user info  "<userRole>" and "<status>"
    And I enter system user details "<employeeName>" "<username>" "<password>" and "<confirmPassword>"
    And I click on Save option
    Then A new system user should be added

    Examples: 
      | userRole | status  | employeeName | username | password   | confirmPassword |
      | Ess      | Enabled | Vijay        | Admin    | Welcome123 | Welcome123      |
