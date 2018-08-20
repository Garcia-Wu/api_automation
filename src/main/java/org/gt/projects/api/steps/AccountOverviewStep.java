package org.gt.projects.api.steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.gt.projects.api.core.BaseSteps;
import org.gt.projects.api.data.request.AccountOverviewRequestBody;
import org.gt.projects.api.data.response.AccountOverviewResponse;
import org.gt.projects.api.endpoints.AccountOverviewEndpoint;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountOverviewStep extends BaseSteps implements En {

    @Autowired
    private AccountOverviewEndpoint accountOverviewEndpoint;

    private AccountOverviewResponse accountOverviewResponse;

    private AccountOverviewRequestBody accountOverviewRequestBody = new AccountOverviewRequestBody();

    public AccountOverviewStep(){
        Given("^That a Account Overview Search By capturing \"([^\"]*)\" and \"([^\"]*)\"$", (String accountIds, String currency) -> {
            accountOverviewRequestBody.setIds(accountIds.split(","));
            accountOverviewRequestBody.setCurrency(currency);
        });
        When("^Account Overview search record successfully$", () -> {
            accountOverviewResponse = accountOverviewEndpoint.executeApiPostRequest(accountOverviewRequestBody);
            System.out.println("return data code: "+accountOverviewResponse.getCode());
        });
    }
}
