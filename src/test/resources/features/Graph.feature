Feature: Graph page feature

  Background: 
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

  Scenario: Graph page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Graph
    Then User is redirected to page with title "Graph"
    When User clicks on Graph
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Graph") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Graph page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Graph
    When User clicks on Graph
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Graph Representations page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Graph
    Then User is redirected to page with title "Graph"
    When User clicks on Graph Representations
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Graph Representations") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Graph Representations page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Graph
    When User clicks on Graph Representations
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: SignOut validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Graph
    When User clicks on signout button
    Then User is redirected to homepage
