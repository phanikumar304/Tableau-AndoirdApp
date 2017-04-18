package Tableau_Test.Tableau_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class TableauAccount {

	AndroidDriver driver;

	@Before
	public void capb() throws IOException, IOException {

		// Importing the desired capabilities using Object Repository
		String file = "/Users/NIS1651m/Documents/phani/Tableau_Test/DesiredCap.properties";
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", prop.getProperty("automationName"));
		capabilities.setCapability("platformName", prop.getProperty("platformName"));
		capabilities.setCapability("platformVersion", prop.getProperty("platformVersion"));
		System.out.println(prop.getProperty("platformVersion"));
		System.out.println(prop.getProperty("deviceName"));
		capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
		capabilities.setCapability("app", prop.getProperty("app"));
		capabilities.setCapability("appPackage", prop.getProperty("appPackage"));
		capabilities.setCapability("appActivity", prop.getProperty("appActivity"));

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test
	public void tactAccount() throws InterruptedException{
		AccountLogin.clickLoginOnline(driver);
		AccountLogin.signIn(driver);
		Thread.sleep(100);
		Account.accountLogin(driver);
		Account.analyzeSuperStore(driver);
		SignOut.signOut(driver);
		
	}

}
