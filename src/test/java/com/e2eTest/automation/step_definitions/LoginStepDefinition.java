package com.e2eTest.automation.step_definitions;

import org.testng.Assert;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;

	public LoginStepDefinition() {

		loginPage = new LoginPage();
	}

	@Given("Je visite le site nopecommerce")
	public void jeVisiteLeSiteNopecommerce() {
		Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("Je saisie adresse mail {string}")
	public void jeSaisieAdresseMail(String email) {
		LoginPage.getEmail().sendKeys(email);
	}
	
	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
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
