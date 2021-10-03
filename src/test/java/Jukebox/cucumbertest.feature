Feature: Selecting an album

  Scenario: Wanting to listen to rumours
    Given I have selected rumours in console
    When I have selected an input in the console
    Then Then I should be told "yes"


    Scenario: Wanting to listen to rumours
      Given I have not selected rumours in console
      When I have selected an input in the console
      Then Then I should be told "no"