package WebdriverSession;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
	
		//WebDriver driver= new ChromeDriver();
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	    driver.get("https://www.booking.com/");
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().window().setSize(new Dimension(230,300));
	    String url1= driver.getCurrentUrl();
	    
	   // if(url1.contains("booking"))
	   // {
	   // 	System.out.println("True");
	  //  }
	  //  else
	  //  {
	  //  	System.out.println("False");
	  //  }
	    
	
	    
	    WebElement Registerbutton= driver.findElement(By.linkText("Register"));
	    
	    Registerbutton.click();
	 
	   
	    
	    
		
	    
		System.out.println(driver.getTitle());  
		System.out.println(driver.getCurrentUrl()); 
		
		Thread.sleep(6000);
		
		
		
		driver.close();
		
		

	}

}
