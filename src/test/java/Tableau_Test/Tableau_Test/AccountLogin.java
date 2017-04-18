package Tableau_Test.Tableau_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class AccountLogin {

	static By online = By.xpath("//android.widget.TextView[@text='Tableau Online']");
	static By webV = By.xpath("//android.view.View[contains(@resource-id,'prelogin-form')]");
	static By uName = By.xpath("//android.widget.EditText[contains(@resource-id,'email')]");
	static By pwd = By.xpath("//android.widget.EditText[contains(@resource-id,'password')]");
	static By signIn = By.xpath("//android.widget.Button[contains(@resource-id,'login-submit')]");

	public static void clickLoginOnline(AndroidDriver cLogin) {
		cLogin.findElement(online).click();
	}

	public static void signIn(AndroidDriver loginAcc) throws InterruptedException {

		TouchAction action = new TouchAction(loginAcc);
		action.longPress(loginAcc.findElement(webV)).perform();

		loginAcc.findElement(uName).click();
		loginAcc.findElement(uName).sendKeys("phanikumar851@gmail.com");
		loginAcc.findElement(pwd).sendKeys("jaisairam1");
		loginAcc.findElement(signIn).click();

	}

}
