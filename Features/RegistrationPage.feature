Feature: Register page
  I want to use this template for my feature file

  
 Scenario Outline: registration with  valid and invalid credentials
    Given user is in Registration page
    When user enters sheetname  "<SheetName>"   and rownumber  <RowNumber>
    Then user checks  the staus message

    Examples: 
      |SheetName|RowNumber| 
      |DsalgoRegistration|0|  
      |DsalgoRegistration|1| 
      |DsalgoRegistration|2| 
      |DsalgoRegistration|3| 
      |DsalgoRegistration|4| 
      |DsalgoRegistration|5| 