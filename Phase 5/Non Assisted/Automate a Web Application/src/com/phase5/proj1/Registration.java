package com.phase5.proj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Registration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase5\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
	
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("crraziegirl@gmail.com");
		Thread.sleep(1000);
		
		
		WebElement pass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		pass.sendKeys("Sita@123");
		Thread.sleep(1000);
		
		
		
		WebElement repass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
		repass.sendKeys("Sita@123");
		Thread.sleep(1000);
		

		WebElement country=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
		country.sendKeys("India");
		Thread.sleep(1000);

		WebElement Fname=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
		Fname.sendKeys("Sita");
		Thread.sleep(1000);

		WebElement Lname=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
		Lname.sendKeys("Ram");
		Thread.sleep(1000);

		WebElement JobTitle=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
		JobTitle.sendKeys("Engineer");
		Thread.sleep(1000);

		WebElement phone=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
		phone.sendKeys("7418529637");
		Thread.sleep(1000);

		WebElement comName=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
		comName.sendKeys("xyz");
		Thread.sleep(1000);

		WebElement add=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
		add.sendKeys("Hyderabad");
		Thread.sleep(1000);

		WebElement city=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
		city.sendKeys("Hyderabad");
		Thread.sleep(1000);

		WebElement state=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
		state.sendKeys("Telangana");
		Thread.sleep(1000);

		WebElement postal=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
		postal.sendKeys("123456");
		Thread.sleep(1000);
		
		WebElement create= driver.findElement(By.id("sView1:r1:0:b1"));
		create.submit();
		Thread.sleep(1000);

	}
}
