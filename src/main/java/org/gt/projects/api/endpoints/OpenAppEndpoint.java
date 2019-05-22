package org.gt.projects.api.endpoints;

import io.restassured.http.Headers;
import org.gt.projects.api.core.GetRequest;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.core.spring.properties.models.Application;
import org.gt.projects.api.data.response.OpenAppResponse;
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
        String url = "/api/home/open_app?appid=" + application.getAppid() + "&appKey=" + application.getAppkey();
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
        return requestHeaders.getJsonHeaders();
    }

    @Override
    public Class<OpenAppResponse> getResponseClazz() {
        return OpenAppResponse.class;
    }
}
