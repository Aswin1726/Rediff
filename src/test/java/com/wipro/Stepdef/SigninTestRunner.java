package com.wipro.Stepdef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"E:\\workspace\\RedDiffBdd\\src\\test\\resources\\feature\\Signin.feature"},glue={"com.wipro.Stepdef","com.wipro.hook"},plugin={"pretty", "html:Reports/cucumber.html",
		"json:Reports/json-reports1.json",
"junit:Reports/junit-reports1.xml"}

)

public class SigninTestRunner extends AbstractTestNGCucumberTests  {

}
