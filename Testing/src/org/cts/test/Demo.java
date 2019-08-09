package org.cts.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raja sekar\\eclipse-workspace\\JunitDay1\\Testing\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
	@AfterClass
	public static void quitBrowser() {
		driver.quit();
		}
	
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
		}
	
	@Before
	public void startTime() {
		Date d1=new Date();
		System.out.println(d1);
	}
	
	@Test
	public void logica() {
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("pradeep94");
		}
	
	@Test
	public void logicb() {
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("1234567");
		}
	
	@Test
	public void logicc() {
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();
	}
}

