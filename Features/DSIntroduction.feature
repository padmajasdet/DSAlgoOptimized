
Feature: Data Structure Introduction
 Background:
Given User is on the Home landing page without logging in
When The user clicks signin text 
Then user enters  "greenhorns"  and "testing..." 
Then user clicks on Login button with expected status as "You are logged in"
When User clicks "Data Structures-Introduction" Get Started button
Then User should land on "Data Structures-Introduction" home page 
  
 
 Scenario Outline: User is on the Data Structure Introduction Page
 Given User is on the Data Structure Introduction page
When User clicks "Time Complexity" link
Then User should land on the "Time Complexity" page 
When User should click on the Practice Here link
Then User should land on Practice button
And Navigate back to the corresponding topic page
Then User clicks Try here button
Then Try Editor Is displayed on the "Assessment" page
Then User enters the text in editor from sheetname "<SheetName>" and rownumber 0
		When  click the run button
    Then The user should be able to see output in the console "hello"
    Then user clears the text
    When The user write code in editor from sheetname "<SheetName>" and rownumber 1
    When click the run button
    Then The user should be able to see error message in alert window,accept the alert
    Then navigates to the previous page
    Examples:  
               |SheetName|
               |pythonCode|