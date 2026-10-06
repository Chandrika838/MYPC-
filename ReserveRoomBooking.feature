Feature: Reserve Room functionality

Scenario: Verify Reserve Room

    Given I open the application
    When I enter valid email
    And I enter valid password
    And I click the login button

    When I open Reserve
    And I open Reserve Room
    And I select reserve room location
    Then Reserve room location should be displayed

    And I select reserve room date

    And I click reserve room tooltip
    And I select reserve room start time
    And I drag reserve room slider
    And I enable reserve room self booking

    And I click reserve room Book button