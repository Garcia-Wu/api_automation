package com.mongcent.tnaot.api.modules.news.steps;

import com.mongcent.tnaot.api.modules.news.data.response.GetChannelListResponse;
import com.mongcent.tnaot.api.modules.news.endpoints.GetChannelListEndpoint;
import com.mongcent.tnaot.api.util.AssertUtil;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class GetChannelListStep implements En {

    @Autowired
    private GetChannelListEndpoint getChannelListEndpoint;
    private GetChannelListResponse getChannelListResponse;

    public GetChannelListStep() {
        Given("^that a Get Channel List search request by \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$", (Integer channelId, Integer action, Integer index, Integer needTopNews) -> {
            getChannelListEndpoint.setChannelId(channelId);
            getChannelListEndpoint.setAction(action);
            getChannelListEndpoint.setIndex(index);
            getChannelListEndpoint.setNeedTopNews(needTopNews);
        });

        When("^Get Channel List search successfully$", () -> {
            getChannelListResponse = getChannelListEndpoint.executeApiGetRequest();
        });

        Then("^check Get Channel List searching result state is (\\d+)$", (Integer state) -> {
            AssertUtil.assertNumberValue(state, getChannelListResponse.getState());
        });
    }
}
