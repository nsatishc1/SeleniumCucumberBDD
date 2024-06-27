Feature: Search selenium interview questions in Google

  Scenario: Google search
    Given I open Google
    When I search for "selenium interview questions"
    Then the page title should be anything