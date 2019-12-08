package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class BirthdayPage extends BasePage {

	public BirthdayPage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final String str_title = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]";
	private final String str_next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	private final String str_yes = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup";
	
	public boolean getTitle() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_title)));
		AndroidElement labelTitle = getDriver().findElementByXPath(str_title);
		System.out.println("titulo: " + labelTitle.getText());
		return labelTitle.isDisplayed();
	}
	
	
	public void insertDay() {
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup"));
		AndroidElement dia1 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup");
		dia1.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup"));
		AndroidElement dia2 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup");
		dia2.click();
	}
	
	public void insertMonth() {
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[17]/android.view.ViewGroup"));
		AndroidElement mes1 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[17]/android.view.ViewGroup");
		mes1.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup"));
		AndroidElement mes2 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup");
		mes2.click();
	}
	
	public void insertYear() {
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup"));
		AndroidElement anio1 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup");
		anio1.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[15]/android.view.ViewGroup"));
		AndroidElement anio2 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[15]/android.view.ViewGroup");
		anio2.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[15]/android.view.ViewGroup"));
		AndroidElement anio3 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[15]/android.view.ViewGroup");
		anio3.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup"));
		AndroidElement anio4 = getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup");
		anio4.click();
	}
	
	public void clicBtnNext() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_next)));
		System.out.println("clic al boton next");
		AndroidElement btn_next = getDriver().findElementByXPath(str_next);
		System.out.println("Boton: " + btn_next.getText());
		btn_next.click();
	}
	
	public void clicBtnYes() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_yes)));
		System.out.println("clic al boton yes");
		AndroidElement btn_yes = getDriver().findElementByXPath(str_yes);
		System.out.println("Boton: " + btn_yes.getText());
		btn_yes.click();
	}

}
