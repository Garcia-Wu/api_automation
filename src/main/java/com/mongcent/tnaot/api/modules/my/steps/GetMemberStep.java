package com.mongcent.tnaot.api.modules.my.steps;

import com.mongcent.tnaot.api.modules.my.data.response.GetMemberResponse;
import com.mongcent.tnaot.api.modules.my.endpoints.GetMemberEndpoint;
import com.mongcent.tnaot.api.util.AssertUtil;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class GetMemberStep implements En {

    @Autowired
    private GetMemberEndpoint getMemberEndpoint;
    private GetMemberResponse getMemberResponse;

    public GetMemberStep() {
        Given("^that a Get Member search request by \"([^\"]*)\"$", (String userName) -> {
            getMemberEndpoint.setUserName(userName);
        });

        When("^Get Member search successfully$", () -> {
            getMemberResponse = getMemberEndpoint.executeApiGetRequest();
        });

        Then("^check Get Member searching result state is (\\d+)$", (Integer state) -> {
            AssertUtil.assertNumberValue(state, getMemberResponse.getState());
        });
    }
}
