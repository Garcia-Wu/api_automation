package org.gt.projects.api.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.gt.projects.api.core.BaseSteps;
import org.gt.projects.api.data.request.LoginRequestBody;
import org.gt.projects.api.data.response.LoginResponse;
import org.gt.projects.api.endpoints.LoginEndpoint;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class LoginStep extends BaseSteps implements En {

    @Autowired
    private LoginEndpoint loginEndpoint;
    private LoginResponse loginResponse;
    private LoginRequestBody loginRequestBody = new LoginRequestBody();

    public LoginStep(){
        Given("^I login as member$", (DataTable dataTable) -> {
            Map<String, String> map = dataTable.asMap(String.class, String.class);
            loginRequestBody.setArea_code(map.get("areaCode"));
            loginRequestBody.setUser_name(map.get("mobile"));
            loginRequestBody.setPassword(map.get("password"));
        });

        When("^Login App successfully$", () -> {
            loginResponse = loginEndpoint.executeApiPostRequest(loginRequestBody);
        });

        Then("^Check the state is \"([^\"]*)\"$", (Integer state) -> {
            Assert.assertTrue(state == loginResponse.getState());
        });


    }
}
