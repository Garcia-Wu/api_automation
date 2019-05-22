package org.gt.projects.api.util;

import io.restassured.http.Header;
import io.restassured.http.Headers;

import java.util.ArrayList;
import java.util.List;

public class HeaderUtils {

    public static Headers addHeaders(Headers headers, Header...newHeaders){
        List<Header> headerList = new ArrayList<>(headers.asList());
        for(Header header : newHeaders){
            headerList.add(header);
        }
        return new Headers(headerList);
    }

    public static Headers setContentType(Headers headers, String contentType){
        List<Header> headerList = new ArrayList<>(headers.asList());
        headerList.add(new Header("Content-Type", contentType));
        return new Headers(headerList);
    }

}
