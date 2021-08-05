package ecommerceShopping_PageObjects;

import org.openqa.selenium.By;

import ecommerceShopping_FunctionDefinition.CommonFunctions;

public class Shopping_ShippingPage extends CommonFunctions {

	By termOfServiceCheckbox = By.cssSelector("input[name='cgv']");
	By checkoutBtnShippingPage = By.cssSelector("button[type='submit'][name='processCarrier']");

	public void clickTermsAndServiceCheckbox() {
		driver.findElement(termOfServiceCheckbox).click();
	}

	public void clickProceedChkoutAddressPage() {
		driver.findElement(checkoutBtnShippingPage).click();
	}

}
