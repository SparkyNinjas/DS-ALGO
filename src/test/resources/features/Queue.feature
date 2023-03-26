Feature: Queue page feature

  Scenario: Login Validation
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

  Scenario: Implementation of Queue in Python page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    Then User is redirected to page with title "Queue"
    When User clicks on Implementation of Queue in Python
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Implementation of Queue in Python") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implementation of Queue in Python page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    When User clicks on Implementation of Queue in Python
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Implementation using collections.deque page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    Then User is redirected to page with title "Queue"
    When User clicks on Implementation using collections
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Implementation using collections.deque") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implementation using collections.deque page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    When User clicks on Implementation using collections
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Implementation using Array page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    Then User is redirected to page with title "Queue"
    When User clicks on Implementation using Array
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Implementation using Array") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implementation using Array page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    When User clicks on Implementation using Array
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Queue Operations page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    Then User is redirected to page with title "Queue"
    When User clicks on Queue Operations
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Queue Operations") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Queue Operations page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    When User clicks on Queue Operations
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: SignOut validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Queue
    When User clicks on signout button
    Then User is redirected to homepage
