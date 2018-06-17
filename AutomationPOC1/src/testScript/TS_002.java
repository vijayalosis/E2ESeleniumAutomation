package testScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_002 {
	
	@Test
	public void testScript() {
	System.out.println("First Script");
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");	
	driver.findElementById("email").sendKeys("two");
	driver.findElementById("pass").sendKeys("two");
	driver.quit();
	}
}
