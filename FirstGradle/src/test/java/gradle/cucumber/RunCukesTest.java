package gradle.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:build/cucumber-html-report", "json-pretty:build/cucumber-report.json"}, tags = {"@dataTable"})
public class RunCukesTest {

	
	

}
