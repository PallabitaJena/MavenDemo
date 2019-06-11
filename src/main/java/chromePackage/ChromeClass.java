package chromePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeClass 
{
	public static WebDriver driver;
	@Test(priority=1)
	public void intialization()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\AzureAutomation\\chromedriver 2.33.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	}

	@Test(priority=1)
	public void methode()
	{
		System.out.println("url launched");
		Assert.assertEquals(false, true);
	}
}
