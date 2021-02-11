package com.ip.qa.pages.clients;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ip.TestBase.TestBase;

	public class AddClients extends TestBase {

		//Step 1 :Locate a elements
		//Step 2: Use Pagefactory to call elements
		//Step 3: Create Method (Actions on Page) 

		@FindBy(id="client_name")
		WebElement ClientName;

		@FindBy(xpath="//span[@id='select2-client_language-container']")
		WebElement Language;

		@FindBy(id="client_active")
		WebElement CheckboxActive;
		
		//@FindBy(xpath="//i[@class='fa fa-calendar fa-fw']")
		WebElement Dateselection;
		

		@FindBy(id="//button[@id='btn-submit']")
		WebElement Btnsave;	



	public AddClients() throws IOException {
		super();
	PageFactory.initElements(driver,this);
	}

	//Actions : 
	//1.Click on Client 
	public void setclientname(String clientname) {ClientName.sendKeys("clientname");}
	//2.Select language-Drop down 
	public void setlanguage(String language) {Language.sendKeys("lang");}
	//3.selection of checkbox
	public boolean setcheck(String checked) {return CheckboxActive.isSelected();}
	//4.Save button
	public void clicksave() {Btnsave.click();}
	}

