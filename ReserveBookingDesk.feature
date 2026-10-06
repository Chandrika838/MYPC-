Feature: Reserve Desk functionality

Scenario: Verify Reserve Desk

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    When I open Reserve
    And I open Reserve Desk
    And I select reserve desk location
    Then Reserve desk location should be displayed

    And I select reserve desk date

    And I click reserve desk tooltip
    Then Reserve desk tooltip should be displayed

    And I select reserve desk start time
    Then Reserve desk start time should be displayed

    And I drag reserve desk slider

    And I enable reserve desk self booking
    Then Reserve desk self booking should be displayed

    And I click reserve desk Book button
    Then Reserve desk Book button should be displayed