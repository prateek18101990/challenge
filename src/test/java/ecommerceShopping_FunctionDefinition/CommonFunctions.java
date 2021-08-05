package ecommerceShopping_FunctionDefinition;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class CommonFunctions {

	// Declare the WebDriver
	public static WebDriver driver;

	// Declaring Hashmap
	public static HashMap<String, String> configMap = new HashMap<String, String>();
	
	//Screenshots Path
	private static String screenShotDirectoryPath = System.getProperty("user.dir")+"\\target\\Screenshots";
	
	public void initialization() {
		Properties prop = new Properties();
		String userDir = System.getProperty("user.dir");
		userDir = userDir + "/src/test/resources/Properties//config.properties";

		File file = new File(userDir);
		InputStream stream = null;

		try {

			stream = new FileInputStream(file);

		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}

		try {

			prop.load(stream);

		} catch (IOException e) {

		}
		configMap.put("url", prop.getProperty("AUTOMATION_PRACTICE_URL"));
		configMap.put("username", prop.getProperty("WEBSITE_USERNAME"));
		configMap.put("password", prop.getProperty("WEBSITE_PASSWORD"));
		configMap.put("browser", prop.getProperty("BROWSER"));
	}

	public WebDriver launchBrowser() {

		initialization();
		String browser = configMap.get("browser").toString();

		switch (browser.toUpperCase()) {

		case "CHROME":
			String chromePath = System.getProperty("user.dir").toString()
					+ "/src/test/resources/Properties//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		case "FIREFOX":
//			Add Firefox driver property
			break;

		case "SAFARI":
//			Add Safari driver property
		}
		return driver;
	}

	public void openWebSite() throws InterruptedException {

		String url = configMap.get("url").toString();
		driver.navigate().to(url);
		waitForLoading();
	}

	public void waitForLoading() throws InterruptedException {
		Thread.sleep(5000);
	}

	public void waitForElementToBeVisible(By locator) {
		try {
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

		catch (Exception e) {
			System.err.println("WEB ELEMENT NOT FOUND ON SCREEN - " + locator.toString());
			System.out.println(e.getMessage());
		}
	}
	
	public static void screenshot(WebDriver driver, String ssName) throws IOException {
		File scrFile = null;
		String filename = screenShotDirectoryPath+"\\"+ssName+".gif";
		scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(filename));
	}
	
	public void closeTheBrowser() {
		driver.close();
	}

}
