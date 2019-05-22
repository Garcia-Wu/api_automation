package org.gt.projects.api.endpoints;

import io.restassured.http.Headers;
import org.gt.projects.api.core.PostRequest;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.data.request.LoginRequestBody;
import org.gt.projects.api.data.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginEndpoint implements PostRequest<LoginRequestBody, LoginResponse> {


    @Autowired
    private RequestHeaders requestHeaders;

    @Override
    public String getURL() {
        return "/api/home/login";
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }

    @Override
    public Class<LoginResponse> getResponseClazz() {
        return LoginResponse.class;
    }
}
