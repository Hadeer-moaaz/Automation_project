@smoke
Feature: F06_Currencies |User could switch between currencies [$, €]


  Scenario: user can choose euro currency
    When user select “euro” from currency dropdown list
    Then  All the products change to euro symbol
    Then user choose Euro successfully

#Feature: Switch currencies | logged user could switch between currencies US-Euro
#  Background:user could log in with valid credentials
#    Given user go to login page pressing on login button
#    When user login with valid "email" and "password"
#
#
#  Scenario:logged user could switch between currencies
#
#    Given user choose Euro from dropdown menu
#    Then euro symbol is displayed on all products
#    Then user choose Euro successfully
