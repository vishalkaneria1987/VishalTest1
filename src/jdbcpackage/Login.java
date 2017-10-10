package jdbcpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Login {
	
	         
	
	public static void main(String[] args) {
		
		
        // Chrome Browser 
        System.setProperty("webdriver.chrome.driver", "C://Software//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();   
        // Navigate to URL
        driver.get("https://assistwebtest.azurewebsites.net/Account/Login?ReturnUrl=%2f");
        // Maximize the window.
        //driver.manage().window().maximize(); ////
        // Enter UserName
        driver.findElement(By.id("UserName")).sendKeys("admin");
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("admin-11");
        // Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        // Click on 'Sign In' button
        driver.findElement(By.className("btn")).click(); 
        
        
        Dashboard dashboardobj = new Dashboard();
        dashboardobj.dashboard(driver);
        
        Logout logoutobj = new Logout();
        logoutobj.logout(driver);
        
        /*.
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Select Drop-down
    	driver.findElement(By.className("select2-chosen")).click();
		//Select text "Assist Test from drop down
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Submit button
		//driver.findElement(By.xpath("//input[@value='Choose Instance' and @type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.className("btn")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("logout")).click();*/
	}
}
	    