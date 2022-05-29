package org.sam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tes.BaseClass;
import org.tes.Pojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 extends BaseClass {



	@BeforeClass
	private void start() {
		launch();

	}

	@BeforeMethod
	private void date() {
		dateandtime();

	}

	@Test(dataProvider="sample")
	private void tc1(String id,String pass) throws IOException {
		link("http://www.adactin.com/HotelApp/");
		maxWindow();
		Pojo p=new Pojo();
		fill(p.getEmail(),id);
		fill(p.getPass(), pass);
		clk(p.getLogin());
	}

	@DataProvider(name = "sample")
	public Object[][] tc22() {
		return new Object[][] { 
			{ "java","java@123" }, 
			{ "java1","apple@123"}
			};

	}

	@AfterClass
	private void end() {
		dateandtime();
		//driver.quit();

	}

}
