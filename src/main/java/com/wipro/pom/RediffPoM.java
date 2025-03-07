package com.wipro.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import com.wipro.base.Rediffbase;



public class RediffPoM extends Rediffbase {
	By ClickCreate=By.xpath("//a[text()='Create Account']");
	public void clickCreateAccount()
	{
		driver.findElement(ClickCreate).click();
	}
	By Fullname=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input");
	public void enterFullName(String name)
	{
		driver.findElement(Fullname).sendKeys(name);
	}
	By ChooseEmail=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]");
	public void enterEmail(String email)
	{
		driver.findElement(ChooseEmail).sendKeys(email);
	}
	By CheckAvaible=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input");
	public void checkBtn()
	{
		driver.findElement(CheckAvaible).click();
	}
	By Password=By.xpath("//input[@id='newpasswd']");
	public void clickPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
		
	}
	By retyepPass=By.xpath("//*[@id=\"newpasswd1\"]");
	public void retypePassword(String password)
	{
		driver.findElement(retyepPass).sendKeys(password);
	}
	By Alternativeemail=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input");
	public void altEmail(String altemail)
	{
		driver.findElement(Alternativeemail).sendKeys(altemail);
	}
	By Mobilenumber=By.xpath("//*[@id=\"mobno\"]");
	public void Mobileno(String number)
	{
		driver.findElement(Mobilenumber).sendKeys(number);
		
	}
	By Selectdob=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]");
	By SelectMonth=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]");
	By SelectYear=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]");
	public void selectDMY(int index1,int index2,int index3)
	{
		Select select1=new Select(driver.findElement(Selectdob));
		select1.selectByIndex(index1);
		Select select2=new Select(driver.findElement(SelectMonth));
		select2.selectByIndex(index2);
		Select select3=new Select(driver.findElement(SelectYear));
		select3.selectByIndex(index3);
	}
	By Genderselection=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[1]");
	public void selectGender()
	{
		driver.findElement(Genderselection).click();;
	}
	By SelectCountry=By.xpath("//*[@id=\"country\"]");
	public void selectCont(int index1)
	{
		Select select1=new Select(driver.findElement(SelectCountry));
		select1.selectByIndex(index1);
		
		
	}
	
	
	By Selectcapcha=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input");
	public void enterCapcha(String text)
	{
		driver.findElement(Selectcapcha).sendKeys(text);
	}
	
    By Submit=By.xpath("//*[@id=\"Register\"]");
	
	public void clickSubmit()
	{
		driver.findElement(Submit).click();
	}

}
