Feature: Stack Data Structure Page

Background:
	Given User is on the Home landing page without logging in
	When The user clicks signin text 
	Then user enters  "greenhorns"  and "testing..." 
	Then user clicks on Login button with expected status as "You are logged in"
	When User clicks "Stack" Get Started button
	Then User should land on "Stack" home page

@SmokeTest1
Scenario Outline: Stack Page

		Given User is on the Stack landing page
		When User clicks any of the "<TopicCovered>" link of the Stack landing page
		Then User should land on the corresponding "<TopicCovered>" page of the Stack landing page
		
		When User should click on the Practice Questions link of the Stack Data Structure Page
		Then User should land on Practice button of the Stack Data Structure Page
		And  Navigate back to the corresponding topic page of the Stack Data Structure Page
		
		Then User clicks Try here button of the Stack Data Structure Page
		Then Try Editor Is displayed on the "Assessment" page of the Stack Data Structure Page
		Then User enters the text from sheetname "<SheetName>" and rownumber 0
		When Click run button
    Then The user can see output in the console "Hello World"
    Then User clears the text field
    When The user write code in editor page from sheetname "<SheetName>" and rownumber 1
    When Click run button
    Then The user should be able to see error message in alert window
    Then Navigates to the previous page  
      
Examples:
	|TopicCovered|SheetName|
	|Operations in Stack|pythonCode|
	|Implementation|pythonCode|
	|Applications|pythonCode|
	 	
	  