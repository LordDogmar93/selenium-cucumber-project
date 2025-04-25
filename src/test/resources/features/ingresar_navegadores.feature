Feature: Ingreso a diferentes navegadores

  Scenario: Search for "pelota" on Google
    Given I have opened the Google homepage in Opera
    When I search for "pelota"
    Then I should see the search results
    And I close the browser

  Scenario: Search for "pelota" on Safari
    Given I have opened the Google homepage in Safari
    When I search for "pelota"
    Then I should see the search results
    And I close the browser