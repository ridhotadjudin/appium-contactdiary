package com.contactdiary.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainActivity {
	
	public AndroidDriver driver;
	
	public MainActivity(AndroidDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/fab" )
	public WebElement btnTambah;
	
	public ButtonMainActivity clickTambah() {
		btnTambah.click();
		System.out.println("Tombol ditekan");
		return new ButtonMainActivity(driver);
	}
	
	
}
