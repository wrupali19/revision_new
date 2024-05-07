Feature: Goibibo bus ticket booking

  Scenario: Check avaibility of  bus ticket
    Given user is on home page
    When select source as "Chatrapathi, Nagpur" from passenger want to go
    And select destination as "Chandrapur, Maharashtra" to passenger want to go
    And passenger select travell date as "Nov 14, 2022"
    Then click on Search buses button
