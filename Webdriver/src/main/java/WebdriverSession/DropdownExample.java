package WebdriverSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver =new ChromeDriver();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	
		
		WebElement SelectCountry= driver.findElement(By.name("country"));
		
		js.executeScript("arguments[0].scrollIntoView();", SelectCountry);
		
		Select country= new Select(SelectCountry);
		
		country.selectByIndex(3);
		

	    Thread.sleep(2000);
		
		country.selectByValue("ARUBA");
		
				

		//js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", Country);
		
		//Country.click();
		
		
		
       Thread.sleep(2000);
        
        driver.close();
        

	}

}
