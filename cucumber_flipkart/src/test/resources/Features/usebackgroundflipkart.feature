@runallfun
Feature: Check home page functionality

  @loginsearch
  Scenario: Search a product
    Given user is on login page
    When user enters username as a "9922092303" and password as a "rupa12345#"
    And clicks on login button
    Then user is navigated to home page
    When I search product as a "Dell"
    Then product list should appear searching to the product search as a "Dell"

  @selectproduct
  Scenario: Select a product
    When I select product Dell

  @addtokart
  Scenario: click adding productin add to kart
    Then click on Addtokart the product
