package com.qa.BrowserTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.*;
public class WebPageTest {
	
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/");

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Challenging")));

	String title = driver.getTitle();
	System.out.println("Title of the page is: "+title);
	
   File scrShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(scrShot, new File("C:\\Users\\Public\\eclipse-workspace\\Screens\\img1.jpg"));
     driver.quit(); 

}
}