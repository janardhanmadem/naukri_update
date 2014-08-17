package com.apalya.resume_update;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class sendingsms {
	@FindBy(xpath="html/body/table/tbody/tr[2]/td[1]/div/ul/li[1]/span/a/span")
	public WebElement send_messege_link;
	@FindBy(xpath="//input[@name='msisdn']")
	public WebElement msisdn;
	@FindBy(xpath="//input[@name='text']")
	public WebElement msg;
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit;
	
	WebDriver driver;
	public sendingsms(WebDriver dr){
		driver=dr;
	}
	
	public void sms(String cellnumber,String message) throws Throwable{
		Logger app_logs=Logger.getLogger("devpinoyLogger");
		driver.get("http://121.241.248.6:8580/AirtelVideoAlertsCRM/login.do?userName=admin&password=@1rte!");
		app_logs.debug("sms sending started");
		send_messege_link.click();
		msisdn.sendKeys(cellnumber);
		msg.sendKeys(message);
	    submit.click();
	    app_logs.debug("sms sent successfully sent to :"+cellnumber);
	    Thread.sleep(1000L);
	    driver.close();
	    
	    //RemoteWebDriver.close();
		
	}

}
