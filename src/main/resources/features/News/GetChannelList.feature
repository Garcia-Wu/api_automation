@All @News @GetChannelList
Feature: Get Channel List
#获取资讯列表

#  channel_id：int  是  频道ID （推荐-82）
#  action：int  否  动作，默认1（获取新推荐），2（获取推荐历史）
#  index：int 否  阅读位置，当action=2时，此参数生效，并为必填
#  need_top_news：int  否  推荐结果是否包含置顶的资讯，包含-1，不包含-0，默认值1
  Scenario Outline: Get Channel List search
    Given that a Get Channel List search request by "<channel_id>","<action>","<index>","<need_top_news>"
    When Get Channel List search successfully
    Then check Get Channel List searching result state is 1
    Examples:
      | channel_id | action | index | need_top_news |
      | 82         | 1      | 0     | 1             |