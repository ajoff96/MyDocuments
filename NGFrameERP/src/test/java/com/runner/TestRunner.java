package com.runner;

import com.base.BaseClass;
import com.pages.LoginPage;


public class TestRunner extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		LoginPage l;
		l=new LoginPage(d);//parameterized constructor
		//setProperty();
		browerLaunch("firefox");		
		get();
		wait(2000);
		send(l.getUser(), "sylix");//method overloading
		send(l.getpwd(), "admin");
		wait(3000);
		clk(l.getlogin());
		wait(5000);
		clk(l.getlogout());
		wait(5000);
		cls();
	
	}

}





 


