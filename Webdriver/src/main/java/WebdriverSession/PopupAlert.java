package WebdriverSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement customerid= driver.findElement(By.name("cusid"));
		
		customerid.sendKeys("123456");
		
		customerid.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		Alert alert= driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		
		alert.accept();
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
