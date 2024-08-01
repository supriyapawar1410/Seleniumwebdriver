package WebdriverSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInWD {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver =new ChromeDriver();
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
			driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
			driver.switchTo().frame("globalSqa");
			
			
			
			WebElement trainings= driver.findElement(By.xpath("//a[@title='Trainings']"));
			
			//js.executeScript("arguments[0].scrollIntoView();", trainings);
			
			js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", trainings);
			trainings.click();
			
			
			driver.switchTo().defaultContent();
			
			WebElement openwindow= driver.findElement(By.id("Open New Window"));
			openwindow.click();
			
		
			Thread.sleep(2000);
			
			driver.close();

	}

}
