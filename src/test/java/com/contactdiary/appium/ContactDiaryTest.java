package com.contactdiary.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ContactDiaryTest {
	
	protected AndroidDriver driver;
	public MainActivity conc;
	public EventActivity event;

//	@BeforeTest
//	public void init() throws MalformedURLException {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("appPackage", "com.apozas.contactdiary");
//        capabilities.setCapability("appActivity", "com.apozas.contactdiary.MainActivity");
//
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		conc = new MainActivity(driver);		
//	}
	
	@BeforeTest
	public void init() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appPackage", "com.apozas.contactdiary");
		capabilities.setCapability("appActivity", "com.apozas.contactdiary.NewEventActivity");
        
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		event = new EventActivity(driver);
	}
	
//	@Test(priority = 1)
//	public void test_functionTambah() {
//		conc.clickTambah();
//	}
	
//	@Test(priority = 1)
//	public void test_functionEvent() {
//		
//		conc.clickTambah().clickEvent();
//	}
	
	@Test(priority = 1)
	public void test_tambahEvent() {
		event.addEvent("Trip Pantai", "Pulau Pari", "Barudaks", "08212121", "logika tanpa logistik = anarki").clickTambah();
	}
	
	
}
