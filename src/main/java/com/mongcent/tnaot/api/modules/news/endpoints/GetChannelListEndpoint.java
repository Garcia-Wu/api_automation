package com.mongcent.tnaot.api.modules.news.endpoints;

import com.mongcent.tnaot.api.core.GetRequest;
import com.mongcent.tnaot.api.core.RequestHeaders;
import com.mongcent.tnaot.api.modules.news.data.response.GetChannelListResponse;
import io.restassured.http.Headers;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetChannelListEndpoint implements GetRequest<GetChannelListResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    private Integer action;
    private Integer channelId;
    private Integer index;
    private Integer needTopNews;

    @Override
    public String getURL() {
        String url = "/api/news/get_channel_list?channel_id=" + channelId;
        if(action != null){
            url += "&action=" + action;
        }
        if(index != null){
            url += "&index=" + index;
        }
        if(needTopNews != null){
            url += "&need_top_news=" + needTopNews;
        }
        return url;
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getNeedTopNews() {
        return needTopNews;
    }

    public void setNeedTopNews(Integer needTopNews) {
        this.needTopNews = needTopNews;
    }
}
