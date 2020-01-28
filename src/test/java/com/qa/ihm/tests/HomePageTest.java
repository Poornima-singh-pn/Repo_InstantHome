package com.qa.ihm.tests;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ihm.base.Testbase;
import com.qa.ihm.pages.HomePage;

import junit.framework.Assert;

public class HomePageTest extends Testbase {
	
	HomePage homepage;
	
	public HomePageTest() throws IOException{
//		//	this.driver = driver;
			super();
		}
		
			
		

	@BeforeMethod
	       public void setUp() {
			   intilization();
			   homepage = new HomePage();
			  }
			   
		   
			
		@Test(priority = 1)
		public void findhomebtnTest(){
			 boolean value = homepage.validatefindhomebtn();
		 Assert.assertTrue(value);
	}
		
		@Test(priority = 2)
		public void homebtnclickTest(){
			homepage.findhomebtnclick();
		
		}
	@Test(priority = 3)
		public void findbuybtnTest(){
		homepage.findhomebtnclick();
				 boolean value = homepage.validatebuybtn();
				 System.out.println("buy btn"+ value);
			 Assert.assertTrue(value);
		
		}
		
		@Test(priority = 4)
		public void buybtnclickTest(){
			
	homepage.findhomebtnclick();
			homepage.findbuyclick();
		}
		
		@Test(priority = 5)
		public void findrentbtnTest(){
			homepage.findhomebtnclick();
				 boolean value = homepage.validaterentbtn();
			 Assert.assertTrue(value);
		
		}
		
		@Test(priority = 6)
		public void rebtbtnclickTest(){
			homepage.findhomebtnclick();
			homepage.findrentclick();
		}
		
			@Test(priority = 7)
		public void continuebtnclickTest(){
		homepage.findhomebtnclick();
			homepage.continueclick();
		}
		
			@Test(priority = 8)
			public void selllinkTest(){
				homepage.sellhomeclick();
			}
			

			
		@AfterMethod
		public void TearDown() {
			driver.quit();
		}
	}


	


