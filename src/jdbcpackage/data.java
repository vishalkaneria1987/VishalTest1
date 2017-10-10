package jdbcpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class data {

	
		   public data (WebDriver driver)
	    {
			PageFactory.initElements(driver,this);
	    }
		   
	        //Auto-implemented property
	      // public static WebDriver driver { get; set; }
	       // public static WebDriverWait wait { get: set; }
	    }
	

