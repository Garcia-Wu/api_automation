@All @My @UpdateMember
Feature: Update Member
#获取用户信息

  Scenario Outline: Update Member request
    Given that a Update Member search request by "<nick_name>","<member_gender>","<country_id>","<province_name>","<member_birthdate>","<member_Introduction>"
    When Update Member request successfully
    Then check Update Member request result state is 1
    Examples:
      | nick_name     | member_gender | country_id | province_name | member_birthdate | member_Introduction |
      | YuXuan        | 1             | 36         | 金边            | 2019-05-23       | 简单的自我介绍吧            |