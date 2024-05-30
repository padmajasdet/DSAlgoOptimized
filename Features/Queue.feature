Feature: Queue functionality with login
  I want to use this template for my feature file
Background:
Given User has already Logged in  using username and password form global properties file
When User clicks on Data Structures dropdown arrow 
Then user clicks on the Queue
  
Scenario Outline: Try Editor validatipon for  Queue in Python with testcodes
     Given user is on the Queue page 
     When user clicks on Implementation of Queue  link
     Then  user clicks on tryHere button in queue page
     Then User enters the text in editor in queue page from sheetname "<SheetName>" and rownumber 0
     When  click the run button 
     Then The user should be able to see output of in the console "hello" in assessment page
     Then user clears the text in editor of queue page
     When The user write code in editor in queue page from sheetname "<SheetName>" and rownumber 1
     When click the run button for queue
     Then The user should be able to see error message in alert window of queue ,accept the alert
     Then navigates to  queue page 
             
Examples:  
               |SheetName|
               |pythonCode|
 

 Scenario Outline: Try Editor validatipon for  queue Representations in Python with testcodes 
     Given user is on the Queue page 
     When user clicks on Implementation using collections.deque link
     Then user clicks on tryHere button in queue page
       Then User enters the text in editor in queue page from sheetname "<SheetName>" and rownumber 0
     When  click the run button 
     Then The user should be able to see output of in the console "hello" in assessment page
     Then user clears the text in editor of queue page
     When The user write code in editor in queue page from sheetname "<SheetName>" and rownumber 1
     When click the run button for queue
     Then The user should be able to see error message in alert window of queue ,accept the alert
     Then navigates to  queue page 
             
Examples:  
               |SheetName|
               |pythonCode|
               
               
 Scenario Outline: Try Editor validatipon for  queue Representations in Python with testcodes 
     Given user is on the Queue page 
     When user clicks on Implementation using array link
     Then user clicks on tryHere button in queue page
       Then User enters the text in editor in queue page from sheetname "<SheetName>" and rownumber 0
     When  click the run button 
     Then The user should be able to see output of in the console "hello" in assessment page
     Then user clears the text in editor of queue page
     When The user write code in editor in queue page from sheetname "<SheetName>" and rownumber 1
     When click the run button for queue
     Then The user should be able to see error message in alert window of queue ,accept the alert
     Then navigates to  queue page 
             
Examples:  
               |SheetName|
               |pythonCode|  
 Scenario Outline: Try Editor validatipon for  queue Representations in Python with testcodes 
     Given user is on the Queue page 
     When user clicks on Queue Operations link
     Then user clicks on tryHere button in queue page
       Then User enters the text in editor in queue page from sheetname "<SheetName>" and rownumber 0
     When  click the run button 
     Then The user should be able to see output of in the console "hello" in assessment page
     Then user clears the text in editor of queue page
     When The user write code in editor in queue page from sheetname "<SheetName>" and rownumber 1
     When click the run button for queue
     Then The user should be able to see error message in alert window of queue ,accept the alert
     Then navigates to  queue page 
             
Examples:  
               |SheetName|
               |pythonCode|                   
               
  @smoke
  Scenario: Try Editor validatipon for  queue  practice questions in Python with testcodes
     Given user is on the Queue page
      When user clicks on Implementation of Queue  link
     When user clicks on Practice Question link in queue page
     Then  user navigates to the  page validates the title 
     Then user  navigates back and logout
             
