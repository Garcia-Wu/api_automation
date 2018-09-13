package org.gt.projects.api.core;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RequestHeaders {

    private static String amsessionHeader = "1";
    private static String tokenHeader = "2";

    private Header contentHeader = new Header("Content-Type","application/json");
    private Header acceptHeader = new Header("Accept", "application/json");

    public Headers getJsonHeaders(){
        List<Header> headerList = new ArrayList<>();
        headerList.add(contentHeader);
        headerList.add(acceptHeader);
        if(amsessionHeader != null && tokenHeader != null){
            headerList.add(new Header("AMSESSION", amsessionHeader));
            headerList.add(new Header("LtpaToken2", tokenHeader));
        }
        Headers headers = new Headers(headerList);
        return headers;
    }

    public static String getAmsessionHeader() {
        return amsessionHeader;
    }

    public static void setAmsessionHeader(String amsessionHeader) {
        RequestHeaders.amsessionHeader = amsessionHeader;
    }

    public static String getTokenHeader() {
        return tokenHeader;
    }

    public static void setTokenHeader(String tokenHeader) {
        RequestHeaders.tokenHeader = tokenHeader;
    }
}
