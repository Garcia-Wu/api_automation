package org.gt.projects.api.data.response;


public class OpenAppResponse {

    /**
     * state : 1
     * error_msg : 成功
     * client_msg : 成功
     * result : {"is_open_news":true,"mission_actived":true,"navigation_page_bg":{"images_zh_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/16/3b1fdd1817e84c8f976714bf89f97508.jpg?x-oss-process=image/crop,x_2,y_0,w_744,h_128/resize,m_fixed,limit_0,w_290,h_50/quality,Q_80","images_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80"},"start_page_bg":{"id":null,"start_img":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/544b38afa3bd42a79be58c9233e5da97.JPG?x-oss-process=image/crop,x_0,y_0,w_1242,h_2345/resize,m_fixed,limit_0,w_1242,h_2345/quality,Q_80","share_img":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/3483fb711fce4017bf8c2f8f48240d5c.JPG?x-oss-process=image/crop,x_0,y_552,w_1242,h_1242/resize,m_fixed,limit_0,w_262,h_262/quality,Q_80","title":"中文","share_title":"中文","description":"啧啧啧","status":1,"is_delete":0,"link_source":4,"news_type":0,"link":"www.baidu.com","target_level_one":0,"target_level_two":0,"target_level_three":0,"open_method":2,"target":1,"language":null,"create_time":null,"update_time":null},"uuid":"d27661e5aaae46048465ba729d92ef2e","token":"d4837835fe6d4270b168ae38d026e52a"}
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
         * is_open_news : true
         * mission_actived : true
         * navigation_page_bg : {"images_zh_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/16/3b1fdd1817e84c8f976714bf89f97508.jpg?x-oss-process=image/crop,x_2,y_0,w_744,h_128/resize,m_fixed,limit_0,w_290,h_50/quality,Q_80","images_url":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80"}
         * start_page_bg : {"id":null,"start_img":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/544b38afa3bd42a79be58c9233e5da97.JPG?x-oss-process=image/crop,x_0,y_0,w_1242,h_2345/resize,m_fixed,limit_0,w_1242,h_2345/quality,Q_80","share_img":"http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/3483fb711fce4017bf8c2f8f48240d5c.JPG?x-oss-process=image/crop,x_0,y_552,w_1242,h_1242/resize,m_fixed,limit_0,w_262,h_262/quality,Q_80","title":"中文","share_title":"中文","description":"啧啧啧","status":1,"is_delete":0,"link_source":4,"news_type":0,"link":"www.baidu.com","target_level_one":0,"target_level_two":0,"target_level_three":0,"open_method":2,"target":1,"language":null,"create_time":null,"update_time":null}
         * uuid : d27661e5aaae46048465ba729d92ef2e
         * token : d4837835fe6d4270b168ae38d026e52a
         */

        private boolean is_open_news;
        private boolean mission_actived;
        private NavigationPageBgBean navigation_page_bg;
        private StartPageBgBean start_page_bg;
        private String uuid;
        private String token;

        public boolean isIs_open_news() {
            return is_open_news;
        }

        public void setIs_open_news(boolean is_open_news) {
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
             * images_zh_url : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/16/3b1fdd1817e84c8f976714bf89f97508.jpg?x-oss-process=image/crop,x_2,y_0,w_744,h_128/resize,m_fixed,limit_0,w_290,h_50/quality,Q_80
             * images_url : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/42289fa2dfea4b2884ba13ab365e2fd8.JPG?x-oss-process=image/crop,x_0,y_1067,w_1242,h_211/resize,m_fixed,limit_0,w_1242,h_211/quality,Q_80
             */

            private String images_zh_url;
            private String images_url;

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
             * id : null
             * start_img : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/544b38afa3bd42a79be58c9233e5da97.JPG?x-oss-process=image/crop,x_0,y_0,w_1242,h_2345/resize,m_fixed,limit_0,w_1242,h_2345/quality,Q_80
             * share_img : http://tnaottest.oss-cn-beijing.aliyuncs.com/image/2019/05/22/3483fb711fce4017bf8c2f8f48240d5c.JPG?x-oss-process=image/crop,x_0,y_552,w_1242,h_1242/resize,m_fixed,limit_0,w_262,h_262/quality,Q_80
             * title : 中文
             * share_title : 中文
             * description : 啧啧啧
             * status : 1
             * is_delete : 0
             * link_source : 4
             * news_type : 0
             * link : www.baidu.com
             * target_level_one : 0
             * target_level_two : 0
             * target_level_three : 0
             * open_method : 2
             * target : 1
             * language : null
             * create_time : null
             * update_time : null
             */

            private int id;
            private String start_img;
            private String share_img;
            private String title;
            private String share_title;
            private String description;
            private int status;
            private int is_delete;
            private int link_source;
            private int news_type;
            private String link;
            private int target_level_one;
            private int target_level_two;
            private int target_level_three;
            private int open_method;
            private int target;
            private String language;
            private String create_time;
            private String update_time;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getStart_img() {
                return start_img;
            }

            public void setStart_img(String start_img) {
                this.start_img = start_img;
            }

            public String getShare_img() {
                return share_img;
            }

            public void setShare_img(String share_img) {
                this.share_img = share_img;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getShare_title() {
                return share_title;
            }

            public void setShare_title(String share_title) {
                this.share_title = share_title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getIs_delete() {
                return is_delete;
            }

            public void setIs_delete(int is_delete) {
                this.is_delete = is_delete;
            }

            public int getLink_source() {
                return link_source;
            }

            public void setLink_source(int link_source) {
                this.link_source = link_source;
            }

            public int getNews_type() {
                return news_type;
            }

            public void setNews_type(int news_type) {
                this.news_type = news_type;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public int getTarget_level_one() {
                return target_level_one;
            }

            public void setTarget_level_one(int target_level_one) {
                this.target_level_one = target_level_one;
            }

            public int getTarget_level_two() {
                return target_level_two;
            }

            public void setTarget_level_two(int target_level_two) {
                this.target_level_two = target_level_two;
            }

            public int getTarget_level_three() {
                return target_level_three;
            }

            public void setTarget_level_three(int target_level_three) {
                this.target_level_three = target_level_three;
            }

            public int getOpen_method() {
                return open_method;
            }

            public void setOpen_method(int open_method) {
                this.open_method = open_method;
            }

            public int getTarget() {
                return target;
            }

            public void setTarget(int target) {
                this.target = target;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }
        }
    }
}
