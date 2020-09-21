package Zestiot;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator1
{
	public static void main(String[] args) throws Exception 
	   {
			    AndroidDriver driver;
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("BROWSER_NAME", "");
				capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "8.1.0"); 
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus 5X");
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			    capabilities.setCapability("appPackage","com.google.android.calculator");
				capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); 
			    URL u=new URL("http://0.0.0.0:4723/wd/hub");
			    driver = new AndroidDriver(u,capabilities);
			 
			    WebElement e1=driver.findElement(By.name("2"));
			    e1.click();
			    WebElement e2=driver.findElement(By.name("+"));
			    e2.click();
			    WebElement e3=driver.findElement(By.name("4"));
			    e3.click();
			    WebElement e4=driver.findElement(By.name("="));
			    e3.click();
			   WebElement results=driver.findElement(By.tagName("EditText"));
			   assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";
			   driver.close();
			}
	
			

	}


