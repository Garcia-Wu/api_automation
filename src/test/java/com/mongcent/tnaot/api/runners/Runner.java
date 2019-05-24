package com.mongcent.tnaot.api.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        tags = {"@UpdateMember"},
        features = {"src/main/resources/features"},
        glue = {"com.mongcent.tnaot.api.modules.common.steps",
                "com.mongcent.tnaot.api.modules.news.steps",
                "com.mongcent.tnaot.api.modules.dynamic.steps",
                "com.mongcent.tnaot.api.modules.my.steps",
                "com.mongcent.tnaot.api.modules.video.steps",
                "com.mongcent.tnaot.api.core.hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber-report.json"
        }
)
public class Runner {
}
