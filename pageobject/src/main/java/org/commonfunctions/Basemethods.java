package org.commonfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basemethods {
	
	public WebDriver driver;

	@BeforeMethod
	public void startup() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void teardown() {

		driver.quit();
		
	}
	

}
