package org.sam;

import org.openqa.selenium.JavascriptExecutor;
import org.tes.BaseClass;
import org.testng.annotations.Test;

public class locator extends BaseClass {
	
	@Test
	private void tc1() {
		launch();
		link("https://www.facebook.com/");
		maxWindow();
		JavascriptExecutor jd=new JavascriptExecutor() {
			
			public Object executeScript(String script, Object... args) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object executeAsyncScript(String script, Object... args) {
				// TODO Auto-generated method stub
				return null;
			}
		};

	}

}
