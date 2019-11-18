package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement AddReturn;
	
	@FindBy(xpath="//input[@id='input-order-id']")
	private WebElement OrderId;
	
	@FindBy(xpath="//input[@id='input-customer']")
	private WebElement Cust;
	
	//@FindBy(xpath="//li[contains(text(),'Default')]")
	private WebElement CustDefault;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement RetEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@id='input-product']")
	private WebElement Product;
	
		
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement Model;
	
		
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement Save;
	
	@FindBy(xpath="//tr[5]//td[8]//a[1]//i[1]")
	private WebElement EditCust;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement EditFN;
	
	@FindBy(xpath="//a[contains(text(),'Address 1')]")
	private WebElement Address1;
	
	@FindBy(xpath="//input[@id='input-postcode1']")
	private WebElement Postcode1;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Reward Points')]")
	private WebElement Rewards;
	
	@FindBy(xpath="//input[@id='input-reward-description']")
	private WebElement Description;
	
	@FindBy(xpath="//input[@id='input-points']")
	private WebElement Points;
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement Rewardsave;
	
	
	public void ClickEditCust() 
	{
		this.EditCust.click();	
	}
	
	public void SendEditFN(String EditFN) 
	{
		this.EditFN.clear();
		this.EditFN.sendKeys(EditFN);
	}
	
	public void ClickAddress1() 
	{
		this.Address1.click();
		
	}
	
	public void Send(String Postcode1) 
	{
		this.Postcode1.clear();
		this.Postcode1.sendKeys(Postcode1);
	}
	
	public void ClickRewards() 
	{
		this.Rewards.click();	
	}
	
	public void SendDescription(String Description) 
	{
				this.Description.sendKeys(Description);
	}
	
	public void SendPoints(String Points) 
	{
				this.Points.sendKeys(Points);
	}
	
	public void ClickRewardsave() 
	{
		this.Rewardsave.click();	
	}
	
	
	
	
	
	
	
	//public void Wait() 
	//{
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-model']")));
	//}
	
	public void CustSave() 
	{
		this.Save.click();	
	}
	public void ClickAddReturn() 
	{
		this.AddReturn.click();	
	}
	
	
	public void SendOrderId(String id) 
	{
		this.OrderId.sendKeys(id);
		
	}
	
	public void SendCust(String Customer) 
	{
		this.Cust.sendKeys(Customer);
	}
	
	
	public void SendFirstName(String FirstName) 
	{
		this.FirstName.sendKeys(FirstName);
	}
	
	public void SendLastName(String Lastname) 
	{
		this.LastName.sendKeys(Lastname);	
	}
	
	public void SendRetEmail(String Email) 
	{
		this.RetEmail.sendKeys(Email);	
	}
	
	public void SendPhone(String ph) 
	{
		this.Phone.sendKeys(ph);
		
	}
	
	public void SendProduct(String Product) 
	{
		this.Product.sendKeys(Product);	
	}
	
	public void SendModel(String Model) 
	{
		this.Model.sendKeys(Model);	
	}
	
	
	
		
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