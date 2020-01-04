package com.SignUp.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.Base;

public class SignUpbotten extends Base {
	
	 public SignUpbotten() 
	 {
		 
		 
	 
	 PageFactory.initElements(driver, this);
	 
	 }
			@FindBy(id="u_0_w")
			public WebElement botten;

	 		 
	 }

