package com.queens.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testpages_eviltester_Exercise {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act =new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		Thread.sleep(3000);
		driver.findElement(By.id("firstname")).sendKeys("Fatema");
		Thread.sleep(3000);
		driver.findElement(By.id("surname")).sendKeys("ZohoraFardeenAzad");
		driver.findElement(By.id("age")).sendKeys("30");
		driver.findElement(By.id("country"));
		Select dcun = new Select (driver.findElement(By.id("country")));
		
		dcun.selectByVisibleText("Bangladesh");
		
		driver.findElement(By.id("notes")).sendKeys("My new Project");
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 
		

	}

}
