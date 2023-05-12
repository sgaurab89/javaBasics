package com.qa.BrowserTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
	WebElement link = driver.findElement(By.partialLinkText("Dropdown"));
	link.click();

	WebElement optList = driver.findElement(By.id("dropdown"));
	Select sel = new Select(optList);
//	sel.selectByIndex(1);

	//	sel.deselectByIndex(1);//java.lang.UnsupportedOperationException: 
//	You may only deselect options of a multi-select

	sel.selectByValue("1");

	driver.quit();
}	
	
	
}
