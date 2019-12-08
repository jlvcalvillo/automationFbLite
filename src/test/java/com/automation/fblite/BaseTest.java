package com.automation.fblite;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.automation.coreappium.MyDriverAppium;

public class BaseTest {
	Logger log = Logger.getLogger(BaseTest.class);
	MyDriverAppium myDriver = new MyDriverAppium();
	
	@BeforeSuite
	public void chargeDriver() {
		try {
			log.debug("se carga el driver");
			myDriver.setUpAppiumDriver();
			System.out.println(">>>>se inicia el driver" + myDriver.toString());
		} catch(Exception e) {
			log.error("error BaseTest.chargeDriver()", e);
		}
	}
	
	@AfterSuite
	public void finishDriver() {
		if (myDriver != null) {
			//myDriver.getDriver().quit();
		}
	}

	
}
