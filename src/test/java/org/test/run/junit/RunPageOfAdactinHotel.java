package org.test.run.junit;

import org.openqa.selenium.WebDriver;

public class RunPageOfAdactinHotel {
public static void main(String[] args) {
	LibGlobal base = new LibGlobal();
	WebDriver driver = LibGlobal.getDriver();
	base.loadUrl("https://adactin.com/HotelApp/");
	
	//LoginPage
	LoginPage page1 = new LoginPage();
	page1.getTxtUserName().sendKeys("vinothparamas");
	page1.getTxtPassword().sendKeys("Welcome@12");
	page1.getBtnClk().click();
}   
}
