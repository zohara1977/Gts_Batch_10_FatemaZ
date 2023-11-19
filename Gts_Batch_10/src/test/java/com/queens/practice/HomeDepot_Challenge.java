package com.queens.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeDepot_Challenge {
	

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.Homedepot.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class='MyAccount__button']")).sendKeys("zohara1977@yahoo.com");
		driver.findElement(By.xpath("//a[@class='MyAccount__button']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Sign In or Create an Account")).click();
		
}
	}
