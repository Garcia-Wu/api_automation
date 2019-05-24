package com.mongcent.tnaot.api.modules.my.endpoints;

import com.mongcent.tnaot.api.core.GetRequest;
import com.mongcent.tnaot.api.core.RequestHeaders;
import com.mongcent.tnaot.api.modules.my.data.response.GetMemberResponse;
import io.restassured.http.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetMemberEndpoint implements GetRequest<GetMemberResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    private String userName;

    @Override
    public String getURL() {
        return "/api/user/get_member?user_name="+userName;
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
