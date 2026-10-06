Feature: Reserve Computer functionality

Scenario: Verify Reserve Computer

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    When I open Reserve
    And I open Reserve Computer
    And I select reserve computer location 
    Then Reserve computer location should be displayed

    And I select reserve computer booking date

    And I click reserve computer tooltip
    Then Reserve computer tooltip should be displayed

    And I select reserve computer start time

    And I enable reserve computer self booking
    Then Reserve computer self booking should be selected

    And I click reserve computer Book button
    Then Reserve computer Book button should be displayed