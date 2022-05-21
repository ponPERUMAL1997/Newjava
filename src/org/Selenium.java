package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ponpe\\eclipse-workspace\\Eclipse\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElementByLinkedText(_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy)
		WebElement txtuser = driver.findElement(By.xpath("//input[@id='email']"));
		txtuser.sendKeys("perumal");
		driver.manage().window().maximize();
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpass.sendKeys("728492@pon");
		
		WebElement clc = driver.findElement(By.name("login"));
		clc.click();
		
	
		
		
	}

}
