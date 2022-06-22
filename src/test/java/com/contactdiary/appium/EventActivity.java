package com.contactdiary.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EventActivity {
	
	public AndroidDriver driver;
	
	public EventActivity(AndroidDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventname_input")
	public WebElement inputName;
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventplace_input")
	public WebElement inputPlace;
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventdate_input")
	public WebElement inStartDate;
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventinittime_input")
	public WebElement inStartTime;
	@AndroidFindBy(id = "com.apozas.contactdiary:id/endeventdate_input")
	public WebElement inEndDate;
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventendtime_input")
	public WebElement inEndTime;
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/event_outdoors")
	public WebElement boxOutdoor;
	@AndroidFindBy(id = "com.apozas.contactdiary:id/event_indoors")
	public WebElement boxIndoor;
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventpeople_input" )
	public WebElement inputPeople;
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventphone_input" )
	public WebElement inputPhone;
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventnotes_input" )
	public WebElement inputNote;
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/eventnotes_input" )
	public WebElement btnMitigation;
	
	@AndroidFindBy(id = "com.apozas.contactdiary:id/okButton_AddEvent" )
	public WebElement btnAddEvent;
	
	public void startEventDate() {
		inStartDate.click();
	}
	public void endEventDate() {
		inEndDate.click();
	}
	
	public void startEventTime() {
		inStartTime.click();
	}
	public void endEventTime() {
		inEndTime.click();
	}
	
	public void addEvent(String nama, String place,
			String people, String phone, String note) {
		inputName.sendKeys(nama);
		inputPlace.sendKeys(place);
		
		inputPeople.sendKeys(people);
		inputPhone.sendKeys(phone);
		inputNote.sendKeys(note);
	}
	
	public void boxOutdoor() {
		boxOutdoor.click();
	}
	public void boxIndoor() {
		boxIndoor.click();
	}
	
	public void save() {
		btnAddEvent.click();
	}
	
	
	
}
