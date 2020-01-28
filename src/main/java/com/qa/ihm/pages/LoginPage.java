package com.qa.ihm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ihm.base.Testbase;

public class LoginPage  extends Testbase{
	
	
	@FindBy(xpath="//button[@class='btn btn-link'] ")
	WebElement loginlink;
	
	@FindBy(xpath="//button[@class='btn btn-outline-primary btn-login btn-block m-t-15']")
	WebElement ContinuewithPhn;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement phnno;
	
	@FindBy(xpath="//button[@class='btn btn-outline-primary']")
	WebElement sendbtn;
	
	//initilize the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLoginlink() {
		 loginlink.click();
		
	}
	
	public void clickonContinueWithPh() {
		ContinuewithPhn.click();
		
	}
		
	public void login(String num) {
		phnno.sendKeys(num);
		sendbtn.click();
		
	
	}




}
