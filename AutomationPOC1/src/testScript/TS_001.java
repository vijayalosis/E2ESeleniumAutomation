package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_001 {
	
	@Test
	public void testScript() {
	System.out.println("First Script");
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");	
	driver.manage().window().maximize();
	driver.findElementById("email").sendKeys("hello");
	driver.findElementById("pass").sendKeys("hello");
	driver.quit();
	}
}
