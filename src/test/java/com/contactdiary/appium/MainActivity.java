package com.contactdiary.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainActivity {
	
	public AndroidDriver driver;
	
//	public ContactDiaryTest test;
	
	public MainActivity(AndroidDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/fab")
	public WebElement btnUtama;
	
	public void clickBtnUtama() {
		btnUtama.click();
		System.out.println("Tombol ditekan");
	}
	
//	public void clickBtnNewEvent() throws MalformedURLException {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		TouchAction touchNewEvent = new TouchAction(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
//		touchNewEvent.tap(PointOption.point(950,1250)).perform();
//	}
//	
//	public void clickBtnNewContact() {
//		TouchAction touchNewContact = new TouchAction(driver);
//		touchNewContact.tap(PointOption.point(950,1250)).perform();
//	}
	
	
	
	
}
