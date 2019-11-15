package com.training.pom;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//i[@class='fa fa-user fw']")
	private WebElement Custicon;
	
	@FindBy(xpath="//li[@id='menu-customer']//ul//li//a[contains(text(),'Customers')]")
	private WebElement Custlink;
	
	@FindBy(xpath="//tbody//tr[1]//td[1]//input[1]")
	private WebElement Custchk;
	
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	private WebElement Custdelbtn;
	
	@FindBy(xpath="//input[@id='input-name']")
	public WebElement Custname;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement Email;
	
	@FindBy(xpath="//button[@id='button-filter']")
	private WebElement Filter;
	
	
	
	
		
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
	
	public void clickCusticon() {
		this.Custicon.click(); 
	}
	
	public void clickCustlink() {
		this.Custlink.click(); 
	}
	
	public void clickCustchk() {
		this.Custchk.click(); 
	}
	
	public void clickCustdelbtn() {
		this.Custdelbtn.click(); 
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
	public void getMessage() {
			String message =driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			System.out.println(message);
	}
	public void sendCustname(String Custname) {
		this.Custname.clear();
		this.Custname.sendKeys(Custname); 
				
	}
	
	public void clickFilter() {
		this.Filter.click();
	}
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email); 
		
		
	}
}