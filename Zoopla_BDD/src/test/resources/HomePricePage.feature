Feature: HomePrice Page Functionality

  Background: 
    Given user is on Zoopla Login Page
    When user enter "username" in userID text field as "sibaranjan.mohakud@gmail.com"
    And user enter "password" in password text field as "Sibu@12345"
    And user click on Login Button
    Then user login to Zoopla Home Page

  Scenario: Check House price Page Functionality
    When user click on House price link
    Then user able to see "Sold House Prices - Get UK house prices online - Zoopla" page
    Then user enters "Oxford Road, London SE19" in search text field
    And user hit on Search button
    Then user "House prices in Oxford Road, London SE19 - sold prices and estimates - Zoopla" Page display
