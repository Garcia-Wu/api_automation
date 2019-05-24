package com.mongcent.tnaot.api.modules.common.data.response;


public class OpenAppResponse {
    /**
     * state : 1
     * error_msg : 成功
     * client_msg : 成功
     * result : {"is_open_news":null,"mission_actived":true,"navigation_page_bg":{"images_km_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/20/6808428eb49f481d8588de8498c6ae96.png?x-oss-process=image/crop,x_0,y_85,w_708,h_120/resize,m_fixed,limit_0,w_708,h_120/quality,Q_80","images_en_us":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/16/3b1fdd1817e84c8f976714bf89f97508.jpg?x-oss-process=image/crop,x_2,y_0,w_744,h_128/resize,m_fixed,limit_0,w_290,h_50/quality,Q_80","images_zh_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80","images_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80"},"start_page_bg":{"share_title":"中文","news_type":0,"page_type":4,"open_method":1,"native_redirect":0,"link":"https://www.baidu.com","images_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/544b38afa3bd42a79be58c9233e5da97.JPG?x-oss-process=image/crop,x_0,y_0,w_1242,h_2345/resize,m_fixed,limit_0,w_1242,h_2345/quality,Q_80","description":"啧啧啧","share_img_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/3483fb711fce4017bf8c2f8f48240d5c.JPG?x-oss-process=image/crop,x_0,y_552,w_1242,h_1242/resize,m_fixed,limit_0,w_262,h_262/quality,Q_80","title":"中文","is_redirect":true,"news_id":0},"uuid":"c5441068dae741c3a000d034680be2d1","token":"cee2c0482eb94303b8738a2028fbd783"}
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
        /**
         * is_open_news : null
         * mission_actived : true
         * navigation_page_bg : {"images_km_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/20/6808428eb49f481d8588de8498c6ae96.png?x-oss-process=image/crop,x_0,y_85,w_708,h_120/resize,m_fixed,limit_0,w_708,h_120/quality,Q_80","images_en_us":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/16/3b1fdd1817e84c8f976714bf89f97508.jpg?x-oss-process=image/crop,x_2,y_0,w_744,h_128/resize,m_fixed,limit_0,w_290,h_50/quality,Q_80","images_zh_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80","images_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80"}
         * start_page_bg : {"share_title":"中文","news_type":0,"page_type":4,"open_method":1,"native_redirect":0,"link":"https://www.baidu.com","images_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/544b38afa3bd42a79be58c9233e5da97.JPG?x-oss-process=image/crop,x_0,y_0,w_1242,h_2345/resize,m_fixed,limit_0,w_1242,h_2345/quality,Q_80","description":"啧啧啧","share_img_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/3483fb711fce4017bf8c2f8f48240d5c.JPG?x-oss-process=image/crop,x_0,y_552,w_1242,h_1242/resize,m_fixed,limit_0,w_262,h_262/quality,Q_80","title":"中文","is_redirect":true,"news_id":0}
         * uuid : c5441068dae741c3a000d034680be2d1
         * token : cee2c0482eb94303b8738a2028fbd783
         */

        private Integer is_open_news;
        private boolean mission_actived;
        private NavigationPageBgBean navigation_page_bg;
        private StartPageBgBean start_page_bg;
        private String uuid;
        private String token;

        public Integer getIs_open_news() {
            return is_open_news;
        }

        public void setIs_open_news(Integer is_open_news) {
            this.is_open_news = is_open_news;
        }

        public boolean isMission_actived() {
            return mission_actived;
        }

        public void setMission_actived(boolean mission_actived) {
            this.mission_actived = mission_actived;
        }

        public NavigationPageBgBean getNavigation_page_bg() {
            return navigation_page_bg;
        }

        public void setNavigation_page_bg(NavigationPageBgBean navigation_page_bg) {
            this.navigation_page_bg = navigation_page_bg;
        }

        public StartPageBgBean getStart_page_bg() {
            return start_page_bg;
        }

        public void setStart_page_bg(StartPageBgBean start_page_bg) {
            this.start_page_bg = start_page_bg;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class NavigationPageBgBean {
            /**
             * images_km_url : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/20/6808428eb49f481d8588de8498c6ae96.png?x-oss-process=image/crop,x_0,y_85,w_708,h_120/resize,m_fixed,limit_0,w_708,h_120/quality,Q_80
             * images_en_us : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/16/3b1fdd1817e84c8f976714bf89f97508.jpg?x-oss-process=image/crop,x_2,y_0,w_744,h_128/resize,m_fixed,limit_0,w_290,h_50/quality,Q_80
             * images_zh_url : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80
             * images_url : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80
             */

            private String images_km_url;
            private String images_en_us;
            private String images_zh_url;
            private String images_url;

            public String getImages_km_url() {
                return images_km_url;
            }

            public void setImages_km_url(String images_km_url) {
                this.images_km_url = images_km_url;
            }

            public String getImages_en_us() {
                return images_en_us;
            }

            public void setImages_en_us(String images_en_us) {
                this.images_en_us = images_en_us;
            }

            public String getImages_zh_url() {
                return images_zh_url;
            }

            public void setImages_zh_url(String images_zh_url) {
                this.images_zh_url = images_zh_url;
            }

            public String getImages_url() {
                return images_url;
            }

            public void setImages_url(String images_url) {
                this.images_url = images_url;
            }
        }

        public static class StartPageBgBean {
            /**
             * share_title : 中文
             * news_type : 0
             * page_type : 4
             * open_method : 1
             * native_redirect : 0
             * link : https://www.baidu.com
             * images_url : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/544b38afa3bd42a79be58c9233e5da97.JPG?x-oss-process=image/crop,x_0,y_0,w_1242,h_2345/resize,m_fixed,limit_0,w_1242,h_2345/quality,Q_80
             * description : 啧啧啧
             * share_img_url : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/3483fb711fce4017bf8c2f8f48240d5c.JPG?x-oss-process=image/crop,x_0,y_552,w_1242,h_1242/resize,m_fixed,limit_0,w_262,h_262/quality,Q_80
             * title : 中文
             * is_redirect : true
             * news_id : 0
             */

            private String share_title;
            private int news_type;
            private int page_type;
            private int open_method;
            private int native_redirect;
            private String link;
            private String images_url;
            private String description;
            private String share_img_url;
            private String title;
            private boolean is_redirect;
            private int news_id;

            public String getShare_title() {
                return share_title;
            }

            public void setShare_title(String share_title) {
                this.share_title = share_title;
            }

            public int getNews_type() {
                return news_type;
            }

            public void setNews_type(int news_type) {
                this.news_type = news_type;
            }

            public int getPage_type() {
                return page_type;
            }

            public void setPage_type(int page_type) {
                this.page_type = page_type;
            }

            public int getOpen_method() {
                return open_method;
            }

            public void setOpen_method(int open_method) {
                this.open_method = open_method;
            }

            public int getNative_redirect() {
                return native_redirect;
            }

            public void setNative_redirect(int native_redirect) {
                this.native_redirect = native_redirect;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImages_url() {
                return images_url;
            }

            public void setImages_url(String images_url) {
                this.images_url = images_url;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getShare_img_url() {
                return share_img_url;
            }

            public void setShare_img_url(String share_img_url) {
                this.share_img_url = share_img_url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public boolean isIs_redirect() {
                return is_redirect;
            }

            public void setIs_redirect(boolean is_redirect) {
                this.is_redirect = is_redirect;
            }

            public int getNews_id() {
                return news_id;
            }

            public void setNews_id(int news_id) {
                this.news_id = news_id;
            }
        }
    }
}
