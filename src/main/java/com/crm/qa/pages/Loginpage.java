package com.crm.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testbase.TestBase;

public class Loginpage extends TestBase {

	// PageFactory

	@FindBy(name = "email")
	WebElement UserName;
	@FindBy(name = "pass")
	WebElement Password;
	@FindBy(id = "u_0_b")
	WebElement LoginButton;
	@FindBy(xpath = "//span[text()='Create an account']")
	WebElement FieldText;

	//Initailaizing PageObject
	public Loginpage() throws FileNotFoundException {

		PageFactory.initElements(driver, this);
		

	}

	public String validateTitle() {
		String Title = driver.getTitle();
		return Title;
	}
	public boolean validateTextField() {
		return FieldText.isDisplayed();
	}
	
	public void login(String un, String pw) {
		UserName.sendKeys(un);
		Password.sendKeys(pw);
		LoginButton.click();
	}
	

}
