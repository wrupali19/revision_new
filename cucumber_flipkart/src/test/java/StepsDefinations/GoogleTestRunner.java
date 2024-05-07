package StepsDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Features\\searchgoogle.feature"} , glue= {"StepsDefinations"}, monochrome=true ,
plugin= {"pretty", "html:target/HtmlReports"})

public class GoogleTestRunner {

}
