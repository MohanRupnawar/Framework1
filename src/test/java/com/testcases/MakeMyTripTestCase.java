package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.testcases.config.TestBaseCommond;
import com.testcases.keywords.MakeKeyword;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class MakeMyTripTestCase extends TestBaseCommond {

	@Test
	public void logintestfirst(){
		
		MakeKeyword.launchUrl("https://www.makemytrip.com/");
		
		MakeKeyword.clickonImage(By.xpath("//body[@class='desktop in webp']")).click();
		
		MakeKeyword.windowHandling();
	}
}
//		String MainWindow=driver.getWindowHandle();
//		for(String winHandle:driver.getWindowHandles()) {
//			driver.switchTo().window(winHandle);
//		}
//		driver.close();
//		driver.switchTo().window(MainWindow);
		
//		Thread.sleep(2000);

//		driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("9860943431");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
//		Thread.sleep(5000);
//		driver.close();
//	}
//	@Test
//	public void locationSelection() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.makemytrip.com/");
//
//		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
//		
//		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
//		from.sendKeys("Mumbai");
//		Thread.sleep(2000);
//		from.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		from.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='toCity']"));
//		Thread.sleep(2000);
//		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
//		to.click();
//		to.sendKeys("Pune");
//		Thread.sleep(2000);
//		to.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		to.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		driver.close();
//
//	}
//	@Test
//	public void departureCalenderHandling() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.makemytrip.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
//		String MainWindow=driver.getWindowHandle();
//		for(String winHandle:driver.getWindowHandles()) {
//			driver.switchTo().window(winHandle);
//		}
//		driver.close();
//		driver.switchTo().window(MainWindow);
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
//		Thread.sleep(3000);
//		String flag="False";
//		while(flag=="False") {
//			if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'] [contains(@aria-label,'Nov 29 2022')]")).size()>0) {
//				driver.findElement(By.xpath("//div[@class='DayPicker-Day'] [contains(@aria-label,'Nov 29 2022')]")).click();
//				flag="True";
//			}else {
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
//			
//			}
//		}
//		
//		//driver.findElement(By.xpath("//div[@class='DayPicker-Day'] [contains(@aria-label,'Jul 29 2022')]")).click();
//		System.out.println("Test case is passed");
//		driver.close();
//	}

//@Test
//public void returnCalenderHandling() throws InterruptedException {
//	WebDriverManager.chromedriver().setup();
//	RemoteWebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.makemytrip.com/");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
//	String MainWindow=driver.getWindowHandle();
//	for(String winHandle:driver.getWindowHandles()) {
//		driver.switchTo().window(winHandle);
//	}
//	driver.close();
//	driver.switchTo().window(MainWindow);
//	
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']")).click();
//	Thread.sleep(3000);
//	String flag="False";
//	while(flag=="False") {
//		if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'] [contains(@aria-label,'May 30 2022')]")).size()>0) {
//			driver.findElement(By.xpath("//div[@class='DayPicker-Day'] [contains(@aria-label,'May 30 2022')]")).click();
//			flag="True";
//		}else {
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
//		
//		}
//	}
//	
//	//driver.findElement(By.xpath("//div[@class='DayPicker-Day'] [contains(@aria-label,'Jul 29 2022')]")).click();
//	System.out.println("Test case is passed");
//	driver.close();
//}
//	@Test
//	public void numberOfTraveller() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.makemytrip.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
//		String MainWindow = driver.getWindowHandle();
//		for (String winHandle : driver.getWindowHandles()) {
//			driver.switchTo().window(winHandle);
//		}
//		driver.close();
//		driver.switchTo().window(MainWindow);
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//p[@data-cy='travellerText']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='button']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@title='IndiGo' and @class='filterName'])[1]")).click();
//		
//
//	}

//	public static RemoteWebDriver driver;
//
//	public static void intialiszation() {
//	
//		WebDriverManager.chromedriver().setup();
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
//		String MainWindow = driver.getWindowHandle();
//		for (String winHandle : driver.getWindowHandles()) {
//			driver.switchTo().window(winHandle);
//		}
//		driver.close();
//		driver.switchTo().window(MainWindow);
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//p[@data-cy='travellerTextss']")).click();

//	}
//
//	public void failed() {
//
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(scrFile,
//					new File("C:\\Users\\91976\\eclipse-workspace\\testcases" + "\\Screenshots\\UsingSelenium5.jpg"));
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		try {
//			FileUtils.copyFile(scrFile, new File("C:\\Users\\91976\\eclipse-workspace\\testcases\\Screenshots\\testFailure.jpg"));
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}

	


