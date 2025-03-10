package com.wipro.pom;

import org.openqa.selenium.By;

import com.wipro.base.RediffSignin;

public class RediffSigninPom extends RediffSignin{
	By signinBtn=By.xpath("//a[text()='Sign in']");
	public void signButton()
	{
		driver.findElement(signinBtn).click();
	}
	By Username=By.xpath("//*[@id=\"login1\"]");
	public void enterUserName(String uname)
	{
		driver.findElement(Username).sendKeys(uname);
	}
	By Password=By.xpath("//*[@id=\"password\"]");
	public void enterPassword(String pass)
	{
		driver.findElement(Password).sendKeys(pass);
	}
	By Clickbtn=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]");
	public void clickButton()
	{
		driver.findElement(Clickbtn).click();
	}

}
