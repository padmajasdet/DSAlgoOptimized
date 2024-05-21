Feature: LinkedList Page
  I want to explore LinkedList Data Structure

Background:
Given User is on the Home landing page without logging in
When The user clicks signin text 
Then user enters  "greenhorns"  and "testing..." 
Then user clicks on Login button with expected status as "You are logged in"
When User clicks "Linked List" Get Started button
Then User should land on the corresponding "Linked List" home page

Scenario Outline: Linked List Page

Given User is on the Linked List landing page
When User clicks any of the "<TopicCovered>" link
Then User should land on the corresponding "<TopicCovered>" page 
When User should click on the Practice Here link
Then User should land on Practice button
And Navigate back to the corresponding topic page
Then User clicks Try here button
Then Try Editor Is displayed on the "Assessment" page

Examples:
|TopicCovered|
|Introduction|
|Creating Linked LIst|
|Types of Linked List|
|Implement Linked List in Python|
|Traversal|
|Insertion|
|Deletion|
