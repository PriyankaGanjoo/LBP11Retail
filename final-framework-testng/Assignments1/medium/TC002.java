package medium;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import simple.TC001;

public class TC002 {
	
	private WebDriver driver;
	private String baseUrl;
	private RetailPOM retailPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		retailPOM = new RetailPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		//login to retail
		retailPOM.sendUserName("admin");
		retailPOM.sendPassword("admin@123");
		retailPOM.clickLoginBtn();
	}
	
	//@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
driver.quit();

}
	/*@Test(dataProvider= "excel-inputs", dataProviderClass=LoginDataProviders.class)
	public void returnproduct()//(int id, String Customer, String Firstname, String Lastname, String Email, int ph, String Product, String Model)
	{
		
		retailPOM.clickSales();
		retailPOM.clickReturns();
		retailPOM.ClickAddReturn();
		retailPOM.SendOrderId("165");
		retailPOM.SendCust("Rohit Verma");
		retailPOM.SendFirstName("Rohit");
		retailPOM.SendLastName("Verma"); 
		retailPOM.SendRetEmail("vinod.ganjoo@gmail.com");
		retailPOM.SendPhone("123456789");
		retailPOM.SendProduct("SasmitaRing");
		retailPOM.SendModel("SKU-012");
		retailPOM.CustSave();
		retailPOM.clickDeletechk();
		retailPOM.clickDeleteBtn();
		retailPOM.clickAlertAcpt();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(), "Success: You have modified returns!"+"\n"+"×");
	}
	*/
	

	@Test(dataProvider= "excel-inputs", dataProviderClass=LoginDataProviders.class, enabled=false)
	public void returnproduct(String id, String Customer, String Firstname, String Lastname, String Email, String ph, String Product, String Model)
	{
		
		retailPOM.clickSales();
		retailPOM.clickReturns();
		retailPOM.ClickAddReturn();
		retailPOM.SendOrderId(id);
		retailPOM.SendCust(Customer);
		retailPOM.SendFirstName(Firstname);
		retailPOM.SendLastName(Lastname); 
		retailPOM.SendRetEmail(Email);
		retailPOM.SendPhone(ph);
		retailPOM.SendProduct(Product);
		retailPOM.SendModel(Model);
		retailPOM.CustSave();
		retailPOM.clickDeletechk();
		retailPOM.clickDeleteBtn();
		retailPOM.clickAlertAcpt();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(), "Success: You have modified returns!"+"\n"+"×");
	}
	
	@Test
public void customerDetails() {
		
		
		retailPOM.clickCusticon();
		retailPOM.clickCustlink();
		retailPOM.ClickEditCust();
		retailPOM.SendEditFN("Ravi");
		retailPOM.ClickAddress1();
		retailPOM.Send("400168");
		retailPOM.ClickRewards();
		retailPOM.SendDescription("Rewards added");
		retailPOM.SendPoints("101");
		retailPOM.ClickRewardsave();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(), "Success: You have modified customers!"+"\n"+"×");
		
		}
		
}	
	
