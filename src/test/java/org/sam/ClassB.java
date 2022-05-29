package org.sam;

import org.testng.annotations.Test;

public class ClassB {

	@Test
	private void tc4() {
		
		Thread currentThread = Thread.currentThread();
		long id = currentThread.getId();
		System.out.println("Test Case 4 "+id);
	}
	@Test
	private void tc5() {
		
		Thread currentThread = Thread.currentThread();
		long id = currentThread.getId();
		System.out.println("Test Case 5 "+id);
	}
	@Test
	private void tc6() {
		
		Thread currentThread = Thread.currentThread();
		long id = currentThread.getId();
		System.out.println("Test Case 6 "+id);
	}

}
