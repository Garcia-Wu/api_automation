@All @My @GetMember
Feature: Get Member
#获取用户信息

  Scenario Outline: Get Member search
    Given that a Get Member search request by "<user_name>"
    When Get Member search successfully
    Then check Get Member searching result state is 1
    Examples:
      | user_name     |
      | 8615218690991 |
      | 8618818392716 |