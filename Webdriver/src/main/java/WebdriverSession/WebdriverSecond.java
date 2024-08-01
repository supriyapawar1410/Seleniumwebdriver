package WebdriverSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSecond {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver =new ChromeDriver();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println(driver.getCurrentUrl()); 
		
		WebElement crossPopup= driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
		
		js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", crossPopup);
    
		crossPopup.click();
		
		Thread.sleep(1000);
		
		WebElement Carrentals= driver.findElement(By.id("cars"));
		js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", Carrentals);
		Carrentals.click();
		
		Thread.sleep(1000);
		
		
		WebElement attractions= driver.findElement(By.xpath("//a[@data-decider-header='attractions']"));
        js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", attractions);
        attractions.click();
		
        Thread.sleep(1000);
		
		WebElement Register= driver.findElement(By.linkText("Register"));
		js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", Register);
		Register.click();
		
		WebElement emailAddress= driver.findElement(By.xpath("//input[@type='email']"));
		emailAddress.sendKeys("supp.pawar@gmail.com");

		WebElement submitButton= driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.google.com/");
		
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("amazon");
		googleSearchBox.sendKeys(Keys.ENTER);
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		

	}

}
