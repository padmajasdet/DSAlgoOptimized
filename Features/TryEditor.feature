
Feature: Try Editor Page
  I want to explore Try Editor

  
  Scenario Outline: User tries the editor with valid code
    Given User is on the Editor 
    When user enters valid code fome the sheet "<SheetName>" <RowNumber> and cliks the Run button 
    Then Output is displayed in the console

    Examples: 
      |SheetName|RowNumber| 
      |PythonCode|0|  
      
      
      
      
    Scenario Outline: User tries the editor with invalid code 
    Given User is on the Editor 
    When user enters invalid code fome the sheet "<SheetName>" <RowNumber> and cliks the Run button 
    Then Error message is displayed in the console

    Examples: 
      |SheetName|RowNumber| 
      |PythonCode|1|  
      
     