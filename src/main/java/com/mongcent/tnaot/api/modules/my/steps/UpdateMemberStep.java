package com.mongcent.tnaot.api.modules.my.steps;

import com.mongcent.tnaot.api.modules.my.data.request.UpdateMemberRequestBody;
import com.mongcent.tnaot.api.modules.my.data.response.UpdateMemberResponse;
import com.mongcent.tnaot.api.modules.my.endpoints.UpdateMemberEndpoint;
import com.mongcent.tnaot.api.util.AssertUtil;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateMemberStep implements En {

    @Autowired
    private UpdateMemberEndpoint updateMemberEndpoint;
    private UpdateMemberResponse updateMemberResponse;
    private UpdateMemberRequestBody updateMemberRequestBody = new UpdateMemberRequestBody();

    public UpdateMemberStep() {
        Given("^that a Update Member search request by \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$", (String nickName, String memberGender, String countryId, String provinceName, String memberBirthdate, String memberIntroduction) -> {
            updateMemberRequestBody.setNick_name(nickName);
            updateMemberRequestBody.setMember_gender(memberGender);
            updateMemberRequestBody.setMember_birthdate(memberBirthdate);
            updateMemberRequestBody.setCountry_id(countryId);
            updateMemberRequestBody.setProvince_name(provinceName);
            updateMemberRequestBody.setMember_Introduction(memberIntroduction);
        });

        When("^Update Member request successfully$", () -> {
            updateMemberResponse = updateMemberEndpoint.executeApiPostRequest(updateMemberRequestBody);
        });

        Then("^check Update Member request result state is (\\d+)$", (Integer state) -> {
            AssertUtil.assertNumberValue(state, updateMemberResponse.getState());
        });
    }
}
