package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LoginPage extends BasePage {

	/* Retrieve web element */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = " //body/div/div/div[1]/h1[1]") // change me
	private static WebElement text;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement btnLogout;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/div/div/div[1]/h1")
	private static WebElement titlePage;

	public LoginPage() {
		super(Setup.getDriver());	
	}

	/* Create method getter */
	public static WebElement getBtnLogout() {
		return btnLogout;
	}
	
	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

	public static WebElement getTitlePage() {
		return text;
	}

}