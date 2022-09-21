package org.testcases;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.support.PageFactory;
import org.pages.Loginpageobjects;
import org.testng.annotations.Test;

public class Logintest extends Basemethods {

	@Test
	public void loginEx() throws InterruptedException {
		
		PageFactory.initElements(driver, Loginpageobjects.class);
		
		Loginpageobjects.username.sendKeys("1303");
		Loginpageobjects.password.sendKeys("Guru99");
		Loginpageobjects.submit.click();
		Thread.sleep(5000);
		
	}
	
	
}
