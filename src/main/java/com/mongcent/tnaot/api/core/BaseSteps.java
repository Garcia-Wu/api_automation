package com.mongcent.tnaot.api.core;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.mongcent.tnaot.api.core.spring.SpringTestAutomationConfig;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.JsonConfig;
import io.restassured.http.Headers;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.ValidatableResponse;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIn.isOneOf;

@ContextConfiguration(
        classes = SpringTestAutomationConfig.class,
        loader = SpringBootContextLoader.class
)
public class BaseSteps {

    protected WireMockServer wireMockServer = new WireMockServer(8080);

    protected <S, T> T executeAPIPost(String url, Headers headers, S requestBody, Class<T> responseClazz){
        ValidatableResponse response = callPost(url, headers, requestBody);
        assertStatusCodeOK(response);
        return response.extract().as(responseClazz);
    }

    protected <T> T executeAPIGet(String url, Headers headers, Class<T> responseClazz){
        ValidatableResponse response = callGet(url, headers);
        assertStatusCodeOK(response);
        return response.extract().as(responseClazz);
    }

    private <S>ValidatableResponse callPost(String url, Headers headers, S requestBody){
        return RestAssured.given().log().all().auth().preemptive().basic("","").
                config(
                        RestAssured.config().
                                encoderConfig(new EncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)).
                                jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.BIG_DECIMAL))
                ).
                relaxedHTTPSValidation().headers(headers).body(requestBody).post(url).then().log().all();
    }

    private ValidatableResponse callGet(String url, Headers headers){
        return RestAssured.given().log().all().auth().preemptive().basic("","").
                config(
                        RestAssured.config().
                                encoderConfig(new EncoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)).
                                jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.BIG_DECIMAL))
                ).
                relaxedHTTPSValidation().headers(headers).get(url).then().log().all();
    }

    private void assertStatusCodeOK(ValidatableResponse response){
        assertThat("check response status code", response.extract().statusCode(), isOneOf(200, 201));
    }
}
