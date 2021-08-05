package ecommerceShopping_FunctionDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureDefinition_SignInToCheckoutPage extends CommonFunctions {

	KeywordFunctions_SignInToCheckoutPage sign = new KeywordFunctions_SignInToCheckoutPage();
	

	@When("^customer sign in with email and password to the website$")
	public void customer_sign_in_with_email_and_password_to_the_website() throws Throwable {
		sign.signIn();
	}

	@Then("^click on Proceed to checkout button$")
	public void click_on_Proceed_to_checkout_button() throws Throwable {
		sign.clickOnProceedBtnAddressPage();
	}

	@Then("^Complete the terms and conditions on Shipping page$")
	public void complete_the_terms_and_conditions_on_Shipping_page() throws Throwable {
		sign.clickOnTermsAndService();
		sign.clickOnCheckoutBtnShippingPage();
	}

	@Then("^Select \"([^\"]*)\" for payment$")
	public void select_for_payment(String payMode) throws Throwable {
		sign.bankPayment(payMode);
	}

	@Then("^Complete the purchase order$")
	public void complete_the_purchase_order() throws Throwable {
		sign.confirmOrder();
	}

	@Then("^Verify the order confirmation$")
	public void verify_the_order_confirmation() throws Throwable {
		sign.verifyOrderCnfmtn();
	}

}
