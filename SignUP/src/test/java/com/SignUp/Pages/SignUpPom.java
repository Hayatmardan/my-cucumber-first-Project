package com.SignUp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SignUp.Utilities.Base;
import com.SignUp.Utilities.CustomUtilities;

public class SignUpPom extends Base{
	
	public SignUpPom() {
		
		PageFactory.initElements(driver, this);
		
	}
	//public WebElement Firstname = CustomUtilities.fluentWait(By.name("firstname"));
	@FindBy(name="firstname")
	public WebElement Firstname;
	
	@FindBy(name="lastname")
	public WebElement Lastname;
	
	@FindBy(id="u_0_k")
	public WebElement Email;
	
	@FindBy(id="u_0_p")
	public WebElement PassWord;
	
	@FindBy(id="u_0_s")
	public WebElement male;
	
	@FindBy(id="u_0_w")
	public WebElement botten;

}
