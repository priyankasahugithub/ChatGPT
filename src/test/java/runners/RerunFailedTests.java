package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/rerun.txt",       // ⬅ read failed tests
        glue = {"stepDefinition"},
        plugin = {
                "pretty",
                "html:target/rerun-report.html"
        },
        monochrome = true
)
public class RerunFailedTests extends AbstractTestNGCucumberTests {
}
