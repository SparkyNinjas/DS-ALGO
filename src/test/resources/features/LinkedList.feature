Feature: LinkedList page feature

  Background: 
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

  Scenario: LinkedList-Introdcution page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    Then User is redirected to page with title "Linked List"
    When User clicks on Introduction
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("LinkedList Introduction") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: LinkedList-Introduction page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Introduction
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Creating LinkedList page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Creating Linked List
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Creating Linked list") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Creating LinkedList page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Creating Linked List
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Types of LinkedList page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Types of Linked List
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Types of Linked list") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Types of LinkedList page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Types of Linked List
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Implement LinkedList in Python page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Implement Linked List in Python
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Impement Linked list in Python") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implement LinkedList in Python page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Implement Linked List in Python
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Traversal page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Traversal
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Traversal") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Traversal page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Traversal
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Insertion page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Insertion
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Insertion") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Insertion page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Insertion
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Deletion page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Deletion
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Deletion") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Deletion page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on Deletion
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: SignOut validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Linked List
    When User clicks on signout button
    Then User is redirected to homepage
