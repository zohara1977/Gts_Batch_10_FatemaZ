package com.queens.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Excercise {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Signup / Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("zohara1977@yahoo.com");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kopasamsu2023");
       Thread.sleep(4000);
      driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

}
