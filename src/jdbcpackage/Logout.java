package jdbcpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Logout {
	
	
	public void logout(WebDriver driver)
	{
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.findElement(By.id("logout")).click();
		
		
	}
}
