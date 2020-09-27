package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Config {
	public String hostName = "https://github.com";
	
	public static WebDriver driver;
	
public Config() {
	System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(hostName);
	
}

public static void assertEqual(String actual, String expected) {
	try {
		Assert.assertEquals(actual, expected);
		System.out.println("Pass: " + actual + " is matching " + expected  );
	}
	catch(Exception e) {
		System.out.println("Fail: " + actual + " is not matching " + expected );
	}
}

public static void assertTrue(boolean b, String  msg) {
	try {
		Assert.assertTrue(b);
		System.out.println("Pass :" + msg);
	}
	catch(Exception e) {
		System.out.println("Fail: " + msg);
	}
}
}