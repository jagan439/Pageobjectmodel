package org.commonfunctions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

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
	
	@DataProvider
	public static String[][] readdata() {
		XSSFWorkbook  wbook = null;
		try {
			wbook = new XSSFWorkbook("C:\\Users\\Jaganath\\git\\Pageobjectmodel\\pageobject\\data\\down.xlsx");
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String [][] data = new String[lastRowNum][lastCellNum]; 
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
				data[i-1][j]=value;
			}
		}

		try {
			wbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	

}
