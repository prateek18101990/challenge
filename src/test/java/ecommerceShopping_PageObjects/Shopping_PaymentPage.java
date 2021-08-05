package ecommerceShopping_PageObjects;

import org.openqa.selenium.By;

import ecommerceShopping_FunctionDefinition.CommonFunctions;

public class Shopping_PaymentPage extends CommonFunctions {
	
	By payBankWire = By.cssSelector("a[class='bankwire']");
	By payBankCheck = By.cssSelector("a[class='cheque']");
	By confirmOrderBtn = By.cssSelector("button[class='button btn btn-default button-medium']");
	By orderCnfrmtnBankWireMsg = By.xpath(".//p[@class='cheque-indent']/strong[@class='dark']");
	By orderCnfrmtnBankCheckMsg = By.xpath(".//p[@class='alert alert-success']");
	private String payMode;
	
	
	public void payByBankWire() {
		driver.findElement(payBankWire).click();
	}

	public void payByBankCheck() {
		driver.findElement(payBankCheck).click();
	}

	public void clickOnConfirmOrder() {
		driver.findElement(confirmOrderBtn).click();
	}
	
	public String verifyOrderCnfrmMsgForBankWire() {
		return driver.findElement(orderCnfrmtnBankWireMsg).getText();
	}
	
	public String verifyOrderCnfrmMsgForBankCheck() {
		return driver.findElement(orderCnfrmtnBankCheckMsg).getText();
	}

	public void setPaymentMethod(String payMode) {
		this.payMode=payMode;
	}
	
	public String getPaymentMethod() {
		return payMode;
	}

}
