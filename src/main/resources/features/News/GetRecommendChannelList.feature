@All @News @GetRecommendChannelList
Feature: Get Recommend Channel List
#获取资讯频道推荐列表

  Scenario: Get Recommend Channel List search
    Given that a Get Recommend Channel List search request
    When Get Recommend Channel List search successfully
    Then check Get Recommend Channel List searching result state is 1