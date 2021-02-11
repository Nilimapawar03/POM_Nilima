package com.ip.clients;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ip.TestBase.TestBase;
import com.ip.login.Login;

public class LoginTest extends TestBase {

	Login login;


	public LoginTest() throws IOException {
		super();

	}
	@BeforeMethod
	public void setup()   {
		intialization();
		try {
			login=new Login();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void getemailtxt() {
		login.getemailtxt();
		Assert.assertEquals("nilimapawar03@gmail.com", "NilimaPawar03@gmail.com");
	}

@AfterMethod
public void close() {
	driver.quit();
}
}	


