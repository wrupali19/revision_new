Feature: MakeMyTrip train ticket booking

  Scenario: Check avaibility of ticket
    Given user is on home page
    When select location as "Hyderabad - All Stations" from user want to go
    And select location as "Pune Junction" to user want to go
    And user select travell date as "03/10/2022"
    Then select traveler class
    Then click on Search button

  Scenario Outline: Add traveller information
    When user enter name as "<name>" and age as "<age>"
    And user select gender , nationality, Berthpreference and Reservationtype
    Then click on Add button

    Examples: 
      | name   | age |
      | Rupali |  30 |

  Scenario Outline: Add IRCTC Account Details
    Given no user account on IRCTC then click on change button
    And click on create IRCTC new Account
    Then Register with IRCTC create new account with Account Setup and user enters username as a "<username>" and Email Address as a "<emailaddress>" and  mobile number as a "<mobileno>" and create password as a "<password>" and security Answer as a "<securityanswer>"

    Examples: 
      | username          | emailaddress       | mobileno   | password   | securityanswer |
      | RupaliBhalshankar | wrupali65@yahoo.in | 8668697646 | Rups12345# | Rups           |
      
   Scenario Outline: Add personal information
   Then adding personal info like enters firstname as a "<firstname>" and lastname as a "<lastname>"
   And user send dateofbirth and occupation
   And click on gender, marital preference and preffered language
   
   Examples:
   | firstname | lastname |
   | Rupali | Bhalshankar |
      
