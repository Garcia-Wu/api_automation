package org.gt.projects.api.endpoints;

import io.restassured.http.Headers;
import org.gt.projects.api.core.PostRequest;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.data.request.AccountOverviewRequestBody;
import org.gt.projects.api.data.response.AccountOverviewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountOverviewEndpoint implements PostRequest<AccountOverviewRequestBody, AccountOverviewResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    @Override
    public String getURL() {
        return "http://120.26.134.114:8088/mobile/v1/accounts/overview";
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }

    @Override
    public Class<AccountOverviewResponse> getResponseClazz() {
        return AccountOverviewResponse.class;
    }
}
