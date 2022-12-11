package com.demo.action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class Wrapper extends BaseClass{

	public void userClick(WebElement we) {
		we.click();
	}
	
	public void userType(WebElement we, String text) {
		we.sendKeys(text);
	}
	
	public void ScrollDownVertical(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)");
		js.executeScript("arguments[0].scrollIntoView();", we);
		//js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", we);
	}
}
