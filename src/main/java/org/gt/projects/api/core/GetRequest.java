package org.gt.projects.api.core;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.JsonConfig;
import io.restassured.http.Headers;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.Response;

public interface GetRequest<S> {

    String getURL();

    Headers getJsonHeaders();

    Class<S> getResponseClazz();

    default S executeApiGetRequest(){
        return getResponse().then().log().all().extract().as(getResponseClazz());
    }

    default Response getResponse(){
        Response response = RestAssured.given().log().all().auth().preemptive().basic("","").
                config(
                        RestAssured.config().
                                encoderConfig(new EncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)).
                                jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.BIG_DECIMAL))
                ).
                relaxedHTTPSValidation().headers(getJsonHeaders()).get(getURL());

        return response;
    }

//    default S executeApiGetRequestQueryParams(Map<String, String> params){
//        ValidatableResponse response = RestAssured.given().log().all().auth().preemptive().basic("","").
//                params(params).
//                config(
//                        RestAssured.config().
//                                encoderConfig(new EncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)).
//                                jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.BIG_DECIMAL))
//                ).
//                relaxedHTTPSValidation().headers(getJsonHeaders()).get(getURL()).then().log().all();
//
//        return response.extract().as(getResponseClazz());
//    }

}
