package com.mongcent.tnaot.api.modules.my.endpoints;

import com.mongcent.tnaot.api.core.PostRequest;
import com.mongcent.tnaot.api.core.RequestHeaders;
import com.mongcent.tnaot.api.modules.my.data.request.UpdateMemberRequestBody;
import com.mongcent.tnaot.api.modules.my.data.response.UpdateMemberResponse;
import io.restassured.http.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateMemberEndpoint implements PostRequest<UpdateMemberRequestBody, UpdateMemberResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    @Override
    public String getURL() {
        return "/api/user/update_member";
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }
}
