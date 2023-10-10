package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjectModel.SignUpObject;
import resources.BaseClass;

public class VerifySignUp extends BaseClass {

	@Test
	
	public void signUp() throws IOException, InterruptedException
	{
		driverinitialize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		Thread.sleep(1000);
		
		SignUpObject obj=new SignUpObject(driver);
				
		obj.EnterFirstName().sendKeys("Rushikesh");
		Thread.sleep(1000);
		
		obj.EnterLastName().sendKeys("Ulhamale");
		Thread.sleep(1000);
		
		obj.EnterEmailId().sendKeys("rushikeshulhamale99@gmail.com");
		Thread.sleep(1000);
		
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		obj.clickJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		obj.EnterCompanyName().sendKeys("Accenture");
		Thread.sleep(2000);
		
		obj.clickEmployees().sendKeys(Keys.ARROW_DOWN);
		obj.clickEmployees().sendKeys(Keys.ARROW_DOWN);
		obj.clickEmployees().sendKeys(Keys.ARROW_DOWN);
		obj.clickEmployees().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		obj.EnterPhoneNo().sendKeys("9604572975");
		Thread.sleep(2000);
		
		obj.ClickCheckBox().click();
		Thread.sleep(2000);
		
		obj.SelectCountry().sendKeys(Keys.ARROW_DOWN);
		obj.SelectCountry().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		System.out.println("SignUp Page filled Succesfully");
		driver.quit();
	}
}
