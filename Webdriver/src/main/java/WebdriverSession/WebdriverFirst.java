package WebdriverSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverFirst {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
		
        JavascriptExecutor js= (JavascriptExecutor)driver;
        
        driver.get("https://www.booking.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        
        try {
        	
       
        WebElement crossPopup= driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
        
        if(crossPopup.isDisplayed())
        {
        	js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", crossPopup);
            crossPopup.click();
        }
        }catch(NoSuchElementException ex)
        {
        	System.out.println("Exception Occured :" +ex.getMessage());
        }
        
		
        WebElement attractions= driver.findElement(By.id("attractions"));
        js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", attractions);
        attractions.click();
        
        
        WebElement customerSupport= driver.findElement(By.xpath("//a[@aria-label='Customer support']"));
        js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", customerSupport);
        customerSupport.click();
        
        
        
        
        Thread.sleep(2000);
        
        driver.close();
        
     

	}

}
