package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue =  "step_definitions",
        dryRun = false,
     //   monochrome = true,
       // tags = "@Scenario_outline",
       // tags = "@Scenario_1"
        //tags = "@Scenario_2"
       // tags = "@Scenario_3"
        plugin = {"pretty:target/cucumber-pretty.txt",
                "json:target/cucumber.json",
                "html:target/html-report",
                "junit:target/junit/unit-report.xml",

        }
)
public class TestRunner {

}
