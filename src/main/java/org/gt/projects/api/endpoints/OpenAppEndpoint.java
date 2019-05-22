package org.gt.projects.api.endpoints;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.gt.projects.api.core.GetRequest;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.core.spring.properties.models.Application;
import org.gt.projects.api.data.response.OpenAppResponse;
import org.gt.projects.api.util.HeaderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OpenAppEndpoint implements GetRequest<OpenAppResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    @Autowired
    private Application application;

    @Override
    public String getURL() {
        String url = "/api/home/open_app?appid=" + application.getAppid() + "&appkey=" + application.getAppkey();
        if(application.getChannelId() != null){
            url += "&channelId=" + application.getChannelId();
        }
        if(application.getClientName() != null){
            url += "&clientName=" + application.getClientName();
        }
        return url;
    }

    @Override
    public Headers getJsonHeaders() {
        Header jgPushEnviroment = new Header("jg_push_environment", String.valueOf(application.getJg_push_environment()));
        Headers headers = HeaderUtils.addHeaders(requestHeaders.getGlobalHeader(), jgPushEnviroment);
        return headers;
    }

    @Override
    public Class<OpenAppResponse> getResponseClazz() {
        return OpenAppResponse.class;
    }
}
