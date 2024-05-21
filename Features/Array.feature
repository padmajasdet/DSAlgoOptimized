
Feature: Array functionality with login

Background:
 Given User has already Logged in  using username and password form global properties file
 Given the user is on "NumpyNinja" Homepage
 When User clicks on Data Structures dropdown arrow 
 Then user clicks on the arrays list
 Then User should be on the "Array" page
   
Scenario Outline: Try Editor validatipon for array with testcodes

    Given User is on the "Arrays in python" Home page of URL "https://dsportalapp.herokuapp.com/array/arrays-in-python/"
    When User click on"<Topic>"
    Then User should navigate to page that contains title"<Title>"
    When User clicks Try Here button of"<Topic>"
    Then The user write code in editor frome sheetname "<SheetName>" and rownumber 0
    And click the run button
    Then The user should be able to see output in the console "hello"
    Then user clears the text
    When The user write code in editor from sheetname "<SheetName>" and rownumber 1
    And click the run button
    Then The user should be able to see error message in alert window
    And  The user is navigates to topic page 
Examples: 
      | Topic  |Title|SheetName|
      | Arrays in Python|Arrays in Python|pythonCode|
      | Arrays Using List|Arrays Using List|pythonCode|
      | Basic Operations in Lists|Basic Operations in Lists |pythonCode|
      | Applications of Array|Applications of Array|pythonCode|     
      
 Scenario Outline:     
   