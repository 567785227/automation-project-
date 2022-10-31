 package browser;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Browser {
	public static WebDriver driver;
	public static WebDriver setDriver() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which browser would you like to execute the script on? \r\n 1. Google Chrome \r\n 2. Mozilla Firefox");
		int browserChoice = scan.nextInt();
		scan.close();
		
		
		if (browserChoice == 1) {
			driver = setChromeDriver();
		} else if (browserChoice == 2) {
			driver = setFirefoxDriver();
		} 
		else {
			System.out.println("invalid data");
		}
		return driver;
	}
	public static WebDriver setChromeDriver() {
		String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		 driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver setFirefoxDriver() {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--no-sandbox");
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setBinary(firefoxBinary);
		driver = new FirefoxDriver(firefoxOptions);
		return driver;
	}
	

	public static void getUrl() throws InterruptedException {
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
	}
	public static void closeBrowser() {
		driver.quit();
	}
}

