package com.wipro.hook;

import org.openqa.selenium.chrome.ChromeDriver;

import com.wipro.base.RediffSignin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffsigninHook extends RediffSignin{
	
	@Before 
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@After
	public void closeSetup()
	{
		driver.close();
	}

}
