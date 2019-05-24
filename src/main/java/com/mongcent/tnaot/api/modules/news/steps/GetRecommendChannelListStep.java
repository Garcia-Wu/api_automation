package com.mongcent.tnaot.api.modules.news.steps;

import com.mongcent.tnaot.api.modules.news.data.response.GetRecommendChannelListResponse;
import com.mongcent.tnaot.api.modules.news.endpoints.GetRecommendChannelListEndpoint;
import com.mongcent.tnaot.api.util.AssertUtil;
import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class GetRecommendChannelListStep implements En {

    @Autowired
    private GetRecommendChannelListEndpoint getRecommendChannelListEndpoint;
    private GetRecommendChannelListResponse getRecommendChannelListResponse;

    public GetRecommendChannelListStep() {
        Given("^that a Get Recommend Channel List search request$", () -> {

        });
        When("^Get Recommend Channel List search successfully$", () -> {
            getRecommendChannelListResponse = getRecommendChannelListEndpoint.executeApiGetRequest();
        });
        Then("^check Get Recommend Channel List searching result state is (\\d+)$", (Integer state) -> {
            AssertUtil.assertNumberValue(state, getRecommendChannelListResponse.getState());
        });

    }
}
