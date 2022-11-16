@smoke

Feature: F02_Login |User should be able to login to the system


  Scenario: user login with valid data
    When    user navigate to login page
    And     user enter "Hadeermohamed7@gmail.com" and "Vois@3030"
    Then    user click on login button
    And     user could login successfully and go to home page


  Scenario: user login with invalid data
    When    user navigate to login page
    And     user enter "Hadeermoaaz6@gmial.com" and "Vois"
    Then    user click on login button
    And     user could not login successfully and go to home page
