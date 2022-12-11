package com.demo.action;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.demo.locator.PracticeLocator;

 public class PracticeAction extends Wrapper{
	PracticeLocator practiceLocator;
	
 public PracticeAction() {
	practiceLocator = new PracticeLocator();}
	
 public void DoubleClickAction() {		
		driver.navigate().to("https://demoqa.com/buttons");
		Actions actions = new Actions(driver);
		actions.doubleClick(practiceLocator.DoubleClickButton).perform();
		//System.out.println("This is text " + webTableLocator.doubleClickText.getText());
		Assert.assertEquals("Text does not matched: " , "You have done a double click", practiceLocator.doubleClickText.getText());}
	
  public void rightClickAction() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.navigate().to("https://demoqa.com/buttons");
	Actions actions = new Actions(driver);
	actions.contextClick(practiceLocator.rightClickButton).perform();	
	Assert.assertEquals("Text does not matched", "You have done a right click",practiceLocator.rightClickText.getText());}
  
  public void keyBoardAction() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.navigate().to("https://demoqa.com/text-box");
	  Actions actions = new Actions(driver);
	  Action command = actions.moveToElement(practiceLocator.fullName).click(practiceLocator.fullName)
			  .keyDown(practiceLocator.fullName, Keys.SHIFT).sendKeys(practiceLocator.fullName,"pooja")
			  .keyUp(practiceLocator.fullName, Keys.SHIFT).build();  
	  			command.perform();}
  
  public void DragAndDropAction() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.navigate().to("https://demoqa.com/droppable/");
	  Actions actions = new Actions(driver);
	  actions.dragAndDrop(practiceLocator.dragItam, practiceLocator.dropItem).perform();  }
  
  public void ScrollAction() {
	  driver.navigate().to("https://demoqa.com/text-box");
	  ScrollDownVertical(practiceLocator.submitButton); 
	  boolean isDisplayed = true;
	  try {
	  Assert.assertTrue("Element Not Display", practiceLocator.submitButton.isDisplayed());
	  }
	  catch(NoSuchElementException e){
	  System.out.println("This is Exception"  + e);
	  }
	  
	  userClick(practiceLocator.submitButton);
	  System.out.println("User has click on element");
  }
  
  
  
	  
  }


