package com.demo.steps;

import com.demo.action.PracticeAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PracticeStepDefinition {
	PracticeAction practiceAction ;
	
public PracticeStepDefinition(){
	 practiceAction = new PracticeAction();}

@When("^User double click on button and validate it$")
public void user_double_click_on_button_and_validate_it() {
    practiceAction.DoubleClickAction();}

@When("^User Right click on button and validate it$")
public void user_Right_click_on_button_and_validate_it() throws InterruptedException  {
	practiceAction.rightClickAction(); }

@When("^User perform Keyboard Actions$")
public void user_perform_Keyboard_Actions() throws InterruptedException {
	practiceAction.keyBoardAction();}

@When("^User perform drag and drop and validate it$")
public void user_perform_drag_and_drop_and_validate_it() throws InterruptedException{
	//practiceAction.DragAndDropAction();
	practiceAction.ScrollAction();	
}


}
