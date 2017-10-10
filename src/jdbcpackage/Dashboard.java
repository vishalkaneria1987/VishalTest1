package jdbcpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class Dashboard {
	 
	public void dashboard(WebDriver driver)
	{ 
		
		//WebDriver driver = new ChromeDriver();
		driver.findElement(By.className("btn")).click(); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.className("select2-chosen")).click();
		//Select text "Assist Test from drop down
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Submit button
		//driver.findElement(By.xpath("//input[@value='Choose Instance' and @type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.className("btn")).click();
		
		 
	}
}
