package Tableau_Test.Tableau_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Account {
	
	static By selectAll = By.xpath("//android.widget.TextView[@text='All']");
	static By markStar = By.xpath("//android.widget.CheckBox[@content-desc='buttonFavoriteId']");
	static By favouriTes = By.xpath("//android.widget.TextView[@text='Favorites']");
	static By Recent = By.xpath("//android.widget.TextView[@text='Recents']");
	static By clickStore = By.xpath("//android.widget.TextView[contains(@resource-id,'com.Tableau.TableauApp:id/sheet_navigator_item_sheet_name')]");
	static By ActionSheet = By.xpath("//android.widget.TextView[contains(@resource-id,'com.Tableau.TableauApp:id/action_sheets')]");
	//static By OrderDetails = By.xpath("//android.widget.TextView[contains(@resource-id,'com.Tableau.TableauApp:id/sheet_selector_item_sheet_name') and @text='Order Details')]");
	static By OrderDetails = By.xpath("//android.view.View[@index='6']");
	//static By selectState = By.xpath("//android.view.View[@content-desc='State (All)']");
	//static By Region = By.xpath("//android.view.View[@content-desc='Region (All)']");
	//static By goBack = By.xpath("android.widget.ImageButton[@content-desc='Navigate up']");
	static By selectCity = By.xpath("//android.view.View[@index='13']");
	static By selAustin = By.xpath("//android.view.View[@index='53']");
	static By appLy = By.xpath("//android.widget.Button[@content-desc='Apply Apply']");
	static By navGback = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
	
	
	
	public static void accountLogin(AndroidDriver sAll) throws InterruptedException{
		sAll.findElement(selectAll).click();
		sAll.findElement(markStar).click();
		Thread.sleep(200);
		sAll.findElement(Recent).click();
		sAll.findElement(favouriTes).click();
	}
	
	public static void analyzeSuperStore(AndroidDriver aStore) throws InterruptedException{
		aStore.findElement(clickStore).click();
		Thread.sleep(300);
		aStore.findElement(OrderDetails).click();
		Thread.sleep(500);
		//aStore.findElement(goBack).click();
		aStore.findElement(selectCity).click();
		aStore.findElement(selectCity).click();
		aStore.findElement(selectCity).click();
	    aStore.findElement(selAustin).click();
	    aStore.findElement(appLy).click();
	    aStore.findElement(navGback).click();
	    
	}

}
