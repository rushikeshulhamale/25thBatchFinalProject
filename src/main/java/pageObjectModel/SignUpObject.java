package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpObject {

	public static WebDriver driver;
	
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	
	private By LastName=By.xpath("//input[@name='UserLastName']");
	
	private By EmailId=By.xpath("//input[@name='UserEmail']");
	
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	
	private By Company=By.xpath("//input[@name='CompanyName']");
	
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	
	private By PhoneNo=By.xpath("//input[@name='UserPhone']");
	
	private By Checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	
	public SignUpObject(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	public WebElement EnterFirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement EnterLastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement EnterEmailId()
	{
		return driver.findElement(EmailId);
	}
	
	public WebElement clickJobTitle()
	{
		return driver.findElement(JobTitle);
	}
	
	public WebElement EnterCompanyName()
	{
		return driver.findElement(Company);
	}
	
	public WebElement clickEmployees()
	{
		return driver.findElement(Employees);
	}
	
	public WebElement EnterPhoneNo()
	{
		return driver.findElement(PhoneNo);
	}
	
	public WebElement ClickCheckBox()
	{
		return driver.findElement(Checkbox);
	}
	
	public WebElement SelectCountry()
	{
		return driver.findElement(Country);
	}
	
}
