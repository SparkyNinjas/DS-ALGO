Feature: Login page feature

  Scenario: Verify Register link
    Given User is on SignIn page
    When User clicks on Register link
    Then User is redirected to Register page

  Scenario: Login with correct credentials
    Given User is on SignIn page
    When User enters username "div"
    And User enters password "pwd@1234"
    And User clicks on Login button
    Then User gets the logged in messege
    And Logout link should be displayed

  Scenario: Login with empty fields
    Given User is on SignIn page
    When User clicks on login button with empty fields
    Then User gets the error message "Please fill out this field."

  Scenario Outline: Login with invalid "<username>" and "<password>"
    Given User is on SignIn page
    When User enters username as "<username>"
    And User enters password as "<password>"
    And User clicks on Login button
    Then User gets the error message as "Invalid Username and Password"

    Examples: 
      | username | password |
      | aaaaaa   |   123456 |
      | name     | pwd      |

  Scenario: Login with entering only username
    Given User is on SignIn page
    When User enters only username as "div"
    And User clicks on Login button
    Then User gets the message at password field as "Please fill out this field."

  Scenario: Login with entering only password
    Given User is on SignIn page
    When User enters only password as "pwd@1234"
    And User clicks on Login button
    Then User gets the message at username field as "Please fill out this field."

  Scenario Outline: Verify Signout link
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    And User clicks on signout button
    Then User is redirected to homepage

    Examples: 
      | username | password |
      | div      | pwd@1234 |
