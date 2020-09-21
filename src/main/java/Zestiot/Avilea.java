package Zestiot;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Avilea 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\git\\ZestIOTAutomation\\src\\main\\resources\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://test.sandbox.avileap.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='login']")).sendKeys("igi@zestiot.io");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("zestiot123");
		driver.findElement(By.xpath("(//*[@class='mat-button-wrapper'])[3]")).click();
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='mat-tab-label-content'])[3]")));
		driver.findElement(By.xpath("(//*[@class='mat-tab-label-content'])[3]")).click();
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("//*[@class='mat-icon notranslate mat-primary material-icons']")).click();
	    Thread.sleep(3000);
	    
	    for (int j = 0; j < 30; j++) {
	    	 List<WebElement> lst_Flight= driver.findElements(By.xpath("//div[@class='flightno-col']"));
	   	  for (int i = 0; i < lst_Flight.size(); i++) {
	   		  JavascriptExecutor js = (JavascriptExecutor)driver;
	   		js.executeScript("window.scrollBy(0,1000)");
	   		 // js.executeScript("arguments[0].scrollIntoView();", lst_Flight.get(i));
	   		//	Thread.sleep(2000);
	   			  		
	   	}
	   	  
		}
	 
	    
	   /* JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scroll(0,1000)");
	    Thread.sleep(15000);
	   jse.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(15000);
	   jse.executeScript("window.scrollTo(0,1000)");
		WebElement e=driver.findElement(By.tagName("mat-card"));
		List<WebElement> flights = driver.findElements(By.tagName("mat-card"));
		System.out.println(flights.size());
		//String e1=driver.findElement(By.xpath("//*[text()='6E 5061']")).getText();
		//System.out.println(e1);		
*/
	}

}
