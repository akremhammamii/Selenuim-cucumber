package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.page_objects.ProductPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinition {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils; 
	public ProductPage productPage;
	
	public ProductStepDefinition() {
		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		productPage = new ProductPage();
	}
	
	@When("Je clique sur catalog")
	public void jeCliqueSurCatalog() {
		seleniumUtils.click(ProductPage.getBtnCatalog());
	}
	@When("Je clique sur le menu product")
	public void jeCliqueSurLeMenuProduct() {
		seleniumUtils.click(ProductPage.getBtnproduct());
	}
	@When("Je saisie le product name {string}")
	public void jeSaisieLeProductName(String string) {
	    
	}
	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
	   
	}
	@Then("Je verifie le produit souhaiter {string}")
	public void jeVerifieLeProduitSouhaiter(String string) {
	  
	}



	
}
