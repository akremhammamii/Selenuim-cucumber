package com.e2eTest.automation.step_definitions;



import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
    public SeleniumUtils seleniumUtils;
	
	public LoginStepDefinition() {

		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	@Given("Je visite le site nopcommerce")
	public void jeVisiteLeSiteNopcommerce() {
		//Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//Setup.getDriver().get(configFileReader.getProperties("home.login"));
		seleniumUtils.get(configFileReader.getProperties("home.login"));
	}

	@When("Je saisie adresse mail {string}")
	public void jeSaisieAdresseMail(String email) {
		LoginPage.getEmail().clear();
		LoginPage.getEmail().sendKeys(configFileReader.getProperties("home.login"));
	}
	
	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		LoginPage.getPassword().clear();
		LoginPage.getPassword().sendKeys(password);

	} 
	
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();  
	}
	
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String titlePage = LoginPage.getTitlePage().getText();
		Assert.assertEquals(titlePage, text);
	}



}
