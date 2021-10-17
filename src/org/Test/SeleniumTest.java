package org.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {
	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohini Jayaraman\\eclipse-workspace\\JavaDay1\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='q']"));
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).perform();
	
		txtbox.sendKeys("trisha");
		a.keyUp(Keys.SHIFT).perform();
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File temploc = t.getScreenshotAs(OutputType.FILE);
		 File perm = new File("C:\\Users\\Rohini Jayaraman\\OneDrive\\Desktop\\Rohini\\trishapag.jpg");
		 
		FileUtils.copyFile(temploc,perm);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
		
	
	

}
