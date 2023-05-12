package com.qa.BrowserTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class WebDriverTest {
	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	WebElement sbar= driver.findElement(By.name("q"));
	sbar.sendKeys("weather news");
//	WebElement sbutton = driver.findElement(By.name("btnk"));
//	sbutton.click();
	sbar.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.quit();
		
	}

}
