Feature: Home page
  I want to use this template for my feature file
 
Background:
Given User is on the Home landing page without logging in
When The user clicks signin text 
Then user enters  "greenhorns"  and "testing..." 
Then  user clicks on Login button with expected status as "You are logged in"
   

Scenario Outline:
 Logged in User  

Given User is on the Home landing page after successful login
When User clicks "<Data Structure>" Get Started button
Then User should land on the corresponding "<Data Structure>" home page

Examples:
|Data Structures-Introduction|
|Array|
|Linked List|
|Stack|
|Queue|
|Tree|
|Graph|
