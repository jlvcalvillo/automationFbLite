package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class SecondPage extends BasePage{

	public SecondPage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public final String str_next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup";
	
	public boolean clicBtnNext() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_next)));
		System.out.println("clic al boton next");
		AndroidElement btn_next = getDriver().findElementByXPath(str_next);
		System.out.println("Boton: " + btn_next.getText());
		btn_next.click();
		return btn_next.isDisplayed();
	}

}
