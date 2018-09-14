package org.gt.projects.api.steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.gt.projects.api.core.BaseSteps;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.data.response.CustomerOverviewResponse;
import org.gt.projects.api.data.response.UserProfileResponse;
import org.gt.projects.api.endpoints.CustomerOverviewEndpoint;
import org.gt.projects.api.endpoints.UserProfileEndpoint;
import org.springframework.beans.factory.annotation.Autowired;

public class UserProfileStep extends BaseSteps implements En {

    @Autowired
    private UserProfileEndpoint userProfileEndpoint;

    private UserProfileResponse userProfileResponse;

    public UserProfileStep(){
        Given("^That a Customer UserProfile Search By capturing \"([^\"]*)\"$", (String amsession) -> {
            userProfileEndpoint.setAmsession(amsession);
        });

        When("^Customer UserProfile search record successfully$", () -> {
            userProfileResponse = userProfileEndpoint.executeApiGetRequest();
            RequestHeaders.setAmsessionHeader(userProfileEndpoint.getResponse().getHeader("AMSESSION"));
            RequestHeaders.setTokenHeader(userProfileEndpoint.getResponse().getHeader("LtpaToken2"));
        });


    }
}
