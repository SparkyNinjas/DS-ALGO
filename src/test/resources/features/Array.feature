Feature: Array page feature

  Background: 
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

  Scenario: Arrays in Python page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    Then User is redirected to page with title "Array"
    When User clicks on Arrays in Python
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Arrays in Python") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Arrays in Python page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    When User clicks on Arrays in Python
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Arrays Using List page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    Then User is redirected to page with title "Array"
    When User clicks on Arrays Using List
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Arrays Using List") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Arrays Using List page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    When User clicks on Arrays Using List
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Basic Operations In Lists page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    Then User is redirected to page with title "Array"
    When User clicks on Basic Operations In Lists
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Basic Operations In Lists") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Basic Operations In Lists page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    When User clicks on Basic Operations In Lists
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Applications of Array page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    Then User is redirected to page with title "Array"
    When User clicks on Applications of Array
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Applications of Array") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Applications of Array page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    When User clicks on Applications of Array
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Practice Questions page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Array
    Then User is redirected to page with title "Array"
    When User clicks on Arrays in Python
    When User clicks on Practice Questions
    When User clicks on Search the array
    When User clears the Text Editor
    When User enters the Search Array Python code
    And User clicks on Run
    Then The output has to be displayed

  Scenario: SignOut validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Stack
    When User clicks on signout button
    Then User is redirected to homepage
