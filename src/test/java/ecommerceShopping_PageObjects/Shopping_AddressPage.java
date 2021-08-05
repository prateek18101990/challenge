package ecommerceShopping_PageObjects;

import org.openqa.selenium.By;

import ecommerceShopping_FunctionDefinition.CommonFunctions;

public class Shopping_AddressPage extends CommonFunctions {
	
	By proceedToCheckoutBtn = By.cssSelector("button[type='submit'][name='processAddress']");
	
	public void clickOnProceedCheckoutBtn() {
		driver.findElement(proceedToCheckoutBtn).click();
	}

}
