package com.mongcent.tnaot.api.core.hooks;

import com.github.tomakehurst.wiremock.WireMockServer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import com.mongcent.tnaot.api.core.spring.properties.models.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.Arrays;

public class ScenarioHook {

    @Autowired
    private Application application;

    @Autowired
    private Environment env;

//    @Autowired
//    private List<Stub> stubs;

    private WireMockServer wireMockServer;
    private boolean isMock;

    @Before
    public void beforeScenario(){
        RestAssured.baseURI = application.getUrl();
        isMock = Arrays.stream(env.getActiveProfiles()).anyMatch(env -> env.equalsIgnoreCase("mock"));
        if(isMock){
            wireMockServer = new WireMockServer(8080);
            wireMockServer.start();
//            stubs.forEach(Stub::createStub);
        }
    }

    @After
    public void afterScenario(){
        RestAssured.reset();
        if(isMock){
            wireMockServer.resetAll();
            wireMockServer.stop();
        }
    }
}
