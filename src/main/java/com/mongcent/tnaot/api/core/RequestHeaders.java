package com.mongcent.tnaot.api.core;

import com.mongcent.tnaot.api.core.spring.properties.models.Application;
import com.mongcent.tnaot.api.modules.common.data.response.OpenAppResponse;
import com.mongcent.tnaot.api.util.HeaderUtils;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import com.mongcent.tnaot.api.modules.common.endpoints.OpenAppEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RequestHeaders {

    private String uuidHeader;
    private String tokenHeader;
    Headers headers = new Headers(new Header("Content-Type","application/json"));

    @Autowired
    private OpenAppEndpoint openAppEndpoint;
    @Autowired
    private Application application;

    public Headers getJsonHeaders() {
        if(headers.get("uuid")== null || headers.get("token") == null){
            Header uuid = new Header("uuid", this.getUuidHeader());
            Header token = new Header("token", this.getTokenHeader());
            headers = HeaderUtils.addHeaders(headers, uuid, token);
        }
        return headers;
    }

    public Headers getGlobalHeader() {
        // open_app时调用，后面均会加上这些header
        Header appVersion = new Header("app_version", application.getApp_version());
        Header deviceType = new Header("device_type", application.getDevice_type().toString());
        Header deviceModel = new Header("device_model", application.getDevice_model());
        Header deviceId = new Header("device_id", application.getDevice_id());
        Header lan = new Header("lan", application.getLan());
        headers = HeaderUtils.addHeaders(headers, appVersion, deviceType, deviceModel, deviceId, lan);
        return headers;
    }

    public String getUuidHeader() {
        if(uuidHeader == null){
            this.getUuidAndToken();
        }
        return uuidHeader;
    }

    public void setUuidHeader(String uuidHeader) {
        this.uuidHeader = uuidHeader;
    }

    public String getTokenHeader() {
        if(tokenHeader == null){
            this.getUuidAndToken();
        }
        return tokenHeader;
    }

    public void setTokenHeader(String tokenHeader) {
        this.tokenHeader = tokenHeader;
    }

    // 通过open_app获取uuid跟token
    private void getUuidAndToken(){
        OpenAppResponse openAppResponse = openAppEndpoint.executeApiGetRequest();
        setUuidHeader(openAppResponse.getResult().getUuid());
        setTokenHeader(openAppResponse.getResult().getToken());
    }
}
