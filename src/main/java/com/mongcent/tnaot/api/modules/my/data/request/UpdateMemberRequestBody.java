package com.mongcent.tnaot.api.modules.my.data.request;

public class UpdateMemberRequestBody {

    // 昵称
    private String nick_name;
    // 性别  0保密 1男 2女
    private String member_gender;
    // 国家ID  36柬埔寨 44中国 0其他
    private String country_id;
    // 城市名
    private String province_name;
    // 生日
    private String member_birthdate;
    // 简介
    private String member_Introduction;

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getMember_gender() {
        return member_gender;
    }

    public void setMember_gender(String member_gender) {
        this.member_gender = member_gender;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getMember_birthdate() {
        return member_birthdate;
    }

    public void setMember_birthdate(String member_birthdate) {
        this.member_birthdate = member_birthdate;
    }

    public String getMember_Introduction() {
        return member_Introduction;
    }

    public void setMember_Introduction(String member_Introduction) {
        this.member_Introduction = member_Introduction;
    }
}
