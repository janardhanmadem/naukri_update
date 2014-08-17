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


public class login {

    @FindBy(xpath="(//input[@id='emailTxt'])[2]")
	public WebElement username;
	@FindBy(xpath="//input[@id='pwd1']")
	public WebElement pswd;
	@FindBy(xpath="//input[@name='Login']")
	public WebElement submit;
	
		
		WebDriver driver;
		public login(WebDriver dr){
			driver=dr;
		}
			public  landingpage dologin(String user_name,String password){
				Logger app_logs = Logger.getLogger("devpinoyLogger");
				app_logs.debug("Browser Open successfully");
				app_logs.debug("Login credentials entering started");
			username.sendKeys(user_name);
			pswd.sendKeys(password);
			submit.click();
			landingpage lp=PageFactory.initElements(driver,landingpage.class);
			app_logs.debug("Login success");
				return lp;
		
			
		}
			
		
		

	}


