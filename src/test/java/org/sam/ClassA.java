package org.sam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.tes.AmazonPojo;
import org.tes.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA extends BaseClass {
	public WebDriver driver;

	@Parameters({ "browser", "product" })
	@Test
	private void tc1(String txt, String txt2) throws InterruptedException {
		{
			if (txt.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (txt.equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}

			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
			findElement.sendKeys("shoes");
			

		}
	}

//	@Test(dataProvider = "value")
//	private void tc2(String tx1) {
//		AmazonPojo li = new AmazonPojo();
//		fill(li.getProduct(), tx1);
//		clk(li.getSearch());
//	}
//
//	@DataProvider(name = "value")
//	private Object[] text() {
//		return new Object[][] { { "shoes" }, { "mobile" } };
//
//	}
}
