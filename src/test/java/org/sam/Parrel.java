
package org.sam;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parrel {
	@Parameters ({"name"})
	@Test(groups="sanity")
	private void tc2(String c) {

		
		System.out.println("2Nd "+Thread.currentThread().getId() +c);
	}
	@Test
	private void tc1() {
		System.out.println("1Nd "+Thread.currentThread().getId());

	}

	@Test
	private void tc3() {
		System.out.println("3rd "+Thread.currentThread().getId());	
	}
	@Test
	private void tc4() {
		System.out.println("4th "+Thread.currentThread().getId());

	}
	@Test
	private void tc5() {
		System.out.println("5th "+Thread.currentThread().getId());

	}
	@Test
	private void tc6() {
		System.out.println("9th "+Thread.currentThread().getId());

	}
	@Test
	private void tc7() {
		System.out.println("7th "+Thread.currentThread().getId());	
	}
}
