package com.mongcent.tnaot.api.modules.common.endpoints;

import com.mongcent.tnaot.api.core.CurrentMember;
import com.mongcent.tnaot.api.modules.common.data.request.LoginRequestBody;
import io.restassured.http.Headers;
import com.mongcent.tnaot.api.core.PostRequest;
import com.mongcent.tnaot.api.core.RequestHeaders;
import com.mongcent.tnaot.api.modules.common.data.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginEndpoint implements PostRequest<LoginRequestBody, LoginResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    private String areaCode;
    private String userName;
    private String password;

    @Override
    public String getURL() {
        return "/api/home/login?area_code="+areaCode+"&user_name="+userName+"&pwd="+password;
    }

    @Override
    public Headers getJsonHeaders() {
//        Headers setContentTypeHeaders = HeaderUtils.setContentType(requestHeaders.getJsonHeaders(),"application/x-www-form-urlencoded");
//        return setContentTypeHeaders;
        return requestHeaders.getJsonHeaders();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
