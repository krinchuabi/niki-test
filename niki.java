package checklist;
import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.*;
public class niki {
	private StringBuffer verificationErrors = new StringBuffer();
	org.openqa.selenium.Dimension size;
	 AndroidDriver driver;
	 @BeforeTest
		public void test1() throws MalformedURLException
		{	
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("BROWSER_NAME", "Android");
			capabilities.setCapability("VERSION", "5.1.1"); 
			capabilities.setCapability("deviceName","5203d37efb00534f");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("appPackage", "com.techbins.niki.beta");
			capabilities.setCapability("appActivity","com.techbins.niki.SplashActivity"); 
			driver = (AndroidDriver) new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);		
		}
	 /*Verify if Phone Number field is displayed*/
	 @Test (enabled = false)
	 public void PhoneNumber() throws Exception {
		 if(isElementPresent(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")))
		 {
			 System.out.println("Phone number is field is displayed as intended in the first page");
		 }
		
		 else
		 {
			 System.out.println("Not executed successfully");
		 }
		 }
	 /*Verify if OTP field is displayed*/
	 @Test (enabled = false)
	 public void OTP() throws Exception {
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).clear();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).sendKeys("9600899109");
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.techbins.niki.beta:id/btnSubmit']")).click();
		 Thread.sleep(12000);
		 if(isElementPresent(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/editTxtCode']")))
		 {
			 System.out.println("OTP is field is displayed as intended in the second page");
		 }
		
		 else
		 {
			 System.out.println("Not executed successfully");
		 }
		 }
	 /*Verify if Wrong Number field is displayed*/
	 @Test (enabled = false)
	 public void WrongNumber() throws Exception {
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).clear();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).sendKeys("9600899109");
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.techbins.niki.beta:id/btnSubmit']")).click();
		 Thread.sleep(12000);
		 if(isElementPresent(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/txtWrongNumber']")))
		 {
			 System.out.println("Wrong Number link is displayed as intended in the second page");
		 }
		
		 else
		 {
			 System.out.println("Not executed successfully");
		 }
		 }
	 
	 /*Verify if application is able to login successfully*/
	 @Test (enabled = false)
	 public void Login() throws Exception {
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).clear();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).sendKeys("9600899109");
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.techbins.niki.beta:id/btnSubmit']")).click();
		 Thread.sleep(12000);
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/editTxtCode']")).click();
		 Thread.sleep(12000);
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/editTxtCode']")).sendKeys("6559");//Given OTP generated at that time. While running please provide the exact OTP received at the time.
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.techbins.niki.beta:id/btn_skip']")).click();
		 Thread.sleep(2000);
		 if(isElementPresent(By.xpath("//android.widget.TextView[@resource-id='com.techbins.niki.beta:id/niki_title_chat']")))
		 {
			 System.out.println("Logged in Successfully");
		 }
		 else
		 {
			 System.out.println("Not executed successfully");
		 }
	 }

	 
	/*Verify if appropriate application name is displayed in the header*/
	 @Test (enabled = false)
	 public void Header_Name() throws Exception {
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).clear();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/edtTxtPhone']")).sendKeys("9600899109");
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.techbins.niki.beta:id/btnSubmit']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/editTxtCode']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.techbins.niki.beta:id/editTxtCode']")).sendKeys("6559");//Given OTP generated at that time. While running please provide the exact OTP received at the time.
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.techbins.niki.beta:id/btn_skip']")).click();
		 Thread.sleep(2000);
		 WebElement Header =  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.techbins.niki.beta:id/niki_title_chat']"));
		 
		 String HeaderName = Header.getText();
		 System.out.println(HeaderName);
		 if(HeaderName.equals("Niki"))
		 {
			 System.out.println("Appropriate header name is displayed");
		 }
		 else
		 {
			 System.out.println("Not executed successfully");
		 }
		
		
	 }
	

private boolean isElementPresent(By by) {
	 try
	 {
		 driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
}
}