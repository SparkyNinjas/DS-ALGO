Feature: DataStructures page feature

  Background: 
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

  Scenario: Datastructures page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Datastructures-Introduction
    Then User is redirected to page with title "Data Structures-Introduction"
    When User clicks on Time Complexity
    Then It should navigate to corresponding page with title "Time Complexity"
    When User clicks on Try here
    Then It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Hello") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Datastructures page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Datastructures-Introduction
    When User clicks on Time Complexity
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: SignOut validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Datastructures-Introduction
    When User clicks on signout button
    Then User is redirected to homepage
