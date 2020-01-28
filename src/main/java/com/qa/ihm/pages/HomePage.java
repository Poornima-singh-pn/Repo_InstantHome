package com.qa.ihm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ihm.base.Testbase;




public class HomePage extends Testbase {
	
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-rounded btn-lg']")
	WebElement FindhomeBtn;
	
	@FindBy(xpath="//label[@class='chip fixed-width active']")
	WebElement buybtn;
	
	@FindBy(xpath="//label[@class='chip fixed-width active']")
	WebElement rentbtn;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block btn-md'][contains(text(),'Continue')]")
	WebElement continuebtn;
	
	@FindBy(xpath="//div[@class='col-md-3']//a[contains(text(),'Sell your home')]")
	WebElement sellhomelink;
	
	
	
	public HomePage( ) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validatefindhomebtn() {
		return  FindhomeBtn.isDisplayed();
	}
	
	public void findhomebtnclick() {
		FindhomeBtn.click();
	}
	
	public boolean validatebuybtn() {
		return  buybtn.isDisplayed();
	}
	
	public void findbuyclick() {
		buybtn.click();
	}
	
	public boolean validaterentbtn() {
		return  rentbtn.isDisplayed();
	}
	
	public void findrentclick() {
		rentbtn.click();
	}
	
	
	public void continueclick() {
		continuebtn.click();
	}
	
	public void sellhomeclick() {
		WebElement element = driver.findElement(By.xpath("//div[@class='col-md-3']//a[contains(text(),'Sell your home')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();

		sellhomelink.click();
	}
	

}
