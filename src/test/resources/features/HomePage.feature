    Feature: Launch Start page and Test Home Page

  Scenario: Launch the home page of DSAlgo portal
    Given User opens the dsalgo portal link
    When User clicks on "Get Started" button
    Then User is redirected to homepage

  Scenario Outline: User is on Home Page and clicks on any dropdown "<value>" before sign in
    Given User is on Home Page
    When User clicks on data structure dropdown before signin
    Then User selects any dropdown menu "<value>"
    Then It should Alert the user with the message "You are not logged in"

    Examples: 
      | value       |
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  Scenario Outline: User is on Home Page and clicks on any getStarted link "<value>" before sign in
    Given User is on Home Page
    When User clicks any of the Get started link before signin "<value>"
    Then It should Alert the user with the message "You are not logged in"

    Examples: 
      | value                        |
      | Data Structures-Introduction |
      | Arrays                       |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |

  Scenario: Signin Link
    Given User is on Home Page
    When User clicks on SignIn link
    Then User is on SignIn page

  Scenario: Register Link
    Given User is on Home Page
    When User clicks on Register link
    Then User is redirected to Register page
