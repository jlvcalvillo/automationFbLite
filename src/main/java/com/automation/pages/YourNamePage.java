package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class YourNamePage extends BasePage {

	public YourNamePage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final String str_title = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]";
	private final String str_firstName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]";
	private final String str_lastName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[2]";
	private final String str_next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	
	public boolean getTitle() {
		//getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_title)));
		AndroidElement labelTitle = getDriver().findElementByXPath(str_title);
		System.out.println("titulo: " + labelTitle.getText());
		return labelTitle.isDisplayed();
	}
	
	public void insertFistName() {
		AndroidElement inputFirstName = getDriver().findElementByXPath(str_firstName);
		inputFirstName.sendKeys("Luis");
	}
	
	public void insertLastName() {
		AndroidElement inputLastName = getDriver().findElementByXPath(str_lastName);
		inputLastName.sendKeys("Calvillo");
	}
	
	public void clicBtnNext() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_next)));
		System.out.println("clic al boton next");
		AndroidElement btn_next = getDriver().findElementByXPath(str_next);
		System.out.println("Boton: " + btn_next.getText());
		btn_next.click();
	}
}
