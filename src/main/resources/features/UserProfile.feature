@All @UserProfile
Feature: Member UserProfile

  Scenario: Login App
    Given I login as member
      | areaCode | 86             |
      | mobile    | 15218690991    |
      | password  | 123456         |
    When Login App successfully
    Then Check the state is "1"