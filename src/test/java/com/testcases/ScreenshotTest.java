package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends MakeMyTripTestCase {
	@BeforeMethod
	public void setUp()  {
		//intialiszation();
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

	@Test
	public void takeScreenshotTest() {
		// TODO Auto-generated method stub
		Assert.assertEquals(false, true);
	}
	

}
