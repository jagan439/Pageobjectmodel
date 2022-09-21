package org.testcases;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.support.PageFactory;
import org.pages.Loginpageobjects;
import org.testng.annotations.Test;

public class LoginTest extends Basemethods {

	@Test(dataProvider = "readdata")
	public void loginEx(String [] data) throws InterruptedException {
		
		PageFactory.initElements(driver, Loginpageobjects.class);
		
		Loginpageobjects.username.sendKeys(data[0]);
		Loginpageobjects.password.sendKeys(data[1]);
		Loginpageobjects.submit.click();
		Thread.sleep(5000);
		
	}
	
	
}
