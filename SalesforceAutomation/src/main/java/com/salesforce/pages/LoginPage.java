package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	
	public LoginPage enterUsername() {
		WebElement username = locateElement("username");
		clearAndType(username, "gokul.sekar@testleaf.com");
		reportStep("gokul.sekar@testleaf.com username entered successfully", "pass");
		return this;
	}
	
	
	public LoginPage enterPassword() {
		WebElement password = locateElement(Locators.ID, "password");
		clearAndType(password, "Leaf$321");
		reportStep("Leaf$321 password entered successfully", "pass");
		return this;
	}
	
	public LoginPage clickLogin() {
		
//		click(locateElement("Login"));
		click(Locators.ID, "Login");
		return this;
	}
	
}
