package StepsDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Features\\amazonindia.feature"} , glue= {"StepsDefinations"}, 
tags= "@smoke or @Regration" ,monochrome=true ,
plugin= {"pretty", "html:target/HtmlReports"})

public class TestRunnerAmazon {

}
