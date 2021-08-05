package ecommerceShopping_FunctionDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureDefinition_BrowsingPage extends CommonFunctions {
	
	KeywordFunctions_BrowsingPage browpage = new KeywordFunctions_BrowsingPage();	
	
	@Given("^Launch the test application$")
	public void launch_the_test_application() throws Throwable {
		openWebSite();
	}
	
	@When("^customer adds (\\d+) dress to the cart$")
	public void customer_adds_dress_to_the_cart(int noOfDress) throws Throwable {
	  browpage.addDressToCart(noOfDress);
	}
	
	@Given("^Navigate to the \"([^\"]*)\" menu$")
	public void navigate_to_the_menu(String arg1) throws Throwable {
	 browpage.iSelectFromTheMainMenu(arg1);
	}

	@Then("^select \"([^\"]*)\" dress$")
	public void select_dress(String arg1) throws Throwable {
		browpage.iSelectFromTheSubMenu(arg1);
	}
}