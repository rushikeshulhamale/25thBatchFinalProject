package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {

	@Test
	public void M1() throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		System.out.println("Launched the url succesfully");
		Thread.sleep(2000);
		d.close();
	}
}
