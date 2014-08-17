package com.apalya.resume_update.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;



import org.testng.annotations.Test;

import com.apalya.resume_update.landingpage;
import com.apalya.resume_update.login;
import com.apalya.resume_update.sendingsms;


public class update_test {
	
  @Test
	public static void profileupdate() throws Throwable{
	 //ProfilesIni prop=new ProfilesIni();
	  //FirefoxProfile fp=prop.getProfile("test");
	  WebDriver driver=new FirefoxDriver();
	 // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "G:\\workspace\\Complete_Examples\\src\\chromedriver.exe");
		driver.get("https://login.naukri.com/nLogin/Login.php?");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.manage().window().maximize();
		login update=PageFactory.initElements(driver, login.class);
		landingpage lp=update.dologin("mademvv@gmail.com", "apalya01");
		sendingsms ms=lp.update();
		ms.sms("8179653520", "Naukari profile successfully updated");
		driver.quit();
		
		
		
	}

}
