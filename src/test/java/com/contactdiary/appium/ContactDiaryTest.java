package com.contactdiary.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ContactDiaryTest {

	protected AndroidDriver driver;
	public MainActivity mainActivity;
	public EventActivity eventActivity;
	public CallTouch touch;
	public Calendar calendar;
	public Delay delay;
	public Mitigation mitigation;
	

	@BeforeTest
	public void init() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appPackage", "com.apozas.contactdiary");
		capabilities.setCapability("appActivity", "com.apozas.contactdiary.MainActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		mainActivity = new MainActivity(driver);
		touch = new CallTouch(driver);
		eventActivity = new EventActivity(driver);
		calendar = new Calendar(driver);
		delay = new Delay(driver);
		mitigation = new Mitigation(driver);
	}
	
	@Test(priority = 1)
	public void test_gotoEventActivity() {
		mainActivity.clickBtnUtama();
		touch.callTouch(950, 1250);
		delay.getDelay(1);
	}
	
	@Test(priority = 2)
	public void test_functionEvent() {
		eventActivity.addEvent("Trip Pantai", "Pulau Pari", 
				"Barudaks", "08212121", "logika tanpa logistik = anarki");
		delay.getDelay(1);
		
		eventActivity.startEventDate();		//click start date
		delay.getDelay(1);
		
		calendar.clickHeaderYear();			//click year
		touch.callSwipe(800,580,800,1400);	//swipe
		delay.getDelay(1);
		
		touch.callTouch(538, 845);			//tahun
		delay.getDelay(1);
		touch.callTouch(538, 1040);			//tanggal
		delay.getDelay(1);
		touch.callTouch(771, 1448);			//OK
		delay.getDelay(1);
		
		eventActivity.startEventTime();		//click start time
		delay.getDelay(1);
		
		touch.callTouch(653, 786);		//hour
		delay.getDelay(1);
		touch.callTouch(535, 738);		//minute
		delay.getDelay(1);
		touch.callTouch(795,1362);		//OK
		delay.getDelay(1);
		
		eventActivity.endEventDate();		//click start date
		delay.getDelay(1);
		
		calendar.clickHeaderYear();			//click year
		
		touch.callTouch(538, 580);			//tahun
		delay.getDelay(1);
		touch.callTouch(538, 1290);	//1140		//tanggal
		delay.getDelay(1);
		touch.callTouch(771, 1448);			//OK
		delay.getDelay(1);
		
		eventActivity.boxOutdoor.click();
		
		touch.callTouch(114, 1315);
		
		mitigation.clickBoxDistance();
		mitigation.clickBoxMaskMe();
		mitigation.clickBoxMaskOther();
		mitigation.clickBoxVentilate();
		mitigation.clickOK();
		
		eventActivity.save();
		
		delay.getDelay(5);
	}

}
