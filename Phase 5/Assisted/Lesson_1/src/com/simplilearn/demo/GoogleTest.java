package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	
	public static void main(String[] args) {
		
	
	String path= "D:\\\\Phase5\\\\Chromedriver\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver driver = new ChromeDriver();
	
	
	
	String url="http://www.google.com";
	driver.get(url);
	driver.close();
	System.out.println("Driver Working Properly");
	
	
	
	
}

}
