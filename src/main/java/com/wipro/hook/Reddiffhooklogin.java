package com.wipro.hook;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wipro.base.Rediffbase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reddiffhooklogin extends Rediffbase{
	@Before
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@After
	public void closeSetup()
	{
		//driver.close();
		try {
            
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            
           
           
            File destination = new File("E:/AswinCucumber//login" + " "+ ".png");
            
            
            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot taken: " + destination.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
	}

}
