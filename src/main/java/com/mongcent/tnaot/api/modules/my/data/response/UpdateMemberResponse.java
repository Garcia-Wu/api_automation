package com.mongcent.tnaot.api.modules.my.data.response;

public class UpdateMemberResponse {
    /**
     * state : 1
     * error_msg : 成功
     * client_msg : 请求成功
     * result : 会员资料修改成功!
     */

    private int state;
    private String error_msg;
    private String client_msg;
    private String result;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
