package step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(//tags = { "@addEmployee" }, 
				features = { "classpath:features/" }, 
				glue = {"classpath:step_definitions" },  
				plugin = {"pretty","html:target/cucumber", "json:target/cucumber-reports/CucumberTestReport.json"})
public class RunCukesTest {

}