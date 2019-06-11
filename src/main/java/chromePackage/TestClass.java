package chromePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\AzureAutomation\\chromedriver 2.33.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Assert.assertEquals(true, false);

	}

}
