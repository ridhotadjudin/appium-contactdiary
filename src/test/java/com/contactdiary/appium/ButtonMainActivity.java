package com.contactdiary.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ButtonMainActivity {
	
	public AndroidDriver driver;
	
	public ButtonMainActivity(AndroidDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath = "android.widget.ImageButton[contains(text(),'New event')]" )
	public WebElement btnNewEvent;

	@AndroidFindBy(id = "com.apozas.contactdiary:id/fabLayout1" )
	public WebElement btnNewContact;
	
	public void clickEvent() {
		btnNewEvent.click();
//		btnNewContact.click();
		System.out.println("Tombol Event ditekan");
	}
	
	
}
