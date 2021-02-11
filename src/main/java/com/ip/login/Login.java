package com.ip.login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ip.qa.pages.clients.AddClients;


public class Login {
	
	WebDriver driver;
	
	
	//Page Factory
@FindBy(id="//h1[contains(text(),'Login')]'")
WebElement Logoimg;

@FindBy(id="//input[@id='email']")
WebElement Email;

@FindBy(xpath="//label[contains(text(),'Email')]")
WebElement lableEmail;

@FindBy(id="//input[@id='password']")
WebElement Password;

@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement btnLogin;

@FindBy(xpath="//a[@class='btn btn-default']")
WebElement btnForgotpassword;

//How to Intialize the OR with help of Page factory

public Login() throws IOException {
	super();
	// TODO Auto-generated constructor stub

	PageFactory.initElements(driver,this);
}
//Actions : 
//Enter mail id 
public void setemail(String Emailid) {
	Email.sendKeys("Emailid");
	
}
//Get Email lable text
public String getemailtxt(){
	return lableEmail.getText();
}

//Enter Password
public void setpwd(String pwd) {
	Password.sendKeys("Password");
}
//Click on Loginbtn
public void verifylogin() {
	btnLogin.click();
}
public Dashboard login1(String Emailid,String pwd) throws IOException {
	Email.sendKeys(Emailid);
	Password.sendKeys(pwd);
	btnLogin.click();
	
	return new Dashboard();
}
}
