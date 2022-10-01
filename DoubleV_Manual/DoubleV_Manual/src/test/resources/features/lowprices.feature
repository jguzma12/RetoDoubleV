#autor: juan97guzman@gmail.com / Juan Pablo Guzman Q

Feature: As a user I want to make a flight reservation

  @manual
  Scenario: I as a user wish to buy tickets in different months
    Given the user enter the page
    When the user complete the fields to fly
    Then the user validates if the return ticket is from another month

  @manual
  Scenario: I as a user want to buy ticket with the lowest price
    Given the user enter the page
    When the user complete the fields to fly
    Then the user validates if the lowest price of one-way flights

  @manual
  Scenario: I as a user wish to make a flight reservation
    Given the user enter the page
    When the user complete the fields to fly
    Then the user validates if there are flights

  @manual
  Scenario: I as a user want to buy tickets with the lowest prices
    Given the user enter the page
    When the user complete the fields to fly
    Then the user validates if the lowest price of incoming flights

  @manual
  Scenario: I as a user wish to make a flight reservation with the same prices as the beginning
    Given the user enter the page
    When the user complete the fields to fly
    And The user selects the cheapest tickets and fills in the information
    Then the user validates the prices

  @manual
  Scenario: I as a user wish to make a flight reservation with the same tickets as the beginning
    Given the user enter the page
    When the user complete the fields to fly
    And The user selects the cheapest tickets and fills in the information
    Then the user validates the tickets