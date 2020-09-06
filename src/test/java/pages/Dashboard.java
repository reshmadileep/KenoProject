package pages;

import org.openqa.selenium.By;

import pages.SetUp;

public class Dashboard {


	public void verifyDashboardLogo() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
 
		
		if (SetUp.driver.findElement(By.xpath("//*[@data-id=\"keno-logo\"]")).isDisplayed()==true) {
		
		System.out.println("Dashboard launched successfully");

	}
		else {
			System.out.println("Error in launching Dashboard");
			
		}
 
}
}