package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.BaseClass;

public class LoginPage extends BaseClass{

	@Test
	public void verifyLogin() throws IOException, InterruptedException
	{
		driverinitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(2000);
		
		WebElement Username=driver.findElement(By.id("username"));
		Username.click();
		Thread.sleep(2000);
		
		Username.sendKeys("rushikeshulhamale99@gmail.com");
		Thread.sleep(1000);
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.click();
		Thread.sleep(2000);
		
		Password.sendKeys("Rush@1234");
		Thread.sleep(1000);
		
		WebElement Login=driver.findElement(By.id("Login"));
		Login.click();
		Thread.sleep(2000);
		
		driver.quit();
		System.out.println("Done");
		
	}
	
}
