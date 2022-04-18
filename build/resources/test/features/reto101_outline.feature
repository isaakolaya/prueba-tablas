#Autor: Isaak
@HU2
Feature: colorlib
  As a user, I want to check the form on the Block Validation screen

  @prueba
  Scenario Outline: Check a form
  #Scenario: Check a form
    Given than IsaakOlaya wants to visit the colorlib page
    When he enter to Block Validation F
    And he fill out the BlockValidation F
      | required   | email   | pass   | cpass   | date   | url   | digits   | range   |
      | <required> | <email> | <pass> | <cpass> | <date> | <url> | <digits> | <range> |
    Then he validate the BlockValidation F

    Examples:
      | required | email           | pass     | cpass    | date       | url                    | digits     | range |
      | reto1    | reto1@gmail.com | passreto | passreto | 16/03/2022 | https://www.reto1.com/ | 0011334455 | 15    |
      | reto2    | reto2@gmail.com | passreto | passreto | 16/03/2022 | https://www.reto1.com/ | 0011334455 | 15    |