package com.wipro.Stepdef;

import com.wipro.base.Rediffbase;
import com.wipro.pom.RediffPoM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefRediffLogin extends Rediffbase {
	RediffPoM obj=new RediffPoM();
	@Given("the Rediffmail signup page is open")
	public void the_rediffmail_signup_page_is_open() {
		driver.get("https://www.rediff.com/");

	}

	@When("click the create account button")
	public void click_the_create_account_button() {
		obj.clickCreateAccount();
	}

	@When("{string} username is entered")
	public void username_is_entered(String username) {
		obj.enterFullName(username);

	}

	@When("choose a {string} is entered")
	public void choose_a_is_entered(String email) {
		obj.enterEmail(email);

	}

	@When("check availability is clicked")
	public void check_availability_is_clicked() {
		obj.checkBtn();

	}

	@When("{string} is entered")
	public void is_entered(String password) {
		obj.clickPassword(password);

	}

	@When("{string} is retyped")
	public void is_retyped(String retypepass) {
		obj.retypePassword(retypepass);
	}

	@When("{string} address is entered")
	public void address_is_entered(String altemail) {
		obj.altEmail(altemail);

	}

	@When("{string} mobile number is entered")
	public void mobile_number_is_entered(String number) {
		obj.Mobileno(number);

	}

	@When("date of birth is selected from dropdowns")
	public void date_of_birth_is_selected_from_dropdowns() {
		obj.selectDMY(3,4,5);

	}

	@When("gender is selected")
	public void gender_is_selected() {
		obj.selectGender();


	}

	@When("country is selected")
	public void country_is_selected() {
		obj.selectCont(5);
		
	}

	
	@When("enter the capcha")
	public void enter_the_capcha()
	{
		obj.enterCapcha("aswin");
	}

	@When("click the create my account button")
	public void click_the_create_my_account_button() {
		obj.clickSubmit();

	}

	@Then("the account should be created successfully")
	public void the_account_should_be_created_successfully() {
		System.out.println("the account should be successfully created");

	}

}
