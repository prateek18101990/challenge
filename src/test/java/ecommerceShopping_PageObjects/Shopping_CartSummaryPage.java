package ecommerceShopping_PageObjects;

import org.openqa.selenium.By;

import ecommerceShopping_FunctionDefinition.CommonFunctions;

public class Shopping_CartSummaryPage extends CommonFunctions {
	
	By proceedToCheckoutSummaryPage = By.xpath(
			".//a[@title='Proceed to checkout'][@class='button btn btn-default standard-checkout button-medium']");
	By summaryPrdctQnty = By.cssSelector("span[id='summary_products_quantity']");
	

	public void clickOnProceedToCheckoutSmryPage() {
		driver.findElement(proceedToCheckoutSummaryPage).click();
		}
	
	public int productCountOnSummaryPage() {
		
		String noOfProducts = driver.findElement(summaryPrdctQnty).getText();
		String prdctCount = noOfProducts.substring(0,1);
		
		return Integer.parseInt(prdctCount);
		
	}

}
