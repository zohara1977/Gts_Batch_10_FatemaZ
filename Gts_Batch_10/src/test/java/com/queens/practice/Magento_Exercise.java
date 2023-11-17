package com.queens.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Magento_Exercise {

	public static void main(String[] args) throws Throwable {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("zohara1977@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Kopasamsu2023");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

}
