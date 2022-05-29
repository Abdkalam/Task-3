package org.sam;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {
	@Parameters("vk")
	@Test
	private void tc7(String vk) {

		Thread currentThread = Thread.currentThread();
		long id = currentThread.getId();
		System.out.println("Test Case 7 " + id +vk);
	}

	@Test(dataProvider="for")
	private void tc8(String cun,String Co) {

		Thread currentThread = Thread.currentThread();
		long id = currentThread.getId();
		System.out.println("Test Case 8 " + id + cun + Co);
	}

	@Test
	private void tc9() {

		Thread currentThread = Thread.currentThread();
		long id = currentThread.getId();
		System.out.println("Test Case 9 " + id);
	}
	@DataProvider(name="for")
	@Test
	private Object[][] xx() {
		return new Object[][] {
			{"IND","RUS"}
		};
	}

}
