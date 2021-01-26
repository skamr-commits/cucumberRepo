package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\CucumberPageObjectFramework-master\\Framework\\src\\test\\resources\\features\\Register.feature",
        glue="stepDefinition",
        plugin = { "json:target/cucumber-reports/cucumber.json",
                "pretty", "html:target/html-report/cucumber-html-reports.html",
                "junit:target/cucumber-reports/cucumber.xml" }
        )

public class TestRunner extends AbstractTestNGCucumberTests {

}
