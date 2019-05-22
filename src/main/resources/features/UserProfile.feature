@All @UserProfile
Feature: Member UserProfile

  Scenario: Login App
    Given I login as member
      | area_code | 86                               |
      | user_name | 15218690991                      |
      | password  | de517dc51425c52829012651a18a27cb |
    When Login App successfully
    Then Check that the area code and mobile are correct