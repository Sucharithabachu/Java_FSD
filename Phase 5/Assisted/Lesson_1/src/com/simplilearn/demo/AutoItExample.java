package com.simplilearn.demo;


	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AutoItExample {
		public static void main(String[] args) throws IOException,InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Phase5\\Chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.shine.com/registration/");
			driver.manage().window().maximize();
			
			WebElement name= driver.findElement(By.id("id_name"));
			name.sendKeys("Suchi");
			
			
			WebElement file= driver.findElement(By.id("id_file"));
			
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click()", file);
			
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\\\Phase5\\\\Screenshot\\\\upload.exe");
		}

	}

