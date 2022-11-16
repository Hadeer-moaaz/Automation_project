@smoke
Feature: F07_homeSliders |Users will be able to open sliders in home page


  Scenario: First slider clickable on homepage
    When    user clicks on first slider
    Then    relative product for first slider is displayed


  Scenario: Second slider clickable on homepage
    When    user clicks on second slider
    Then    relative product for first slider is displayed


#Feature: Search | Logged user could search for any products
#
#  Background:user could log in with valid credentials
#    Given user go to login page pressing on login button
#    When user login with valid "email" and "password"
#
#  Scenario: user could search for any product
#
#    When user clicks on search field
#    And user search for Apple MacBook product
#    And user search for Flower Girl Bracelet product
#    And user search for First Prize Pies product
#    Then user could find relative results
#
#
#
#
#  Scenario: user could search for any product using sku
#
#    When user clicks on search field
#    And user search with sku for SCI_FATIH
#    And user search with sku for APPLE_CAM
#    And user search with sku for SF_PRO_11
#    Then user could find "<sku>" inside product page