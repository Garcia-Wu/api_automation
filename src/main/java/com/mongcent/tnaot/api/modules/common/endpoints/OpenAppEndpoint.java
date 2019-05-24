package com.mongcent.tnaot.api.modules.common.endpoints;

import com.mongcent.tnaot.api.core.GetRequest;
import com.mongcent.tnaot.api.core.RequestHeaders;
import com.mongcent.tnaot.api.core.spring.properties.models.Application;
import com.mongcent.tnaot.api.util.HeaderUtils;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import com.mongcent.tnaot.api.modules.common.data.response.OpenAppResponse;
import org.apache.commons.lang3.StringUtils;
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
        if(StringUtils.isNotBlank(application.getChannelId())){
            url += "&channelId=" + application.getChannelId();
        }
        if(StringUtils.isNotBlank(application.getClientName())){
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
}
