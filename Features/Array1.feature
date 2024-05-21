
Feature: Array functionality with login

Background:
Given User has already Logged in  using username and password form global properties file
When User clicks on Data Structures dropdown arrow 
Then user clicks on the arrays 
 
 
Scenario Outline: Try Editor validatipon for  Arrays in Python with testcodes
     Given user is on the "Arrays" page 
     When user clicks on "Arrays in Python" link
     Then  user navigates to the Arrays in Python page and clicks on tryHere button
     Then User enters the text in editor from sheetname "<SheetName>" and rownumber 0
     When  click the run button
     Then The user should be able to see output in the console "hello"
     Then user clears the text
     When The user write code in editor from sheetname "<SheetName>" and rownumber 1
     When click the run button
     Then The user should be able to see error message in alert window,accept the alert
     Then navigates to  Arrays page   
Examples:  
               |SheetName|
               |pythonCode|
 
Scenario Outline: Try Editor validatipon for  Arrays Using List with testcodes
     Given user is on the "Arrays" page 
     When user clicks on "Arrays Using List" link1
     Then  user navigates to the Arrays in Python page and clicks on tryHere button
     Then User enters the text in editor from sheetname "<SheetName>" and rownumber 0
     When  click the run button
     Then The user should be able to see output in the console "hello"
     Then user clears the text
     When The user write code in editor from sheetname "<SheetName>" and rownumber 1
     When click the run button
     Then The user should be able to see error message in alert window,accept the alert
     Then navigates to  Arrays page   
Examples:  
               |SheetName|
               |pythonCode|
Scenario Outline: Try Editor validatipon for  Arrays Using List with testcodes
     Given user is on the "Arrays" page 
     When user clicks on "Basic Operations in Lists" link2
     Then  user navigates to the Arrays in Python page and clicks on tryHere button
     Then User enters the text in editor from sheetname "<SheetName>" and rownumber 0
     When  click the run button
     Then The user should be able to see output in the console "hello"
     Then user clears the text
     When The user write code in editor from sheetname "<SheetName>" and rownumber 1
     When click the run button
     Then The user should be able to see error message in alert window,accept the alert
     Then navigates to  Arrays page   
Examples:  
               |SheetName|
               |pythonCode|
 Scenario Outline: Try Editor validatipon for  Arrays Using List with testcodes
     Given user is on the "Arrays" page 
     When user clicks on "Applications of Array" link3
     Then  user navigates to the Arrays in Python page and clicks on tryHere button
     Then User enters the text in editor from sheetname "<SheetName>" and rownumber 0
     When  click the run button
     Then The user should be able to see output in the console "hello"
     Then user clears the text
     When The user write code in editor from sheetname "<SheetName>" and rownumber 1
     When click the run button
     Then The user should be able to see error message in alert window,accept the alert
     Then navigates to  Arrays page   
Examples:  
               |SheetName|
               |pythonCode|
@Regression
 Scenario Outline: Try Editor validatipon for  Practice questions link1 with testcodes
     Given user is on the "Arrays" page  
     When user clicks on "Arrays in Python" link
     Then user clicks on "Practice Questions" link4
     Then user navigates to the practice page and clicks on "Search the array"
     When user clears the text  and enters the data from sheetname "<SheetName>" and rownumber 2
     When  click the run button
     Then The user should be able to see the alert and accept 
     Then navigates to  Arrays page  
     
     
     
Examples:  
              |SheetName|RowNumber|
              |pythonCode|2|
              
 @Regression            
Scenario Outline: Try Editor validatipon for  Practice questions link1 with testcodes
     Given user is on the "Arrays" page  
     When user clicks on "Arrays in Python" link
     Then user clicks on "Practice Questions" link4
     Then user navigates to the practice page and clicks on "Max Consecutive Ones" link2
     When user clears the text  and enters the data from sheetname "<SheetName>" and rownumber 4
     When  click the run button
     Then The user should be able to see the alert and accept 
     Then navigates to  Arrays page  
     
     
     
Examples:  
              |SheetName|RowNumber|
              |pythonCode|4|
 @Regression            
Scenario Outline: Try Editor validatipon for  Practice questions link1 with testcodes
     Given user is on the "Arrays" page  
     When user clicks on "Arrays in Python" link
     Then user clicks on "Practice Questions" link4
     Then user navigates to the practice page and clicks on "Find Numbers with Even Number of Digits" link3
     When user clears the text  and enters the data from sheetname "<SheetName>" and rownumber 6
     When  click the run button
     Then navigates to  Arrays page  
     
         
Examples:  
              |SheetName|RowNumber|
              |pythonCode|6|
 @Regression                  
Scenario Outline: Try Editor validatipon for  Practice questions link1 with testcodes
     Given user is on the "Arrays" page  
     When user clicks on "Arrays in Python" link
     Then user clicks on "Practice Questions" link4
     Then user navigates to the practice page and clicks on "Sorted Array" link4
     When user clears the text  and enters the data from sheetname "<SheetName>" and rownumber 8
     When  click the run button
     Then navigates to  Arrays page  
     Then log out from site
      
 Examples:  
              |SheetName|RowNumber|
              |pythonCode|8|               