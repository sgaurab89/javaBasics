package com.qa.BrowserTest;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement sbar= driver.findElement(By.name("q"));
		sbar.sendKeys("Weather in Maharashtra");
		sbar.sendKeys(Keys.ENTER);
		
		File scrShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
	org.openqa.selenium.io.FileHandler.copy(scrShot,new File("C:\\Users\\Public\\eclipse-workspace\\Screens\\results.jpg"));	
	driver.quit();
	
	
	}
	
	
}
