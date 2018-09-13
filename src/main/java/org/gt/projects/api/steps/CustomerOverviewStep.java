package org.gt.projects.api.steps;

import cucumber.api.java8.En;
import org.gt.projects.api.core.BaseSteps;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.data.response.CustomerOverviewResponse;
import org.gt.projects.api.endpoints.CustomerOverviewEndpoint;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerOverviewStep extends BaseSteps implements En {

    @Autowired
    private CustomerOverviewEndpoint customerOverviewEndpoint;

    private CustomerOverviewResponse customerOverviewResponse;

    public CustomerOverviewStep(){

        Given("^That a Customer Overview Search By capturing \"([^\"]*)\" and \"([^\"]*)\"$", (String customerId, String requestCurrency) -> {
            customerOverviewEndpoint.setCustomerId(customerId);
            customerOverviewEndpoint.setCurrency(requestCurrency);
            customerOverviewEndpoint.setAmsession("sdfsdf");

        });
        When("^Customer Overview search record successfully$", () -> {
            customerOverviewResponse = customerOverviewEndpoint.executeApiGetRequest();
            System.out.println("return data code: "+customerOverviewResponse.getCode());
        });


    }
}
