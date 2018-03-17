package automationtest;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/automationtest/features/",
        //  tags = {"@validLogin,@Register"},
        //  tags={"@smoke"},
        //tags = {"@checkout"},
        tags = {"@search"},

        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"})

public class RunTest
        {
        }
