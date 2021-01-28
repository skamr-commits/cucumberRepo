package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.BaseTest;

@CucumberOptions(
        features = "C:\\CucumberPageObjectFramework-master\\Framework\\src\\test\\resources\\features",
        glue="stepDefinition",
        plugin = { "json:target/cucumber-reports/cucumber.json",
                "pretty", "html:target/html-report/cucumber-html-reports.html",
                "junit:target/cucumber-reports/cucumber.xml" }
        )

//1.Cucumber is a junit test. In order to run it as a testng test, we need to do the extends Abstract..
//2. Add TestNg mvn dependency in Pom.xml
//3. Create testNg.xml and add package.class for runner into the xml. See this project's testng.xml

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeMethod
	public static void setUp() {
		BaseTest.initialisationDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		try {
			BaseTest.closeDriver();
		}catch(Exception e) {
			e.printStackTrace();	
		}
	}

}
