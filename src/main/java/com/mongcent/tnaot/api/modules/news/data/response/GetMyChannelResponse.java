package com.mongcent.tnaot.api.modules.news.data.response;

import java.util.List;

public class GetMyChannelResponse {
    /**
     * state : 1
     * error_msg : 成功
     * client_msg : 请求成功
     * result : {"my_channels":[{"name":"推荐","is_fixed":1,"sort_order":0,"channel_id":82},{"name":"时事","is_fixed":1,"sort_order":20,"channel_id":84},{"name":"图片","is_fixed":0,"sort_order":170,"channel_id":104},{"name":"情感","is_fixed":0,"sort_order":190,"channel_id":106},{"name":"柬埔寨","is_fixed":0,"sort_order":30,"channel_id":85},{"name":"娱乐","is_fixed":0,"sort_order":60,"channel_id":93},{"name":"社会","is_fixed":0,"sort_order":70,"channel_id":94},{"name":"科技","is_fixed":0,"sort_order":80,"channel_id":95},{"name":"体育","is_fixed":0,"sort_order":90,"channel_id":96},{"name":"健康","is_fixed":0,"sort_order":100,"channel_id":97},{"name":"美食","is_fixed":0,"sort_order":110,"channel_id":98},{"name":"生活","is_fixed":0,"sort_order":120,"channel_id":99},{"name":"国际","is_fixed":0,"sort_order":40,"channel_id":86},{"name":"房产","is_fixed":0,"sort_order":130,"channel_id":100}]}
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
        private List<MyChannelsBean> my_channels;

        public List<MyChannelsBean> getMy_channels() {
            return my_channels;
        }

        public void setMy_channels(List<MyChannelsBean> my_channels) {
            this.my_channels = my_channels;
        }

        public static class MyChannelsBean {
            /**
             * name : 推荐
             * is_fixed : 1
             * sort_order : 0
             * channel_id : 82
             */

            private String name;
            private int is_fixed;
            private int sort_order;
            private int channel_id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getIs_fixed() {
                return is_fixed;
            }

            public void setIs_fixed(int is_fixed) {
                this.is_fixed = is_fixed;
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
