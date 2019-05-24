@All @Login
Feature: Member Login
#会员登录

  Scenario Outline: Scenario: Login App
    Given I login as member "<area_code>","<user_name>","<password>"
    When Login App successfully
    Then Check that the area code and mobile are correct
    Examples:
      | area_code | user_name   | password                         |
      | 86        | 15218690991 | de517dc51425c52829012651a18a27cb |
      | 86        | 15820109961 | de517dc51425c52829012651a18a27cb |