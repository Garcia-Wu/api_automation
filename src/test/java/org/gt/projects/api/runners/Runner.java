package org.gt.projects.api.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        tags = {"@All"},
        features = {"src/main/resources/features"},
        glue = {"org.gt.projects.api.steps", "org.gt.projects.api.core.hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber-report.json"
        }
)
public class Runner {
}
