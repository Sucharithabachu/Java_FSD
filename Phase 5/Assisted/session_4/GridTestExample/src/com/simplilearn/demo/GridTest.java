package com.simplilearn.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	public static void main(String[] args) {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("facebook");
		cap.setPlatform(Platform.WINDOWS);
		URL url;
		
		try {
			url= new URL("http://192.168.43.133:4445/wd/hub");
			WebDriver driver= new RemoteWebDriver(url,cap);
			driver.get("https://www.facebook.com/");
			System.out.println("Title: "+driver.getTitle());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}