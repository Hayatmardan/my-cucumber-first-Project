package com.SignUp.Step_Definations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.SignUp.Pages.SelectGender;
import com.SignUp.Pages.SignUpbotten;
import com.SignUp.Pages.SignUpPom;
import com.SignUp.Utilities.Base;
import com.SignUp.Utilities.CustomUtilities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FBSignUP extends Base{
	
	SignUpPom SU = new SignUpPom();
	SelectGender GA = new SelectGender();
	SignUpbotten SI =new SignUpbotten();
	//WebDriver driver;


@Given("^that I should be able to do abc$")
public void that_I_should_be_able_to_do_abc() throws Throwable{
	//System.setProperty("webdriver.chrome.driver","/Users/hayat/Desktop/chromedriver");
   // driver = new ChromeDriver();
   
  // driver.manage().window().maximize();
   driver.get("https://www.facebook.com");
}


@Then("^i should be able enter firstname$")
public void i_should_be_able_enter_firstname() throws Throwable {
	
	  // driver.findElement(By.name("firstname")).sendKeys("Hayat");
	  // SU.firstname.sendKeys("Hayat");
	SU.Firstname.sendKeys("Hayat");

}

@Then("^i should be able enter lastname$")
public void i_should_be_able_enter_lastname() throws Throwable {
	//driver.findElement(By.name("lastname")).sendKeys("ullah");
	SU.Lastname.sendKeys("ullah");
}
@Then("^i should enter email address$")
public void i_should_enter_email_address() throws Throwable {
	//driver.findElement(By.id("u_0_k")).sendKeys("khanjan22@gmail.com");
	SU.Email.sendKeys("khanjan22@gmail.com");
}
@Then("^i should enter my password$")
public void i_should_enter_my_password() throws Throwable{ 
	//driver.findElement(By.id("u_0_p")).sendKeys("Khan123@");
	SU.PassWord.sendKeys("Khan123@");
}

@Given("^that I should be able to selet month of my DOB$")
public void that_I_should_be_able_to_selet_month_of_my_DOB() throws Throwable {
	 Select ddMonth = new Select(driver.findElement(By.name("birthday_month")));
	   
	   
	   ddMonth.selectByIndex(3);
}

@Then("^i should be able to selet  Date of my DOB$")
public void i_should_be_able_to_selet_Date_of_my_DOB() throws Throwable {
	Select ddDay = new Select(driver.findElement(By.name("birthday_day")));
	  	   ddDay.selectByIndex(10);
}

@Then("^i should be able to selet Year of my DOB$")
public void i_should_be_able_to_selet_Year_of_my_DOB() throws Throwable {

	   Select ddyear = new Select(driver.findElement(By.name("birthday_year")));
	   ddyear.selectByVisibleText("1980");



}




@Given("^i should be adle to select male$")
public void i_should_be_adle_to_select_male() throws Throwable {
  GA.male.click();
}

@Given("^i should be able to click SignUp bottan$")
public void i_should_be_able_to_click_SignUp_bottan() throws Throwable {
    SI.botten.click();
}
@Then("^i should be able to select  Date of my DOB$")
public void i_should_be_able_to_select_Date_of_my_DOB() throws Throwable {
    
}

@Then("^i should be able to select Year of my DOB$")
public void i_should_be_able_to_select_Year_of_my_DOB() throws Throwable {
    
}

@Then("^i should be able enter \"([^\"]*)\" in First name field$")
public void i_should_be_able_enter_in_First_name_field(String FirstName) throws Throwable {
	
  CustomUtilities.highlightElement(SU.Firstname); 	
   SU.Firstname.sendKeys(FirstName);
   //Assert.assertEquals(FirstName, SU.Firstname.getText());
   Assert.assertEquals(FirstName,SU.Firstname.getAttribute("value") );
}

@Then("^i should be able enter \"([^\"]*)\" in last name field$")
public void i_should_be_able_enter_in_last_name_field(String lastname) throws Throwable {
    SU.Lastname.sendKeys(lastname);
}

@Then("^i should enter \"([^\"]*)\" in email field$")
public void i_should_enter_in_email_field(String EMAIL) throws Throwable {
   SU.Email.sendKeys(EMAIL);
}


@Given("^verify the title \"([^\"]*)\"$")
public void verify_the_title(String title) throws Throwable {
 sAssert.assertThat(title).isEqualTo(driver.getTitle()); 
//Assert.assertEquals("Facebook - Log In or Sign Up",driver.getTitle());
}

}
