package programs;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File temp=screenshot.getScreenshotAs(OutputType.FILE);
		File actfile=new File("d://screenshot.jpg");
	    FileUtils.copyFile(temp, actfile);
		

	}

}
