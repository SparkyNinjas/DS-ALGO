Feature: Tree page feature

  Background: 
    Given User is on SignIn page
    When User enters valid "<username>" and "<password>"
    And User clicks on Login button
    Then User is redirected to homepage

  Scenario: Overview of Trees page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Overview of Trees
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Overview of Trees") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Overview of Trees page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Overview of Trees
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Terminologies page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Terminologies
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Terminologies") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Terminologies page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Terminologies
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Types of Trees page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Types of Trees
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Types of Trees") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Types of Trees page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Types of Trees
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Tree Traversals page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Tree Traversals
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Tree Traversals") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Tree Traversals page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Tree Traversals
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Traversals-Illustration page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Traversals Illustration
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Traversals-Illustration") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Traversals-Illustration page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Traversals Illustration
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Binary Trees page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Binary Trees
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Binary Trees") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Binary Trees page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Binary Trees
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Types of Binary Trees page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Binary Trees
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Binary Trees") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Types of Binary Trees page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Types of Binary Trees
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Implementation in Python page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Implementation in Python
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Implementation in Python") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implementation in Python page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Implementation in Python
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Binary Tree Traversals page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Binary Tree Traversals
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Binary Tree Traversals") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Binary Tree Traversals page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Binary Tree Traversals
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Implementation of Binary Trees page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Implementation of Binary Trees
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Implementation of Binary Trees") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implementation of Binary Trees page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Implementation of Binary Trees
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Applications of Binary Trees page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Applications of Binary Trees
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Applications of Binary Trees") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Applications of Binary Trees page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Applications of Binary Trees
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Binary Search Trees page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Binary Search Trees
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Binary Search Trees") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Binary Search Trees page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Binary Search Trees
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: Implementation of BST page validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    Then User is redirected to page with title "Tree"
    When User clicks on Implementation of BST
    When User clicks on Try here
    And It should navigate to corresponding page with title "Assessment"
    When User enters the Python code
      | print("Implementation of BST") |
    And clicks on Run button
    Then The output has to be displayed

  Scenario: Implementation of BST page validation with wrong python code
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on Implementation of BST
    When User clicks on Try here
    When User enters the wrong Python code
    And clicks on Run button
    Then The alert messege has to be displayed

  Scenario: SignOut validation
    Given User is on Home page after logged in
    When User clicks on Getstarted button under Tree
    When User clicks on signout button
    Then User is redirected to homepage
