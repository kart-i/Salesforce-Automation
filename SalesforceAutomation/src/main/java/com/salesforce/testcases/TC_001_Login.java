package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethods {

	
	@Test
	public void runLogin() {
		
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin();
		
	}
	
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="Gokul";
		category ="Smoke";
//		excelFileName="Login";
	}
	
	
}
