package com.phase5.proj1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase5\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.oracle.com/mysso/signon.jsp");
		
		WebElement email=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("crraziegirl@gmail.com");
		
		
		
		WebElement pass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		pass.sendKeys("Sita@123");
		
		
		
		//button
		WebElement login= driver.findElement(By.cssSelector("#cndidate_login_widget"));
		login.click();
}
}

