package ecommerceShopping_FunctionDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FeatureDefinition_Background extends CommonFunctions {
	
	@Given("^I have opened the browser$")
	public void i_have_opened_the_browser() throws Throwable {
		launchBrowser();
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		closeTheBrowser();
	}
}
