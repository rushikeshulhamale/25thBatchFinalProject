package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;

public class VerifyLogin extends BaseClass{

	@Test
	
	public void verifyLogin() throws IOException, InterruptedException
	{
		driverinitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		FileInputStream fs=new FileInputStream("C:\\Users\\rushi\\OneDrive\\Desktop\\Rushikesh.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		
        XSSFSheet Sheet=workbook.getSheetAt(0);
		
        XSSFRow row=Sheet.getRow(0);
		
		XSSFCell username=row.getCell(0);  //for getting cell position/control at (0,0)
		
		XSSFCell password=row.getCell(1);  //for getting cell position/control at (0,1)
		
		System.out.println(Sheet.getRow(0).getCell(0));
		
		System.out.println(Sheet.getRow(0).getCell(1));
		
		obj.enterUsername().sendKeys(username.getStringCellValue());
		Thread.sleep(2000);
		
		obj.enterPassword().sendKeys(password.getStringCellValue());
		Thread.sleep(2000);
		
		obj.clickOnLogin().click();
		Thread.sleep(2000);
		
		obj.clickOnTryForFree().click();
		Thread.sleep(2000);
		
		System.out.println("From Excel sheet data is retrived");
		Thread.sleep(1000);
		driver.quit();
	}
}
