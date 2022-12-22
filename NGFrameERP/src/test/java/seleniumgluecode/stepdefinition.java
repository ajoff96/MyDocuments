package seleniumgluecode;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.CucumberRunner.run;
import com.base.BaseClass;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jxl.Sheet;
import jxl.Workbook;

public class stepdefinition extends BaseClass {

	public static WebDriver d = run.d; // object to object declaration
	LoginPage l = new LoginPage(d);

	@Given("^user is on login page$")
	public void user_is_on_homepage() throws InterruptedException {

		l = new LoginPage(d);// object created//null
		get();
		wait(3000);

	}

	@When("^user enters username and Password$")
	public void user_navigates_to_Login_Page() throws Throwable {

		
		  // Base Class with POM & Data Driven FileInputStream f = new
		/*  FileInputStream("C:\\Users\\HP\\Desktop\\ddp.xls"); 
		  Workbook b = Workbook.getWorkbook(f); 
		  Sheet s = b.getSheet(1); 
		  int rowcount = s.getRows();
		  for (int i = 1; i <rowcount; i++){ 
			  String usern = s.getCell(0,	i).getContents(); 
		      String passn = s.getCell(1, i).getContents();
		  }
		  
		  send(l.getUser(), usern); 
		  send(l.getpwd(), passn); 
		  wait(3000);
		  clk(l.getlogin()); 
		  wait(5000); 
		  alrt("accept"); 
		  send(l.getUser(), usern);
		  send(l.getpwd(), passn);
		  clk(l.getlogout()); 
		  wait(2000);*/
		 
		String xlpath = "C:\\Users\\Admin\\Desktop\\poixlmix.xlsx";
		File src = new File(xlpath);

		FileInputStream finput = new FileInputStream(src);
		
		//FileInputStream("C:\\Users\\Admin\\Desktop\\poixlmix.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.getSheetAt(0);
		Cell cell;

		for (int i = 1; i < 4; i++) {

			cell = sheet.getRow(i).getCell(0);

			String usern = cell.getStringCellValue();

			send(l.getUser(), usern);

			cell = sheet.getRow(i).getCell(1);

			String passw = cell.getStringCellValue();

			send(l.getpwd(), passw);

			clk(l.getlogin());
			wait(5000);
			clk(l.getlogout());

		}
	}

	private void FileInputStream(String string) {
		// TODO Auto-generated method stub

	}

	@Then("^success Login and Home Page display$")
	public void success_login_and_home_Page_displayed() throws Throwable {

		webdrivermethods("title");
		wait(10000);
		// clk(l.getlogout());
		cls();

	}

}
