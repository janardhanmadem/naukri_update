package com.apalya.resume_update;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	
	@FindBy(xpath="//*[@id='mNav']/div/ul/li[4]/a")
	public WebElement header_link;
	@FindBy(xpath="//*[@id='mnaukNav']/ul[1]/li[1]/div/a[1]")
	public WebElement update_link;
	@FindBy(xpath="//*[@id='rPanel']/div/div/form/div[5]/div/button")
	public WebElement submit_button;
	//@FindBy(xpath="//*[@id='topBg']/div/div[1]/a[2]")
	@FindBy(linkText="Logout")
	public WebElement logout;
	
	WebDriver driver;
	public landingpage(WebDriver dr){
		driver=dr;
	}
	
	public sendingsms update() throws Throwable{
		Logger app_logs = Logger.getLogger("devpinoyLogger");
		Thread.sleep(2000L);
		header_link.click();
		app_logs.debug("clicking on profile update link");
		//header_link.click();
		//Thread.sleep(2000L);
		update_link.click();
		submit_button.click();
		app_logs.debug("profile updated successfully");
		logout.click();
		sendingsms sms=PageFactory.initElements(driver, sendingsms.class);
		return sms;
	}

}
