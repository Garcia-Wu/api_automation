package com.mongcent.tnaot.api.modules.news.endpoints;

import io.restassured.http.Headers;
import com.mongcent.tnaot.api.core.GetRequest;
import com.mongcent.tnaot.api.core.RequestHeaders;
import com.mongcent.tnaot.api.modules.news.data.response.GetMyChannelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetMyChannelEndpoint implements GetRequest<GetMyChannelResponse>{

    @Autowired
    private RequestHeaders requestHeaders;

    @Override
    public String getURL() {
        return "/api/user/get_my_channel_list";
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }
}
