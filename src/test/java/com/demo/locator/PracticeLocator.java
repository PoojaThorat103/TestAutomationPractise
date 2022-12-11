package com.demo.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.demo.action.BaseClass;

public class PracticeLocator extends BaseClass{

public PracticeLocator() {
	PageFactory.initElements(driver, this);}
	
		@FindBy(xpath="//button[@id='doubleClickBtn']")
		public WebElement DoubleClickButton;
		
		@FindBy(xpath="//p[@id='doubleClickMessage']")
		public WebElement doubleClickText;
		
		@FindBy(xpath ="//button[@id='rightClickBtn']")
		public WebElement rightClickButton;
		
		@FindBy(xpath="//p[@id='rightClickMessage']")
		public WebElement rightClickText;
		
		@FindBy(xpath="//input[@id='userName']")
		public WebElement fullName;
		
		@FindBy(xpath="//div[@id='draggable']")
		public WebElement dragItam;
		
		@FindBy(xpath="//div[@id='droppableExample-tabpane-simple']//descendant::div[@id='droppable']")
		public WebElement dropItem;
		
		@FindBy(xpath="//button[@id='submit']")
		public WebElement submitButton;
	
}
