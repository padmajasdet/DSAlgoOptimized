
Feature: Signin Page
  I want to use this template for my feature file

   
    
  Scenario Outline:  Validating the login functionality
    Given The user is on the DS Algo Sign in Page
    When The user clicks signin text 
    Then user enters  "<username>"  and "<password>"  
    Then  user clicks on Login button with expected status as "<status>"

    Examples: 
     | username  | password | status  |
     | greenhorns |    testing...| You are logged in |
     | greenhorns |     inpass    |Invalid Username and Password|
     | inpass     |      testing...   |Invalid Username and Password|
     |        |      testing...   |Please fill it out|
     |   greenhorns     |        |Please fill it out|  