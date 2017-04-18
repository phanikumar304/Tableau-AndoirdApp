package Tableau_Test.Tableau_Test;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SignOut {
	
	static By meNu = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
	static By sOut = By.xpath("//android.widget.CheckedTextView[@text='Sign out']");
	static By UnStar = By.xpath("//android.widget.CheckBox[@content-desc='buttonFavoriteId']");
	
	public static void signOut(AndroidDriver sPage) throws InterruptedException{
		sPage.findElement(UnStar).click();
		sPage.findElement(meNu).click();
		Thread.sleep(100);
		sPage.findElement(sOut).click();
	}

}
