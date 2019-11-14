package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailPOM {
	private WebDriver driver; 
	
	public RetailPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-username']")
	private WebElement userName; 
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement Sales; 
	
	@FindBy(xpath="//li[@id='menu-sale']//ul//li//a[contains(text(),'Returns')]")
	private WebElement Returns; 
	
	@FindBy(xpath="//tbody//tr[1]//td[1]//input[1]")
	private WebElement Deletechk;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
	private WebElement Deletebtn;	
	
	
	
		
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickSales() {
		this.Sales.click(); 
	}
	
	public void clickReturns() {
		this.Returns.click(); 
	}
	
	public void clickDeletechk() {
		this.Deletechk.click(); 
	}
	
	public void clickDeleteBtn() {
		this.Deletebtn.click(); 
	}
	
	public void clickAlertAcpt() {
		driver.switchTo().alert().accept();
	}
		
		public void clickMessage() {
			driver.switchTo().alert().accept();
	}
}