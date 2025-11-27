package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/features",
        glue = {"stepDefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" }         // ⬅ generate failed test list}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

