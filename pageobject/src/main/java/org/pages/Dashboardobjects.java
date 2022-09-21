package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardobjects {

	@FindBy(linkText="Mini Statement")
	public static WebElement ministatement;
	
	@FindBy(name="accountno")
	public static WebElement Select;

	@FindBy(name="AccSubmit")	
	public static WebElement submit;
}
