package com.mongcent.tnaot.api.core;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.JsonConfig;
import io.restassured.http.Headers;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.lang.reflect.ParameterizedType;

public interface PostRequest<R, S> {

    String getURL();

    Headers getJsonHeaders();

    // 获取response class
    default Class<S> getResponseClazz(){
        Class<S> entityClass = (Class<S>) ((ParameterizedType) getClass().getGenericInterfaces()[0]).getActualTypeArguments()[1];
        return entityClass;
    }

    default S executeApiPostRequest(R requestBody) {
        return getResponse(requestBody).then().log().all().extract().as(getResponseClazz());
    }

    default Response getResponse(R requestBody) {
        Response response = RestAssured.given().log().all().auth().preemptive().basic("", "").
                config(
                        RestAssured.config().
                                encoderConfig(new EncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)).
                                jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.BIG_DECIMAL))
                ).
                relaxedHTTPSValidation().headers(getJsonHeaders()).body(requestBody).post(getURL());

        return response;
    }
}