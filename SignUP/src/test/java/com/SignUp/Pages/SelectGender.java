package com.SignUp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.Base;

public class SelectGender extends Base {

	public SelectGender() 
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="u_0_s")
	public WebElement male;

}
