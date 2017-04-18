package Tableau_Test.Tableau_Test;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;

public class ScrollPage {
	
	public static void scrollPage(AndroidDriver sPage) {
		Dimension dimensions = sPage.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("The screen scroll start at" + " " + scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.8;
		int scrollEnd = screenHeightEnd.intValue();
		System.out.println("The screen scroll end at" + " " + scrollEnd);
		sPage.swipe(0, scrollStart, 0, scrollEnd, 1000);
		
	}

}
