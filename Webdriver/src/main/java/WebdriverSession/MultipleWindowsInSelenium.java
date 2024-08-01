package WebdriverSession;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsInSelenium {

	public static void main(String[] args) throws InterruptedException {


WebDriver driver =new ChromeDriver();
		
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(3000);
		
		WebElement newtab= driver.findElement(By.id("tabButton"));
		
		//js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", newtab);
		
		
		newtab.click();
		newtab.click();
		newtab.click();
		
		String parenthandle= driver.getWindowHandle();
		Set<String> allhandles= driver.getWindowHandles();
		
		System.out.println(parenthandle);
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
