package com.mongcent.tnaot.api.modules.news.steps;

import com.mongcent.tnaot.api.util.AssertUtil;
import cucumber.api.java8.En;
import com.mongcent.tnaot.api.modules.news.data.response.GetMyChannelResponse;
import com.mongcent.tnaot.api.modules.news.endpoints.GetMyChannelEndpoint;
import org.springframework.beans.factory.annotation.Autowired;


public class GetMyChannelStep implements En {

    @Autowired
    private GetMyChannelEndpoint getMyChannelEndpoint;
    private GetMyChannelResponse getMyChannelResponse;

    public GetMyChannelStep() {
        Given("^that a Get My Channel search request$", () -> {

        });
        When("^Get My Channel search successfully$", () -> {
            getMyChannelResponse = getMyChannelEndpoint.executeApiGetRequest();
        });
        Then("^check Get My Channel searching result state is (\\d+)$", (Integer state) -> {
            AssertUtil.assertNumberValue(state, getMyChannelResponse.getState());
        });
    }
}
