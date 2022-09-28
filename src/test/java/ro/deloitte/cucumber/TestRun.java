package ro.deloitte.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ro.deloitte"},
        tags = "@myFirstCucumber",
        features = "classpath:features",
        plugin = {"pretty",
                "json:target/cucumber-reports-api/Cucumber.json",
                "junit:target/cucumber-reports-api/Cucumber.xml",
                "html:target/cucumber-reports-api/report.html"})
public class TestRun {

}
