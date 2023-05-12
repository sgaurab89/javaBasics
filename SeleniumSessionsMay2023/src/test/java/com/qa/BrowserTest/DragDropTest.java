package com.qa.BrowserTest;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDropTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.partialLinkText("Droppable")).click();
     
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   
		List<WebElement> frmList = driver.findElements(By.tagName("iframe"));
		
		int size = frmList.size();
		System.out.println("No. of frames on the page: "+size);
		driver.switchTo().frame(1);
		
		Actions ac = new Actions(driver);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(src, dest);
		
		
	}
}
