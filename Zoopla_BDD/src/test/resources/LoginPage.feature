Feature: GtplBank Login Page Functionality

  Background: User is in Login Page
    Given user is on Guru99 Login page

  Scenario: Check Login Page title
    When user gets the tilte of the page
    Then page title should be "Guru99 Bank Home Page"

  Scenario: Check Reset button in login page
    Then Reset button should be display

  Scenario Outline: Login with correct credentials
    When user enters userid as <username> in userID text field
    And user enters password as <password> in password text filed
    And user clicks on login button
    Then user gets the title of the page and page title should be "Guru99 Bank Manager HomePage"

    Examples: 
      | username     | password    |
      | "mngr26593"  | "1299guru@" |
      #| " mngr123gh" | "1299guru@" |
