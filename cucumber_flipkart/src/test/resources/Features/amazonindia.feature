Feature: Check  Amazon home page functionality

  @smoke
  Scenario: Check login page
    Given user is on login page
    When user enters username as a "9922092303" and password as a "Rupa12345#"
    And clicks on login button
    Then user is navigated to home page

  @Regration
  Scenario: Search a product
    When I search product as a "night suits for women"
    Then product list should appear searching to the product search as a "night suits for women"

  @selectproduct
  Scenario: Select a product
    And I select product night suits for women
    Then click on add to kart button

 
  