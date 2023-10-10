package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParticularScreenshot{

  @Test
  public void capturingScreenshot() throws InterruptedException, IOException
  {
	WebDriver driver=new ChromeDriver();
			
	driver.get("https://login.salesforce.com/?locale=in");
			
	driver.manage().window().maximize();
			
	Thread.sleep(2000);
 
	 TakesScreenshot scrShot=(TakesScreenshot)driver;
	
	WebElement Psection=driver.findElement(By.xpath("//*[@id=\"content\"]"));
			
    File source=Psection.getScreenshotAs(OutputType.FILE);
	
	File Destination=new File("C:\\Users\\rushi\\OneDrive\\Desktop\\ScreenShots\\particular_screenshot.png");
			
	FileUtils.copyFile(source,Destination);
			
	System.out.println("Done....particular screenshot Captured");
			
	driver.quit();
			
  }
	
}
