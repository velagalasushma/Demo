package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class java {

	public static void main(String[] args) 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\soni\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();
	WebElement element=	driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(element);
		WebElement srcelement=driver.findElement(By.id("draggable"));
		WebElement trgelement=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();

	}

}
