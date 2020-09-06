package pages;

import org.openqa.selenium.By;

public class CheckResults {	
		
	public void checkCheckResultsButton() {
		
	SetUp.driver.findElement(By.xpath("//*[@data-id=\"check-results-navbar\"]")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}		
		
	if(SetUp.driver.findElement(By.xpath("(//*[@class=\"heads\"])[1]")).isEnabled()==true) {
		
		System.out.println("Check Results page launched successfully");	
		
	}
	else  {
		
		System.out.println("Error in launching Check Results page");	
		
	}

 }
	
	public void loadResults() {
		
		//date can be parametrized using excel.Hard coded in this case here.
		SetUp.driver.findElement(By.xpath("//*[@data-id=\"check-results-date-input\"]")).clear();
		SetUp.driver.findElement(By.xpath("//*[@data-id=\"check-results-date-input\"]")).sendKeys("06-09-2020");
		
		SetUp.driver.findElement(By.xpath("//*[@data-id=\"check-results-header\"]")).click();
		
		SetUp.driver.findElement(By.xpath("//*[@id=\"checkResults\"]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
			

				if(SetUp.driver.findElement(By.xpath("(//*[@class=\"heads\"])[1]")).isDisplayed()) 	
				{ 
					System.out.println("Results displayed successfully");	
					
				}
				else 
				{
					System.out.println("Error in loading Results");			
				
				}
			
				
	}
	
	
}