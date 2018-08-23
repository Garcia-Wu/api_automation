package org.gt.projects.api.endpoints;


import io.restassured.http.Headers;
import org.gt.projects.api.core.GetRequest;
import org.gt.projects.api.core.RequestHeaders;
import org.gt.projects.api.data.response.CustomerOverviewResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerOverviewEndpoint implements GetRequest<CustomerOverviewResponse> {

    @Autowired
    private RequestHeaders requestHeaders;

    private String customerId;
    private String currency;

    @Override
    public String getURL() {
        return "/customer/"+customerId+"/overview?currency="+currency;
    }

    @Override
    public Headers getJsonHeaders() {
        return requestHeaders.getJsonHeaders();
    }

    @Override
    public Class<CustomerOverviewResponse> getResponseClazz() {
        return CustomerOverviewResponse.class;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
