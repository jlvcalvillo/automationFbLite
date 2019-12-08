package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class PasswordPage extends BasePage {

	public PasswordPage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final String str_title = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]";
	private final String str_pass = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
	private final String str_registrar = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup";
	
	public boolean getTitle() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_title)));
		AndroidElement labelTitle = getDriver().findElementByXPath(str_title);
		System.out.println("titulo: " + labelTitle.getText());
		return labelTitle.isDisplayed();
	}
	
	public void insertPass() {
		AndroidElement inputPass = getDriver().findElementByXPath(str_pass);
		inputPass.sendKeys("P4sW0rD1687F4k3");
	}
	
	public void clickRegistrar() {
		AndroidElement btnRegistra = getDriver().findElementByXPath(str_registrar);
		btnRegistra.click();
	}

}
