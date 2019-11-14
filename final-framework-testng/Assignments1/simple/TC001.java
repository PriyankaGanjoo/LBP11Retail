package simple;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC001 {    

	private WebDriver driver;
	private String baseUrl;
	private RetailPOM retailPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		retailPOM = new RetailPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	//@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		retailPOM.sendUserName("admin");
		screenShot.captureScreenShot("First");
		retailPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("Second");
		retailPOM.clickLoginBtn();
		screenShot.captureScreenShot("Third");
		retailPOM.clickSales();
		screenShot.captureScreenShot("Fourth");
		retailPOM.clickReturns();
		screenShot.captureScreenShot("Fifth");
		retailPOM.clickDeletechk();
		screenShot.captureScreenShot("Sixth");
		retailPOM.clickDeleteBtn();
		//screenShot.captureScreenShot("Seventh");
		retailPOM.clickAlertAcpt();
		screenShot.captureScreenShot("Eight");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(), "Success: You have modified returns!      ");
		screenShot.captureScreenShot("Ninth");
	}
}

