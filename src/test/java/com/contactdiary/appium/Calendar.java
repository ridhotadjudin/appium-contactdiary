package com.contactdiary.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Calendar {
	
	protected AndroidDriver driver;
	
	public Calendar(AndroidDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(id = "android:id/date_picker_header_year" )
	public WebElement headerYear;
	
	public void clickHeaderYear() {
		headerYear.click();
	}
}
