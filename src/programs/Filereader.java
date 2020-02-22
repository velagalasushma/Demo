package programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.http.message.BufferedHeader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filereader {

	public static void main(String[] args) throws IOException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
	    FileReader fi=new FileReader("D:\\tempfile.txt");
	    BufferedReader br=new BufferedReader(fi);
	    String actcontent=br.readLine();
	    String expcontent=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
	    if(expcontent.contains(actcontent))
	    {
	    	System.out.println("Test pass");
	    }
	    else
	    {
	    	System.out.println("Test Fail");
	    }
	    
	    
	    

	}

}
