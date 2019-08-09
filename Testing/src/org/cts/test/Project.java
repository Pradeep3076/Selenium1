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
import org.openqa.selenium.interactions.Actions;

public class Project {
	static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raja sekar\\eclipse-workspace\\JunitDay1\\Testing\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		}
	
	@AfterClass
	public static void quitBrowser() {
		driver.quit();
		}
	
	@After
	public void endTime() {
		Date c=new Date();
		System.out.println(c);
		}
	
	@Before
	public void startTime() {
		Date r=new Date();
		System.out.println(r);
	}
	
	@Test
	public void shop() throws InterruptedException {
		WebElement sh=driver.findElement(By.xpath("//span[text()='Shop by']"));
		
		Actions ac=new Actions(driver);
		//To do mouse over
		ac.moveToElement(sh).perform();
		Thread.sleep(3000);
		}
	
	@Test
	public void buy() throws InterruptedException {
		WebElement mob=driver.findElement(By.xpath("//span[text()='Home, Kitchen, Pets']"));
		
		Actions ac1=new Actions(driver);
		ac1.moveToElement(mob);
		Thread.sleep(2000);
		}
	
	@Test
	public void demo() {
		WebElement b1=driver.findElement(By.xpath("//span[text()='Kitchen & Dining']"));
		b1.click();
	}
	
}
