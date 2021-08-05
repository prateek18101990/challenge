package ecommerceShopping_FunctionDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ecommerceShopping_PageObjects.Shopping_BrowsingPage;
import ecommerceShopping_PageObjects.Shopping_CartSummaryPage;

public class KeywordFunctions_BrowsingPage extends CommonFunctions {

	Shopping_BrowsingPage brPage = new Shopping_BrowsingPage();
	Shopping_CartSummaryPage summ = new Shopping_CartSummaryPage();

	private int dressQnty;
	private int productQnty;

	/**
	 * Function to select the link from main menu
	 * 
	 * @param arg1
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void iSelectFromTheMainMenu(String arg1) throws InterruptedException, IOException {
		waitForLoading();
		brPage.selectDressFromMainMenu(arg1);
		screenshot(driver, "MainMenu");
	}

	/**
	 * Function to select the link from sub menu
	 * 
	 * @param arg1
	 * @throws IOException
	 */
	public void iSelectFromTheSubMenu(String item) throws InterruptedException, IOException {
		waitForLoading();
		brPage.selectDressFromSubMenu(item);
		screenshot(driver, "SubMenu");
	}

	/**
	 * Function to add items to cart
	 * 
	 * @param count
	 * @throws InterruptedException
	 */
	public void addDressToCart(int count) throws InterruptedException {

		this.dressQnty = count;
		List<WebElement> AllDresses = brPage.createListOfDresses();

		for (int i = 0; i <= AllDresses.size(); i++) {
			By addToCart = By.xpath(".//ul[@class='product_list grid row']/li[" + (i + 1)
					+ "]/div[@class='product-container']/div[2]/div[2]/a[1]/span");

			Actions action = new Actions(driver);
			WebElement printedDress = AllDresses.get(i);
			waitForLoading();
			action.moveToElement(printedDress).moveToElement(driver.findElement(addToCart)).click().build().perform();
			waitForLoading();

			if (i == 0) {
				String items = brPage.itemAddedToCartSingular();
				waitForLoading();
				String itemName = items.split(" ")[2];
				productQnty = Integer.parseInt(itemName);
			} else {
				String items = brPage.itemAddedToCartPlural();
				productQnty = Integer.parseInt(items);
			}

			if (productQnty < count) {
				try {
					waitForLoading();
					brPage.clickOnContinueShopping();

				} catch (Exception e) {
					waitForLoading();
					brPage.clickOnContinueShopping();
				}

			} else {
				brPage.clickOnProceedToCheckout();
				waitForLoading();
				verifyPrdctQntySumaryPage();
				summ.clickOnProceedToCheckoutSmryPage();
				break;
			}
		}
	}

	/**
	 * Function to verify the Quantity of products added
	 */
	public void verifyPrdctQntySumaryPage() {
		int count = summ.productCountOnSummaryPage();
		Assert.assertTrue(count == dressQnty);
	}

}
