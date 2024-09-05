Feature: OrangeHRM Login

  Scenario Outline: Successful login with valid credentials
    Given the user is on the OrangeHRM login page
    When the user enters a valid username "<username>" and a valid password "<password>"
    And the user clicks the login button
    Then the user should be redirected to the dashboard

    Examples:
      | username | password   |
      | Admin    | admin123   |

     
	 