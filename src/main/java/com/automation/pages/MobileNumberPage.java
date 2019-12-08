package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.coreappium.MyDriverAppium;
import com.automation.pages.BasePage;

import io.appium.java_client.android.AndroidElement;

public class MobileNumberPage extends BasePage {

	public MobileNumberPage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final String str_title = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]";
	private final String str_number = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
	private final String str_next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup";
	
	public boolean getTitle() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_title)));
		AndroidElement labelTitle = getDriver().findElementByXPath(str_title);
		System.out.println("titulo: " + labelTitle.getText());
		return labelTitle.isDisplayed();
	}
	
	public void insertNumber() {
		AndroidElement inputNumber = getDriver().findElementByXPath(str_number);
		inputNumber.clear();
		inputNumber.sendKeys("9512245970");
	}
	
	public void clicBtnNext() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_next)));
		System.out.println("clic al boton next");
		AndroidElement btn_next = getDriver().findElementByXPath(str_next);
		System.out.println("Boton: " + btn_next.getText());
		btn_next.click();
	}

}
