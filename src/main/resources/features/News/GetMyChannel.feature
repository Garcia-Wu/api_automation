@All @News @GetMyChannel
Feature: Get My Channel
#获取资讯我的频道列表

  Scenario: Get My Channel search
    Given that a Get My Channel search request
    When Get My Channel search successfully
    Then check Get My Channel searching result state is 1