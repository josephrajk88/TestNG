
// Its Printed in Wrong order
package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = -1)
	public void c_method() {
		System.out.println("Method C");
	}

	@Test(priority = 0)
	public void b_method() {
		System.out.println("Method B");
	}

	@Test(priority = 1)
	public void a_method() {
		System.out.println("Method A");
	}

	@Test
	public void e_method() {
		System.out.println("Method E");
	}

	@Test
	public void d_method() {
		System.out.println("Method D");

	}

	// Assert.fail();
	// (dependsOnMethods = {""})
    //  (dependsOnMethods = {"",""})

}
