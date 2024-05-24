Feature: LinkedList Page
  I want to explore LinkedList Data Structure

Background:
	Given User is on the Home landing page without logging in
	When The user clicks signin text 
	Then user enters  "greenhorns"  and "testing..." 
	Then user clicks on Login button with expected status as "You are logged in"
	When User clicks "Tree" Get Started button
	Then User should land on "Tree" home page

Scenario Outline: Linked List Page

		Given User is on the Tree landing page
		When User clicks any of the "<TopicCovered>" link of the Tree landing page
		Then User should land on the corresponding "<TopicCovered>" page of the Tree landing page
		When User should click on the Practice Here link of the Tree landing page
		Then User should land on Practice button of the Tree landing page
		And  Navigate back to the corresponding topic page of the Tree landing page
		Then User clicks Try here button of the Tree landing page
		Then Try Editor Is displayed on the "Assessment" page of the Tree landing page
		Then User enters the text in editor from sheetname "<SheetName>" and rownumber 0
		When  click the run button
    Then The user should be able to see output in the console "hello"
    Then user clears the text
    When The user write code in editor from sheetname "<SheetName>" and rownumber 1
    When click the run button
    Then The user should be able to see error message in alert window,accept the alert
    Then navigates to the previous page   

Examples:
|TopicCovered|SheetName|
|Overview of Trees|pythonCode|
|Terminologies|pythonCode|
|Types of Trees|pythonCode|
|Tree Traversals|pythonCode|
|Traversals-Illustration|pythonCode|
|Binary Trees|pythonCode|
|Types of Binary Trees|pythonCode|
|Implementation in Python|pythonCode|
|Binary Tree Traversals|pythonCode|
|Implementation of Binary Trees|pythonCode|
|Applications of Binary trees|pythonCode|
|Binary Search Trees|pythonCode|
|Implementation Of BST|pythonCode|

  
               
               

