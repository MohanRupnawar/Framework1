package com.testcases.keywords;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeKeyword {
	public static RemoteWebDriver driver;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("browser is launched successfully");
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);
		System.out.println("Url is launched" + url);
	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed successfully");
	}

	public static void switchToWindow(String byTitle) {
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		String title = driver.getTitle();
		for (String window : windows) {
			if (driver.switchTo().window(window).getTitle().equals(byTitle)) {
				System.out.println("Switched on window: " + byTitle);
				break;
			}
	
		}
	}

	public static WebElement clickonImage(By xpath) {
		driver.findElement(xpath);
		return null;
	}
	public static List<String> clickButton(By element) {
		List<WebElement> elements=driver.findElements(element);
		List<String> texts=new ArrayList<String>();
		for(WebElement elemnt:elements) {
			texts.add(elemnt.getText());
		}
		return texts;
	}

	public static void windowHandling() {
		String MainWindow=driver.getWindowHandle();
		for(String winHandle:driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.close();
		driver.switchTo().window(MainWindow);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public void clickingOnWebElement(WebElement element,long waitTimeInSeconds) {
		WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebElement elements=null;
		elements=webwait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
}
