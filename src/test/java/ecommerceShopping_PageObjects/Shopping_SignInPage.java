package ecommerceShopping_PageObjects;

import org.openqa.selenium.By;

import ecommerceShopping_FunctionDefinition.CommonFunctions;

public class Shopping_SignInPage extends CommonFunctions {

	By emailAddress = By.cssSelector("input[id='email']");
	By password = By.id("passwd");
	By signInBtn = By.cssSelector("button[id='SubmitLogin']");
	

	public void enterEmailAddress() {
		driver.findElement(emailAddress).sendKeys(configMap.get("username"));
	}

	public void enterPassword() {
		driver.findElement(password).sendKeys(configMap.get("password"));
	}

	public void clickOnSignInBtn() {
		driver.findElement(signInBtn).click();
	}

	
}
