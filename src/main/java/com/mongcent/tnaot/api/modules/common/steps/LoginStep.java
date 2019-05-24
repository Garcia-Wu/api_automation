package com.mongcent.tnaot.api.modules.common.steps;

import com.mongcent.tnaot.api.core.CurrentMember;
import com.mongcent.tnaot.api.modules.common.data.request.LoginRequestBody;
import com.mongcent.tnaot.api.modules.common.endpoints.LoginEndpoint;
import com.mongcent.tnaot.api.util.AssertUtil;
import cucumber.api.java8.En;
import com.mongcent.tnaot.api.core.BaseSteps;
import com.mongcent.tnaot.api.modules.common.data.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginStep extends BaseSteps implements En {

    @Autowired
    private CurrentMember currentMember;

    @Autowired
    private LoginEndpoint loginEndpoint;
    private LoginResponse loginResponse;
    private LoginRequestBody loginRequestBody = new LoginRequestBody();

    public LoginStep(){
        Given("^I login as member \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$", (String areaCode, String userName, String password) -> {
            loginEndpoint.setAreaCode(areaCode);
            loginEndpoint.setUserName(userName);
            loginEndpoint.setPassword(password);
        });

        When("^Login App successfully$", () -> {
            loginResponse = loginEndpoint.executeApiPostRequest(loginRequestBody);
        });

        Then("^Check that the area code and mobile are correct$", () -> {
            AssertUtil.assertEquals(loginEndpoint.getAreaCode(), loginResponse.getResult().getMobile_area_code());
            AssertUtil.assertEquals(loginEndpoint.getUserName(), loginResponse.getResult().getMobile());
            // 保存用户信息
            currentMember.setArea_code(loginEndpoint.getAreaCode());
            currentMember.setUser_name(loginEndpoint.getUserName());
            currentMember.setPassword(loginEndpoint.getPassword());
            currentMember.setMemberId(loginResponse.getResult().getMember_id());
        });

    }
}
