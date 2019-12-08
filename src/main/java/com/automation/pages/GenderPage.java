package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class GenderPage extends BasePage {

	public GenderPage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final String str_title = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]";
	public final String str_male = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[2]";
	
	public boolean getTitle() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_title)));
		AndroidElement labelTitle = getDriver().findElementByXPath(str_title);
		System.out.println("titulo: " + labelTitle.getText());
		return labelTitle.isDisplayed();
	}
	
	public void clickBtnSex() {
		AndroidElement checkSex = getDriver().findElementByXPath(str_male);
		checkSex.click();
	}

}
