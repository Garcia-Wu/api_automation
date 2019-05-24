package com.mongcent.tnaot.api.modules.my.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMemberResponse {

    /**
     * state : 1
     * error_msg : 成功
     * client_msg : 请求成功
     * result : {"Member":{"member_name":"8615218690991","mobile":"15218690991","real_name":"","nick_name":"Garcia","head_img":"http://refile.tnaot.com/image/2019/05/17/6f57e1e05262444e9e770806af234ccd.jpg?x-oss-process=image/crop,x_0,y_0,w_200,h_200","email":"","member_introduction":"我们没有什么不同，天黑时我们仰望同一片星空","member_gender":1,"member_birthdate":"1994-06-07","country_id":0,"country_name":"其它","member_type":1,"mobile_area_code":"86","province_name":"","is_certification":2,"accountCertificationDesc":"222","member_id":213215,"is_media_member":false,"media_user_id":0,"media_status":0}}
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
         * Member : {"member_name":"8615218690991","mobile":"15218690991","real_name":"","nick_name":"Garcia","head_img":"http://refile.tnaot.com/image/2019/05/17/6f57e1e05262444e9e770806af234ccd.jpg?x-oss-process=image/crop,x_0,y_0,w_200,h_200","email":"","member_introduction":"我们没有什么不同，天黑时我们仰望同一片星空","member_gender":1,"member_birthdate":"1994-06-07","country_id":0,"country_name":"其它","member_type":1,"mobile_area_code":"86","province_name":"","is_certification":2,"accountCertificationDesc":"222","member_id":213215,"is_media_member":false,"media_user_id":0,"media_status":0}
         */

        @JsonProperty("Member")
        private MemberBean Member;

        public MemberBean getMember() {
            return Member;
        }

        public void setMember(MemberBean Member) {
            this.Member = Member;
        }

        public static class MemberBean {
            /**
             * member_name : 8615218690991
             * mobile : 15218690991
             * real_name :
             * nick_name : Garcia
             * head_img : http://refile.tnaot.com/image/2019/05/17/6f57e1e05262444e9e770806af234ccd.jpg?x-oss-process=image/crop,x_0,y_0,w_200,h_200
             * email :
             * member_introduction : 我们没有什么不同，天黑时我们仰望同一片星空
             * member_gender : 1
             * member_birthdate : 1994-06-07
             * country_id : 0
             * country_name : 其它
             * member_type : 1
             * mobile_area_code : 86
             * province_name :
             * is_certification : 2
             * accountCertificationDesc : 222
             * member_id : 213215
             * is_media_member : false
             * media_user_id : 0
             * media_status : 0
             */

            private String member_name;
            private String mobile;
            private String real_name;
            private String nick_name;
            private String head_img;
            private String email;
            private String member_introduction;
            private int member_gender;
            private String member_birthdate;
            private int country_id;
            private String country_name;
            private int member_type;
            private String mobile_area_code;
            private String province_name;
            private int is_certification;
            private String accountCertificationDesc;
            private int member_id;
            private boolean is_media_member;
            private long media_user_id;
            private int media_status;

            public String getMember_name() {
                return member_name;
            }

            public void setMember_name(String member_name) {
                this.member_name = member_name;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getReal_name() {
                return real_name;
            }

            public void setReal_name(String real_name) {
                this.real_name = real_name;
            }

            public String getNick_name() {
                return nick_name;
            }

            public void setNick_name(String nick_name) {
                this.nick_name = nick_name;
            }

            public String getHead_img() {
                return head_img;
            }

            public void setHead_img(String head_img) {
                this.head_img = head_img;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getMember_introduction() {
                return member_introduction;
            }

            public void setMember_introduction(String member_introduction) {
                this.member_introduction = member_introduction;
            }

            public int getMember_gender() {
                return member_gender;
            }

            public void setMember_gender(int member_gender) {
                this.member_gender = member_gender;
            }

            public String getMember_birthdate() {
                return member_birthdate;
            }

            public void setMember_birthdate(String member_birthdate) {
                this.member_birthdate = member_birthdate;
            }

            public int getCountry_id() {
                return country_id;
            }

            public void setCountry_id(int country_id) {
                this.country_id = country_id;
            }

            public String getCountry_name() {
                return country_name;
            }

            public void setCountry_name(String country_name) {
                this.country_name = country_name;
            }

            public int getMember_type() {
                return member_type;
            }

            public void setMember_type(int member_type) {
                this.member_type = member_type;
            }

            public String getMobile_area_code() {
                return mobile_area_code;
            }

            public void setMobile_area_code(String mobile_area_code) {
                this.mobile_area_code = mobile_area_code;
            }

            public String getProvince_name() {
                return province_name;
            }

            public void setProvince_name(String province_name) {
                this.province_name = province_name;
            }

            public int getIs_certification() {
                return is_certification;
            }

            public void setIs_certification(int is_certification) {
                this.is_certification = is_certification;
            }

            public String getAccountCertificationDesc() {
                return accountCertificationDesc;
            }

            public void setAccountCertificationDesc(String accountCertificationDesc) {
                this.accountCertificationDesc = accountCertificationDesc;
            }

            public int getMember_id() {
                return member_id;
            }

            public void setMember_id(int member_id) {
                this.member_id = member_id;
            }

            public boolean isIs_media_member() {
                return is_media_member;
            }

            public void setIs_media_member(boolean is_media_member) {
                this.is_media_member = is_media_member;
            }

            public long getMedia_user_id() {
                return media_user_id;
            }

            public void setMedia_user_id(long media_user_id) {
                this.media_user_id = media_user_id;
            }

            public int getMedia_status() {
                return media_status;
            }

            public void setMedia_status(int media_status) {
                this.media_status = media_status;
            }
        }
    }
}
