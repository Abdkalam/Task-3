package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.tes.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 extends BaseClass {

	public WebDriver driver;
	@BeforeMethod
	private void date2() {
		dateandtime();

	}
	@Parameters({ "browser" })
	@Test(groups = "smoke")
	private void tc20(String bro) {

		if (bro.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

		}else if (bro.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		} 
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
			
			
		}

	}

	@AfterMethod
	private void date() {
		dateandtime();

	}

}
