package ecommerceShopping_FunctionDefinition;

import java.io.IOException;

import org.junit.Assert;
import ecommerceShopping_PageObjects.Shopping_AddressPage;
import ecommerceShopping_PageObjects.Shopping_PaymentPage;
import ecommerceShopping_PageObjects.Shopping_ShippingPage;
import ecommerceShopping_PageObjects.Shopping_SignInPage;

public class KeywordFunctions_SignInToCheckoutPage extends CommonFunctions {

	Shopping_SignInPage signIn = new Shopping_SignInPage();
	Shopping_ShippingPage ship = new Shopping_ShippingPage();
	Shopping_PaymentPage pay = new Shopping_PaymentPage();
	Shopping_AddressPage add = new Shopping_AddressPage();
	
	public void signIn() throws IOException, InterruptedException {
		waitForLoading();
		signIn.enterEmailAddress();
		signIn.enterPassword();
		screenshot(driver,"SignInPage");
		signIn.clickOnSignInBtn();
	}

	/**
	 * Function to click on proceed button on Address Page
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnProceedBtnAddressPage() throws InterruptedException {
		waitForLoading();
		add.clickOnProceedCheckoutBtn();
	}
	
	/**
	 * Function to click on Terms Of Services
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public void clickOnTermsAndService() throws InterruptedException, IOException {
		waitForLoading();
		ship.clickTermsAndServiceCheckbox();
		screenshot(driver,"TermsOfServicePage");
	}
	
	/**
	 * Function to click on Proceed to checkout button on Shipping page
	 * @throws InterruptedException
	 */
	public void clickOnCheckoutBtnShippingPage() throws InterruptedException {
		waitForLoading();
		ship.clickProceedChkoutAddressPage();
	}
	
	/**
	 * Function to select mode of payment
	 * @param arg1
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public void bankPayment(String payMode) throws InterruptedException, IOException {
		
		screenshot(driver,"PaymentPage");
		pay.setPaymentMethod(payMode);

		switch (payMode.toUpperCase()) {

		case "PAY BY BANK WIRE":
			pay.payByBankWire();
			break;

		case "PAY BY CHECK":
			pay.payByBankCheck();
			break;
		}
		waitForLoading();
	}
	
	/**
	 * Function to select the confirm order button
	 * @throws InterruptedException
	 */
	public void confirmOrder() throws InterruptedException {
		waitForLoading();
		pay.clickOnConfirmOrder();
	}
	
	/**
	 * Function to verify the message for order confirmation
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void verifyOrderCnfmtn() throws IOException, InterruptedException {
		waitForLoading();
		
		if(pay.getPaymentMethod().equalsIgnoreCase("PAY BY BANK WIRE")) {
			Assert.assertTrue(pay.verifyOrderCnfrmMsgForBankWire().equalsIgnoreCase("Your order on My Store is complete."));
			screenshot(driver,"OrderConfirmationPage");
		}
		else if(pay.getPaymentMethod().equalsIgnoreCase("PAY BY CHECK")) {
			Assert.assertTrue(pay.verifyOrderCnfrmMsgForBankCheck().equalsIgnoreCase("Your order on My Store is complete."));
			screenshot(driver,"OrderConfirmationPage");
		}
	}

}
