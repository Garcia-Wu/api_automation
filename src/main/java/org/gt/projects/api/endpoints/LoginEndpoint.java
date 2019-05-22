package org.gt.projects.api.endpoints;

import io.restassured.http.Headers;
import org.gt.projects.api.core.PostRequest;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.data.request.LoginRequestBody;
import org.gt.projects.api.data.response.LoginResponse;
import org.gt.projects.api.util.HeaderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginEndpoint implements PostRequest<LoginRequestBody, LoginResponse> {


    @Autowired
    private RequestHeaders requestHeaders;

    private String area_code;
    private String user_name;
    private String password;

    @Override
    public String getURL() {
        return "/api/home/login?area_code="+area_code+"&user_name="+user_name+"&pwd="+password;
    }

    @Override
    public Headers getJsonHeaders() {
//        Headers setContentTypeHeaders = HeaderUtils.setContentType(requestHeaders.getJsonHeaders(),"application/x-www-form-urlencoded");
//        return setContentTypeHeaders;
        return requestHeaders.getJsonHeaders();
    }

    @Override
    public Class<LoginResponse> getResponseClazz() {
        return LoginResponse.class;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
