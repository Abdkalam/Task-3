package org.tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBaseClass {

	public static WebDriver driver;

	public static WebDriver launch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}
	public static void geturl(String url) {

		driver.get(url);

	}
	public static void maxwin() {
		driver.manage().window().maximize();

	}
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	public static void clk(WebElement ele)
	{
		ele.click();
	}

}
