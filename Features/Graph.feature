
Feature: Graph functionality with login
  I want to use this template for my feature file
Background:
Given User has already Logged in  using username and password form global properties file
When User clicks on Data Structures dropdown arrow 
Then user clicks on the Graph 
  
Scenario Outline: Try Editor validatipon for  Graph in Python with testcodes
     Given user is on the Graph page 
     When user clicks on Graph link
     Then  user clicks on tryHere button in graph page
     Then User enters the text in editor in graph page from sheetname "<SheetName>" and rownumber 0
     When  click the run button 
     Then The user should be able to see output of in the console "hello" in graph page
     Then user clears the text in editor of graph page
     When The user write code in editor in graph page from sheetname "<SheetName>" and rownumber 1
     When click the run button for graph
     Then The user should be able to see error message in alert window of graph ,accept the alert
     Then navigates to  Graph page 
             
Examples:  
               |SheetName|
               |pythonCode|
 

 Scenario Outline: Try Editor validatipon for  Graph Representations in Python with testcodes 
     Given user is on the Graph page 
     When user clicks on Graph Representations link
     Then user clicks on tryHere button in graph page
       Then User enters the text in editor in graph page from sheetname "<SheetName>" and rownumber 0
     When  click the run button 
     Then The user should be able to see output of in the console "hello" in graph page
     Then user clears the text in editor of graph page
     When The user write code in editor in graph page from sheetname "<SheetName>" and rownumber 1
     When click the run button for graph
     Then The user should be able to see error message in alert window of graph ,accept the alert
     Then navigates to  Graph page 
             
Examples:  
               |SheetName|
               |pythonCode|
  @smoke
  Scenario: Try Editor validatipon for  Graph  practice questions in Python with testcodes
     Given user is on the Graph page
     When user clicks on Graph link 
     When user clicks on Practice Question link in graph page
     Then  user navigates to the  page validates the title 
     Then user  navigates back and logout
             
