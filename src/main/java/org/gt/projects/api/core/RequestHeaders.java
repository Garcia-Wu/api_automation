package org.gt.projects.api.core;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.springframework.stereotype.Component;

@Component
public class RequestHeaders {

    private Header contentHeader = new Header("Content-Type","application/json");
    private Header acceptHeader = new Header("Accept", "application/json");

    public Headers getJsonHeaders(){
        return new Headers(contentHeader, acceptHeader);
    }
}
