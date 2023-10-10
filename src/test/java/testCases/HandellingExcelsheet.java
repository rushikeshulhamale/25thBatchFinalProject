package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandellingExcelsheet {

	@Test
	public void HandellingExcelsheet() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\rushi\\OneDrive\\Desktop\\Rushikesh.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		
		XSSFSheet Sheet=workbook.getSheetAt(0);
		
        XSSFRow row=Sheet.getRow(0);
		
		XSSFCell column1=row.getCell(0);  //for getting cell position/control at (0,0)
		
		XSSFCell column2=row.getCell(1);  //for getting cell position/control at (0,1)
		
		System.out.println(Sheet.getRow(0).getCell(0));
		
		System.out.println(Sheet.getRow(0).getCell(1));
		
		WebDriver d=new ChromeDriver();
		d.get("https://login.salesforce.com/?locale=in");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Username=d.findElement(By.xpath("//input[@id='username']"));
		Username.click();
		Thread.sleep(1000);
		
		Username.sendKeys(column1.getStringCellValue());
		Thread.sleep(2000);
		 
		WebElement password= d.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys(column2.getStringCellValue());
		 
		Thread.sleep(2000);
		
		//clicking on login button
		d.findElement(By.xpath("//input[@id='Login']")).click();
		System.out.println("Invalid Username and Password");
		Thread.sleep(2000); 
		
		d.close();
		
	}
	
}
