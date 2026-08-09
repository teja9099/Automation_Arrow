package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue={"StepDefinitions"},
monochrome=true, 
plugin={"pretty","html:target/HtmlReport/report.html",
		"pretty","json:target/HtmlReport/report.json",
		"pretty","junit:target/HtmlReport/report.xml",
		"pretty","rerun:target/failed_scenarios.txt"}
//plugin={"pretty","json:target/HtmlReport/report.json"},
//plugin={"pretty","junit:target/HtmlReport/report.xml"}
)

public class TestRunner {

}
