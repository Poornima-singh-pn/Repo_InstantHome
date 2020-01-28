package com.qa.ihm.base;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.ihm.util.TestUtil;


	public class Testbase {
			

		   
			   public static WebDriver driver;
			  public static Properties prop;
		
			  
			   public Testbase(){
				   try {
					prop = new Properties();
					  FileInputStream ip = new FileInputStream("\\Automation\\InstantHomeAutomation\\src\\main\\java\\com\\qa\\ihm\\config\\config.properties");
					  
					  
					prop.load(ip);
					
				} catch (FileNotFoundException e) {
					// TODO: handle exception\
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			  }
			   
			   
			  
			   
			   public static void intilization() {
				  String  browser1 = prop.getProperty("browser");
				  if(browser1.equals("chrome")) {
					  System. setProperty("webdriver.chrome.driver","C:\\Users\\Bluetie Backup 3 i5\\Downloads\\chromedriver_win32\\chromedriver.exe");
					  driver = new ChromeDriver();
				  }
				  
				  
				  
//				  System. setProperty("webdriver.chrome.driver","C:\\Users\\Bluetie Backup 3 i5\\Downloads\\chromedriver_win32\\chromedriver.exe");
//				  driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
				 driver.get(prop.getProperty("url"));
				
			   

			}

	}


	

