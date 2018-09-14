package org.gt.projects.api.core;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RequestHeaders {

    private static String amsessionHeader;
    private static String tokenHeader;
    //private List<Header> headerList = new ArrayList<>();

    private Header contentHeader = new Header("Content-Type","application/json");
    private Header acceptHeader = new Header("Accept", "application/json");

    public Headers getJsonHeaders(){
//        headerList.add(contentHeader);
//        headerList.add(acceptHeader);
        List<Header> headerList = new ArrayList<>(new Headers(contentHeader, acceptHeader).asList());
        //headerList.add(new Header("amsession",amsessionHeader));

        if(amsessionHeader != null && tokenHeader != null){
            headerList.add(new Header("AMSESSION", amsessionHeader));
            headerList.add(new Header("LtpaToken2", tokenHeader));

        }
        return new Headers(headerList);
    }

//    public void addHeader(String name, String value){
//        headerList.add(new Header(name, value));
//    }

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
