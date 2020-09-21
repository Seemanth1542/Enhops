package Zestiot;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Xpath
{

public static void main(String[] args) throws Exception 
{
	
	AndroidDriver driver = null ;
   DesiredCapabilities dc=new DesiredCapabilities();
   dc.setCapability(CapabilityType.BROWSER_NAME, "");
   dc.setCapability("DeviceName", "Nexus 5X");
   dc.setCapability("PlatformName", "android");
   dc.setCapability("PlatformVersion", "8.1.0");
   dc.setCapability("AppPackage", "com.google.android.calculator");
   dc.setCapability("AppActivity", "com.android.calculator2.Calculator");
  // Runtime.getRuntime().exec("cmd.exe/c start cmd/k\"appium -a 0.0.0.0:4723 -p\"");
	 URL u=new URL("http://127.0.0.0:4723/wd/hub");
  /* Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st input value");
	String x=sc.nextLine();
	System.out.println("enter the second value");
	String y=sc.nextLine();
	System.out.println("enter the output");
	String z=sc.nextLine();
  */
   driver.findElement(By.xpath("1")).click();
	

	while(2>1)
	try
	{
		driver= new AndroidDriver(u,dc);
		break;
			}
	catch(Exception ex)
	{
		
	}
	try
	{
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='No result'")));
		//driver.findElement(By.xpath("//*[@class='android.widget.TextView'"));
	}
	catch(Exception e)
	{
		
	}

	
	
}

}
