package org.gt.projects.api.core;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.gt.projects.api.core.spring.properties.models.Application;
import org.gt.projects.api.data.response.OpenAppResponse;
import org.gt.projects.api.endpoints.OpenAppEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RequestHeaders {

    private String uuidHeader;
    private String tokenHeader;
    List<Header> headerList = new ArrayList<>();

    @Autowired
    private OpenAppEndpoint openAppEndpoint;
    @Autowired
    private Application application;

//    private Header contentHeader = new Header("Content-Type","application/json");

    public Headers getJsonHeaders() {
        headerList.add(new Header("uuid", getUuidHeader()));
        headerList.add(new Header("token", getTokenHeader()));
        return getGlobalHeader();
    }

    public Headers getGlobalHeader() {
        headerList.add(new Header("app_version", application.getApp_version()));
        headerList.add(new Header("device_type", application.getDevice_type().toString()));
        headerList.add(new Header("device_model", application.getDevice_model()));
        headerList.add(new Header("device_id", application.getDevice_id()));
        headerList.add(new Header("lan", application.getLan()));
        return new Headers(headerList);
    }

    public String getUuidHeader() {
        if(uuidHeader == null){
            getUuidAndToken();
        }
        return uuidHeader;
    }

    public void setUuidHeader(String uuidHeader) {
        this.uuidHeader = uuidHeader;
    }

    public String getTokenHeader() {
        if(tokenHeader == null){
            getUuidAndToken();
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
