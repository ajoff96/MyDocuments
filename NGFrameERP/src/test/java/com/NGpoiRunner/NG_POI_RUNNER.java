package com.NGpoiRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class NG_POI_RUNNER extends BaseClass {

	LoginPage l;// encapsulation
	
	String xlpath = "C:\\Users\\HP\\Desktop\\poixlmix.xlsx"; 

	@Test(priority = 2)
	public void vrun() throws InterruptedException, IOException {
		File src = new File(xlpath);

		FileInputStream finput = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(finput);

		XSSFSheet sheet = workbook.getSheetAt(0);
		Cell cell;

		for (int i = 1; i < 4; i++) {

			cell = sheet.getRow(i).getCell(0);

			String usern = cell.getStringCellValue();

			send(l.getUser(), usern);

			// WebElement user = d.findElement(By.id("txt_unam"));
			// user.sendKeys(cell.getStringCellValue());

			cell = sheet.getRow(i).getCell(1);

			String passw = cell.getStringCellValue();

			send(l.getpwd(), passw);

			// WebElement pass = d.findElement(By.id("txt_pass"));
			// pass.sendKeys(cell.getStringCellValue());

			clk(l.getlogin());
			wait(5000);
			clk(l.getlogout());

		}
	}

	@Test(priority = 3)
	public void inrun() throws InterruptedException, IOException {

		File src = new File(xlpath);

		FileInputStream finput = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(finput);

		XSSFSheet sheet = workbook.getSheetAt(0);
		Cell cell;

		for (int i = 4; i < 6; i++) {

			cell = sheet.getRow(i).getCell(0);

			String usern = cell.getStringCellValue();

			send(l.getUser(), usern);

			// WebElement user = d.findElement(By.id("txt_unam"));
			// user.sendKeys(cell.getStringCellValue());

			cell = sheet.getRow(i).getCell(1);

			String passw = cell.getStringCellValue();

			send(l.getpwd(), passw);

			// WebElement pass = d.findElement(By.id("txt_pass"));
			// pass.sendKeys(cell.getStringCellValue());

			clk(l.getlogin());
			wait(5000);
			alrt("accept");
		}

	}

	@Test
	public void illrun() throws InterruptedException, IOException {

		File src = new File(xlpath);

		FileInputStream finput = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(finput);

		XSSFSheet sheet = workbook.getSheetAt(0);
		Cell cell;

		for (int i = 6; i < 9; i++) {

			cell = sheet.getRow(i).getCell(0);

			String usern = cell.getStringCellValue();

			send(l.getUser(), usern);

			// WebElement user = d.findElement(By.id("txt_unam"));
			// user.sendKeys(cell.getStringCellValue());

			cell = sheet.getRow(i).getCell(1);

			String passw = cell.getStringCellValue();

			send(l.getpwd(), passw);

			// WebElement pass = d.findElement(By.id("txt_pass"));
			// pass.sendKeys(cell.getStringCellValue());

			clk(l.getlogin());
			wait(5000);
			alrt("accept");
		}

	}

	@Test
	public void nrun() throws InterruptedException, IOException {

		File src = new File(xlpath);

		FileInputStream finput = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(finput);

		XSSFSheet sheet = workbook.getSheetAt(0);
		Cell cell;

		for (int i = 9; i < 12; i++) {

			cell = sheet.getRow(i).getCell(0);

			String usern = cell.getStringCellValue();

			send(l.getUser(), usern);

			// WebElement user = d.findElement(By.id("txt_unam"));
			// user.sendKeys(cell.getStringCellValue());

			cell = sheet.getRow(i).getCell(1);

			String passw = cell.getStringCellValue();

			send(l.getpwd(), passw);

			// WebElement pass = d.findElement(By.id("txt_pass"));
			// pass.sendKeys(cell.getStringCellValue());

			clk(l.getlogin());
			wait(3000);
			alrt("accept");
		}

	}

	@BeforeClass
	public void Before() throws InterruptedException {

		setProperty();
		l = new LoginPage(d);// parameterized constructor
		//browerLaunch("firefox");
		get();
		wait(2000);

	}

	@AfterClass
	public void After() {
		cls();
	}

}
