package com.CucumberRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/Features/TestSteps.feature",
	glue= "seleniumgluecode", dryRun =false, monochrome=true, plugin= {"pretty","html:target/Destination/Output3.html"}
	)

	public  class run {
		public static WebDriver d;

		@BeforeClass
		public static void setup() {
			//d=BaseClass.browerLaunch("firefox");//Static concept-method calling by class reference
		    d=BaseClass.browerLaunch("chrome");
		}
		@AfterClass
		public static void tearDown() {
			
			//BaseClass.cls();
		}
	
	}

	




