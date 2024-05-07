package StepsDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Features\\makemytrip.feature"} , glue= {"StepsDefinations"}, 
plugin= {"pretty", "html:target/HtmlReports"})
public class TestRunnerMakemytrip {

}
