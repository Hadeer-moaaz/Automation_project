package org.example.TestRunner;


//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src\\main\\resources\\features",
        glue = "org.example.StepDefs",
        plugin = {

                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},

        tags = "@smoke"


)
public class Runner extends AbstractTestNGCucumberTests {}




