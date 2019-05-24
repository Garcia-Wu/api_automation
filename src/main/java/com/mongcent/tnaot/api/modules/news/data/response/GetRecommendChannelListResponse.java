package com.mongcent.tnaot.api.modules.news.data.response;

import java.util.List;

public class GetRecommendChannelListResponse {
    /**
     * state : 1
     * error_msg : 成功
     * client_msg : 请求成功
     * result : {"recommend_channels":[{"name":"华人华侨","sort_order":50,"channel_id":87},{"name":"教育","sort_order":140,"channel_id":101},{"name":"旅游","sort_order":150,"channel_id":102},{"name":"经济","sort_order":160,"channel_id":103},{"name":"历史","sort_order":180,"channel_id":105},{"name":"搞笑","sort_order":200,"channel_id":107},{"name":"小说","sort_order":100,"channel_id":137},{"name":"中文测试1","sort_order":7,"channel_id":141},{"name":"中文测试5","sort_order":100,"channel_id":142},{"name":"中文测试9","sort_order":250,"channel_id":143},{"name":"子频道","sort_order":1,"channel_id":151}]}
     */

    private int state;
    private String error_msg;
    private String client_msg;
    private ResultBean result;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public String getClient_msg() {
        return client_msg;
    }

    public void setClient_msg(String client_msg) {
        this.client_msg = client_msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<RecommendChannelsBean> recommend_channels;

        public List<RecommendChannelsBean> getRecommend_channels() {
            return recommend_channels;
        }

        public void setRecommend_channels(List<RecommendChannelsBean> recommend_channels) {
            this.recommend_channels = recommend_channels;
        }

        public static class RecommendChannelsBean {
            /**
             * name : 华人华侨
             * sort_order : 50
             * channel_id : 87
             */

            private String name;
            private int sort_order;
            private int channel_id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }

            public int getChannel_id() {
                return channel_id;
            }

            public void setChannel_id(int channel_id) {
                this.channel_id = channel_id;
            }
        }
    }
}
