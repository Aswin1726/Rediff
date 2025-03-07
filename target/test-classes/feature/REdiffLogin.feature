Feature: Rediffmail Account Creation

  Scenario: Creating a new Rediffmail account
    Given the Rediffmail signup page is open 
    When click the create account button
    And "<Full Name>" username is entered 
    And choose a "<Rediffmail ID>" is entered 
    And check availability is clicked
    And "<Password>" is entered 
    And "<Retype Password>" is retyped 
    And "<Alternate Email>" address is entered 
    And "<Mobile Number>" mobile number is entered 
    And date of birth is selected from dropdowns
    And  gender is selected 
    And  country is selected 
    And enter the capcha
    And click the create my account button 
    Then the account should be created successfully
    
    Examples:
        | Full Name     | Rediffmail ID | Password | Retype Password | Alternate Email    | Mobile Number |  
         | Aswin         | aswin123     | Passash22    | Passash22         | aswin@gmail.com    | 9876543210    |  
         |Daksanya        |daks1111     |daksanyaashwin| daksanyaashwin        |dak@gmail.com|9894269191|
         