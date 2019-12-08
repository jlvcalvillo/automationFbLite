package com.automation.fblite;

import org.testng.annotations.Test;

import com.automation.pages.BirthdayPage;
import com.automation.pages.GenderPage;
import com.automation.pages.IntroductionPage;
import com.automation.pages.MobileNumberPage;
import com.automation.pages.PasswordPage;
import com.automation.pages.SecondPage;
import com.automation.pages.YourNamePage;

import static org.testng.Assert.assertTrue;

public class IntroductionTest extends BaseTest{
	
	@Test
	public void validationTest() {
		System.out.println("validacion " + myDriver);		
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		introductionPage.getBtnCrearCuenta();
		
		SecondPage secondPage = new SecondPage(myDriver);
		assertTrue(secondPage.clicBtnNext());
		
		YourNamePage yourNamePage = new YourNamePage(myDriver);
		assertTrue(yourNamePage.getTitle());
		yourNamePage.insertFistName();
		yourNamePage.insertLastName();
		yourNamePage.clicBtnNext();
		
		MobileNumberPage mobileNumberPage = new MobileNumberPage(myDriver);
		assertTrue(mobileNumberPage.getTitle());
		mobileNumberPage.insertNumber();
		mobileNumberPage.clicBtnNext();
		
		BirthdayPage birthdayPage = new BirthdayPage(myDriver);
		assertTrue(birthdayPage.getTitle());
		birthdayPage.insertMonth();
		birthdayPage.insertDay();
		birthdayPage.insertYear();
		birthdayPage.clicBtnNext();
		
		GenderPage genderPage = new GenderPage(myDriver);
		assertTrue(genderPage.getTitle());
		genderPage.clickBtnSex();
		
		PasswordPage passwordPage = new PasswordPage(myDriver);
		assertTrue(passwordPage.getTitle());
		passwordPage.insertPass();
		passwordPage.clickRegistrar();
	}

}
