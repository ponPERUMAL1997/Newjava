Feature: validate adactin application

  Scenario: validate adactin login page with invalid datas
    Given user should on the login page
    When user should enter user and password
    And user should enter login button
    Then user should verify success msg
