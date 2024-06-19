package com.e2eTest.automation.step_definitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	private static final Logger logger = LogManager.getLogger(LoginPage.class);

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;

	public LoginStepDefinition() {

		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	@Given("Je visite le site nopecommerce")
	public void jeVisiteLeSiteNopcommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisie adresse mail")
	public void jeSaisieAdresseMail() {
		logger.debug("Setting email: {}");
		seleniumUtils.writeText(LoginPage.getEmail(), configFileReader.getProperties("home.login"));
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		seleniumUtils.writeText(LoginPage.getPassword(), password);

	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(LoginPage.getBtnLogin());
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
//		String titlePage = LoginPage.getTitlePage().getText();
//		Assert.assertEquals(titlePage, text);
	}
	
	/*TC -  Logout*/
	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		seleniumUtils.click(LoginPage.getBtnLogout());
	}
	@Then("Je me redirige vers la page de connexion")
	public void jeMeRedirigeVersLaPageDeConnexion() {
	}




}
