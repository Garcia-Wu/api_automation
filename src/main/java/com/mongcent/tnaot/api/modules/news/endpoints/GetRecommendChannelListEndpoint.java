package com.mongcent.tnaot.api.modules.news.endpoints;

import com.mongcent.tnaot.api.core.GetRequest;
import com.mongcent.tnaot.api.core.RequestHeaders;
import com.mongcent.tnaot.api.modules.news.data.response.GetRecommendChannelListResponse;
import io.restassured.http.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetRecommendChannelListEndpoint implements GetRequest<GetRecommendChannelListResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    @Override
    public String getURL() {
        return "/api/channel/get_recommend_channel_list";
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }
}
