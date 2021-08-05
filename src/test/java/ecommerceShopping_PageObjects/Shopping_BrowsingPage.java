package ecommerceShopping_PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ecommerceShopping_FunctionDefinition.CommonFunctions;

public class Shopping_BrowsingPage extends CommonFunctions {
	
	By proceedToCheckout = By.xpath(".//a[@title='Proceed to checkout']");
	By continueShopping = By.xpath("//*[@title='Continue shopping']");
	By itemAddedToCartSingular = By.xpath("//*[@id='layer_cart']//h2//span[@class='ajax_cart_product_txt ']");
	By itemAddedToCartPlural = By.xpath("//*[@id='layer_cart']//h2//span[contains(@class,'ajax_cart_product_txt')]//span");
	By listOfDresses = By.cssSelector("ul[class$='product_list grid row'] div[class='product-container']");

	public void selectDressFromMainMenu(String arg1) {
		WebElement ele = driver.findElement(By.linkText(arg1.toUpperCase()));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		
	}

	public void selectDressFromSubMenu(String arg1) {
		driver.findElement(By.linkText(arg1.toUpperCase())).click();
		
	}

	public void clickOnProceedToCheckout() {
		driver.findElement(proceedToCheckout).click();
		
	}

	public void clickOnContinueShopping() {
		driver.findElement(continueShopping).click();
//		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")).click();
		
	}

	public String itemAddedToCartSingular() {
		return driver.findElement(itemAddedToCartSingular).getText();
	}

	public String itemAddedToCartPlural() {
		return driver.findElement(itemAddedToCartPlural).getText();
	}

	public List<WebElement> createListOfDresses() {
		return driver.findElements(listOfDresses);
		 
	}

}
