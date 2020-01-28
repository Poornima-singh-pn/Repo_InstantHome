package com.qa.ihm.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.qa.ihm.base.Testbase;
import com.qa.ihm.pages.HomePage;
import com.qa.ihm.pages.LoginPage;

public class LoginPageTest  extends Testbase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	static WebDriver driver;
	
	public LoginPageTest() {
		super();
	}

	
			
	@BeforeClass
    public void setUp() throws InterruptedException {
		   intilization();
		   loginpage = new LoginPage();

		   homepage = new HomePage();
		   homepage.findhomebtnclick();
		 
		   Thread.sleep(2000);
		   
		   
		  }

	@Test(priority = 1)
	
	public void verifyLoginlinkTest() {
				
		loginpage.verifyLoginlink();
		System.out.println(" click on login link");

		
	}

	@Test(priority = 2)
	public void ContinuewithPhnTest(){
	//	loginpage.verifyLoginlink();
		loginpage.clickonContinueWithPh();
	}
			
	@Test(priority = 3)
	public void loginTest(){
		
		 loginpage.login(prop.getProperty("num"));
		
	}
		
	@AfterClass
	public void TearDown() {
		if(driver!=null) {
			driver.quit();
		}
		
	}

}
