package org.testcases;

import org.commonfunctions.Basemethods;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.pages.Dashboardobjects;
import org.pages.Loginpageobjects;
import org.testng.annotations.Test;

public class DAshboardTestcase extends Basemethods {

	@Test(dataProvider = "readdata")
	public void dashEx(String [] data) throws InterruptedException {
		
		PageFactory.initElements(driver, Loginpageobjects.class);
		
		Loginpageobjects.username.sendKeys(data[0]);
		Loginpageobjects.password.sendKeys(data[1]);
		Loginpageobjects.submit.click();
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, Dashboardobjects.class);
		Dashboardobjects.ministatement.click();
		Select se = new Select(Dashboardobjects.Select);
		se.selectByVisibleText("3309");	
		Dashboardobjects.submit.click();
		Thread.sleep(4000);
		
		
		
		
	}	
}
