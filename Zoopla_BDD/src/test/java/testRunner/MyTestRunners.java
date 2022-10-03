package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
features = { "src/test/resources/HomePricePage.feature" }, 
glue = { "StepDefinitions" }, 
plugin = { "pretty",
		"html:target/HtmlReports/report.html",
		"junit:target/JUnitReports/reports.xml" },

monochrome = true)

public class MyTestRunners {

}
                                            