package com.automation.coreappium;

import java.io.File;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyDriverAppium {
	
	Logger log = Logger.getLogger(MyDriverAppium.class);
	
	
	protected AndroidDriver<AndroidElement> driver;
	protected WebDriverWait wait;
	
	public void setUpAppiumDriver() {
		System.out.println("si entra");
		final File classpathRoot = new File(System.getProperty("user.dir"));
		DesiredCapabilities caps = new DesiredCapabilities();
		final File appDir = new File(classpathRoot, "src/test/resources");
		final File app = new File(appDir,"facebook_lite.apk");
		
		caps.setCapability("deviceName", "emulator-5554");
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("platformVersion", "9");
	    caps.setCapability("appPackage", "com.facebook.lite");
	    caps.setCapability("appActivity", "com.facebook.lite.MainActivity");
	    caps.setCapability("autoGrantPermissions", true);
	    caps.setCapability("noReset", true);
	    caps.setCapability("clearSystemFiles", true);
	    caps.setCapability("app", app.getAbsolutePath());
	    
	    System.out.println("caps " + caps);
	    
	    try {
	    	driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	    	System.out.println(">>>>driver: "+driver);
	    	System.out.println(">>>>status: " + driver.getStatus());
	        wait = new WebDriverWait(driver, 10);
	    }catch(Exception e) {
	    	System.out.println("error MyDriverAppium.set_UpAppiumDriver() "+ e);
	    	log.error("error MyDriverAppium.set_UpAppiumDriver() ", e);
	    }
		
	}
	
	public AndroidDriver<AndroidElement> getDriver(){
		System.out.println();
		return this.driver;
	}
	
}
