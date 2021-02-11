package com.ip.TestBase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ip.Utilites.TestUtil;
public class TestBase {
	public static WebDriver driver;
	public static Properties prop;



	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\POM_ip project\\Drivers\\chromedriver.exe");
		prop.load(ip);
	}

	public static void intialization() {
		String browserName=prop.getProperty("browser");
		if (browserName.equals("chrome"));
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\POM_ip project\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
}