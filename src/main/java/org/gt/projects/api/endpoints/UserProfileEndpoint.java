package org.gt.projects.api.endpoints;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.gt.projects.api.core.GetRequest;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.data.response.UserProfileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserProfileEndpoint implements GetRequest<UserProfileResponse> {

    private String amsession;

    @Autowired
    private RequestHeaders requestHeaders;

    @Override
    public String getURL() {
        return "/customer/userprofile";
    }

    @Override
    public Headers getJsonHeaders() {

        List<Header> headers = new ArrayList<>(requestHeaders.getJsonHeaders().asList());
        headers.add(new Header("AMSESSION",amsession));

        //requestHeaders.addHeader("amsession", amsession);
        return new Headers(headers);
    }

    @Override
    public Class<UserProfileResponse> getResponseClazz() {
        return UserProfileResponse.class;
    }

    public String getAmsession() {
        return amsession;
    }

    public void setAmsession(String amsession) {
        this.amsession = amsession;
    }
}
