package com.wipro.Stepdef;

import com.wipro.base.RediffSignin;
import com.wipro.pom.RediffSigninPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStepDiff extends RediffSignin {
	RediffSigninPom obj=new RediffSigninPom();
	@Given("I navigate to the sign-in page")
	public void i_navigate_to_the_sign_in_page() {
	    driver.get("https://www.rediff.com/");
	}
	@When("I click the sig-in button")
	public void i_click_the_sig_in_button() {
	   obj.signButton();
	}
	@When("enter {string} in the username field")
	public void enter_in_the_username_field(String username) {
	    obj.enterUserName(username);
	}
	@When("enter {string} in the password field")
	public void enter_in_the_password_field(String password) {
	    obj.enterPassword(password);
	}
	@When("clicks the signin button")
	public void clicks_the_signin_button() {
	   obj.clickButton();
	}
	@Then("user should be logged successfully")
	public void user_should_be_logged_successfully() {
	    System.out.println("user should be successfully sign in");
	}

}
