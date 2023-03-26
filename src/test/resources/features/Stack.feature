Feature: Stack page feature

  Background: 
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

  Scenario: Operations in Stack page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    Then User is redirected to page with title "Stack"
    When User clicks on Operations in Stack
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Operations in Stack") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Operations in Stack page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    When User clicks on Operations in Stack
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Implementation page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    Then User is redirected to page with title "Stack"
    When User clicks on Implementation
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Implementation") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implementation page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    When User clicks on Implementation
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Applications page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    Then User is redirected to page with title "Stack"
    When User clicks on Applications
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Applications") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Applications page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    When User clicks on Applications
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: SignOut validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    When User clicks on signout button
    Then User is redirected to homepage
