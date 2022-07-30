package com.testcases.config;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.testcases.keywords.MakeKeyword;

public class TestBaseCommond {
	@Parameters("browser-name")
@BeforeMethod
public void setUp(@Optional String browserName) throws Exception {
		if(browserName==null) {
			browserName="chrome";
		}
		if(browserName.isEmpty()) {
			browserName="chrome";
			System.out.println("Setting default browser as chrome");
		}
	MakeKeyword.openBrowser(browserName);
}
	@AfterMethod
	public void tearDown() throws Exception {
		MakeKeyword.closeBrowser();
	}
}
