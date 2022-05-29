package org.sam;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test(groups = { "regression", "regression" })
	private void tc11() {
		System.out.println("test11");

	}

	@Test(groups = { "smoke" })
	private void tc22() {

		Assert.assertTrue(false);
		System.out.println("test22");

	}

	@Test(groups = { "regression" })
	private void tc33() {
		System.out.println("test33");

	}

}
