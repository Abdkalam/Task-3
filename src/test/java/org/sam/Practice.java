package org.sam;

import org.tes.AmazonBaseClass;
import org.tes.AmazonPojo;
import org.tes.Pojo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Practice extends AmazonBaseClass {
	public 	AmazonPojo li;
	
	@Ignore
	@Test 
	private void amazon() {
		
		launch();
		geturl("https://www.amazon.in");
		maxwin();
		 li=new AmazonPojo();
		fill(li.getProduct(), "Shoes");
		clk(li.getSearch());
	}
	
	@Test
	private void hotel() {
		
		
		launch();
		geturl("http://www.adactin.com/HotelApp/");
		maxwin();
		Pojo a = new Pojo();
		fill(a.getEmail(), "1212");
			}
	@DataProvider(name="another")
	public Object[][] tc22(){
		return new Object[][] {
				{"java","java@123"},{"java1","java@1234"}
		};
		
	}
}

