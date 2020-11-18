package myWorkspace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Risha Diary\\eclipse-workspace\\libs\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
	}

}
