package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Loginpage;
import com.crm.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	Loginpage login;

	public LoginPageTest() throws FileNotFoundException {
		super();

	}

	@BeforeMethod

	public void setUp() throws FileNotFoundException {
		initialization();

		login = new Loginpage();
	}

	@Test
	public void LoginPageTitleTest() {
		String Title = login.validateTitle();
		Assert.assertEquals(Title, "Facebook – log in or sign up");
	}

	@Test
	public void LoginTest() {
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
