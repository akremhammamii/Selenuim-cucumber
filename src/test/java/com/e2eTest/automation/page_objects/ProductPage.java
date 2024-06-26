package com.e2eTest.automation.page_objects;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	import com.e2eTest.automation.utils.BasePage;
	import com.e2eTest.automation.utils.Setup;

	public class ProductPage extends BasePage {

		
		@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a")
		private static WebElement menuCatalog;
		
		@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a/p")
		private static WebElement menuproduct;
		
		public ProductPage() {
			super(Setup.getDriver());	
		}

		/* Create method getter */
		public static WebElement getBtnCatalog() {
			return menuCatalog;
		}
		public static WebElement getBtnproduct() {
			return menuproduct;
		}
	}
	

