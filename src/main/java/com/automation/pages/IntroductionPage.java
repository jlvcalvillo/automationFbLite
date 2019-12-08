package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage{

	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String str_crear_cuenta = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup";
	
	public void getBtnCrearCuenta() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str_crear_cuenta)));
		System.out.println("clic al boton crear cuenta");
		AndroidElement btn_crear_cuenta = getDriver().findElementByXPath(str_crear_cuenta);
		System.out.println("Boton: " + btn_crear_cuenta.getText());
		btn_crear_cuenta.click();
	}

}
