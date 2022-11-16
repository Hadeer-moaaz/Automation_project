@smoke

Feature: F08_FollowUs |  users could open followUs links


  Scenario: user opens facebook link
    
  Given user opens facebook link
    Then    "https://www.facebook.com/nopCommerce" is opened in new tab


  Scenario: user opens twitter link
    When    user opens twitter link
    Then    "https://twitter.com/nopCommerce" is opened in new tab


  Scenario: user opens rss link
    When    user opens rss link
    Then    "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab


  Scenario: user opens youtube link
    When    user opens youtube link
    Then    "https://www.youtube.com/user/nopCommerce" is opened in new tab


#Feature: F07_followUs | users could open followUs links
#
#  Background:user could log in with valid credentials
#    Given user go to login page pressing on login button
#    When user login with valid "email" and "password"
#
#
#  Scenario: user opens facebook link
#    Given click on facebook icon
#    And the page link will be opened in new tab "https://www.facebook.com/nopCommerce"
#
#
#  Scenario: user opens twitter link
#  Step 1 user opens twitter link
#  Step 2 "https://twitter.com/nopCommerce" is opened in new tab
#
#  Scenario: user opens rss link
#  Step 1 user opens rss link
#  Step 2 "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab
#
#
#
#  Scenario: user opens youtube link
#  Step 1 user opens youtube link
#  Step 2 "https://www.youtube.com/user/nopCommerce" is opened in new ta