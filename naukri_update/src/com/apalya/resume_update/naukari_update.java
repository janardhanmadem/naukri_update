package com.apalya.resume_update;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class naukari_update {
	@FindBy(xpath="//input[@id='emailTxt']")
	public WebElement user;
	@FindBy(xpath="//input[@id='pwd1']")
	public WebElement pwds;
	@FindBy(xpath="//*[@id='sbtLog']")
	public WebElement submit;
	
		
		WebDriver driver;
		public naukari_update(WebDriver dr){
			driver=dr;
		}
			public landingpage login(String user_name,String password){
				
				Logger app_logs = Logger.getLogger("devpinoyLogger");
				user.sendKeys(user_name);
				pwds.sendKeys(password);
				submit.click();
				landingpage lp=PageFactory.initElements(driver,landingpage.class);
				app_logs.debug("Login Success");
				return lp;
		
			
		}
		


	}


