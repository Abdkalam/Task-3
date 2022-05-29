package org.sam;

import java.util.Date;

import org.tes.AmazonBaseClass;
import org.tes.AmazonPojo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazonsite extends AmazonBaseClass {
	@BeforeMethod
	private void start() {
		Date a = new Date();
		System.out.println(a);
		launch();
		geturl("https://www.amazon.in");
		maxwin();
	}

//	@Test(dataProvider = "datas")
	@Parameters("Osername")
	@Test
	private void tc1(@Optional ("furniture") String val) {

		AmazonPojo li = new AmazonPojo();
		fill(li.getProduct(), val);
		clk(li.getSearch());

	}

//	@DataProvider(name = "datas")
//	private Object[][] tc22() {
//		return new Object[][] { { "furniture" }, { "mobiles" }, { "shoes" } };
//	}

	@AfterMethod
	private void end() {

		driver.quit();
		Date a = new Date();
		System.out.println(a);

	}
}
