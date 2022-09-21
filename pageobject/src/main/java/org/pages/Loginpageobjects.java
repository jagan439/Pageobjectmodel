package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobjects {

	@FindBy(name="uid")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(name="btnLogin")	
	public static WebElement submit;
}
