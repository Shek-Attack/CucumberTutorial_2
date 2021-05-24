package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber1.json",
                "html:target/default-html-reports1",
                "rerun:target/rerun.txt",

        },
        features = "src/test/resources/features",
        glue =  "step_definitions",
        dryRun = false
        //monochrome = true,
        // tags = "@Scenario_outline",
        //tags = "@Scenario_1"
        //tags = "@Scenario_2"
        // tags = "@Scenario_3"

)
public class FailedRunner {

}
