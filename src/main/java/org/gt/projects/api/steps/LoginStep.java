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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStep extends BaseSteps implements En {

    @Autowired
    private LoginEndpoint loginEndpoint;
    private LoginResponse loginResponse;
    private LoginRequestBody loginRequestBody = new LoginRequestBody();

    public LoginStep(){
        Given("^I login as member$", (DataTable dataTable) -> {
            Map<String, String> map = dataTable.asMap(String.class, String.class);
//            loginRequestBody.setArea_code(map.get("area_code"));
//            loginRequestBody.setUser_name(map.get("user_name"));
//            loginRequestBody.setPassword(map.get("password"));
            loginEndpoint.setArea_code(map.get("area_code"));
            loginEndpoint.setUser_name(map.get("user_name"));
            loginEndpoint.setPassword(map.get("password"));
        });

        When("^Login App successfully$", () -> {
            loginResponse = loginEndpoint.executeApiPostRequest(loginRequestBody);
        });

        Then("^Check that the area code and mobile are correct$", () -> {
            assertEquals(loginEndpoint.getArea_code(), loginResponse.getResult().getMobile_area_code());
            assertEquals(loginEndpoint.getUser_name(), loginResponse.getResult().getMobile());
        });


    }
}
