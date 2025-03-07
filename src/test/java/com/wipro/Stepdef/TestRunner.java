package com.wipro.Stepdef;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"E:\\workspace\\RedDiffBdd\\src\\test\\resources\\feature\\REdiffLogin.feature"},
    glue = {"com.wipro.Stepdef", "com.wipro.hook"}, plugin={"pretty", "html:Reports/cucumber-reports.html",
			"json:Reports/json-reports.json",
 "junit:Reports/junit-reports.xml"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
