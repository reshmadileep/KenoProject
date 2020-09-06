package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Games {
	
	
	//Checking if Keno Classic page is loaded.This can be extended to other pages	
	public void checkGamesDropDown() throws InterruptedException {
		
		SetUp.driver.findElement(By.xpath("//*[@class=\"btn-group-text\"][text()=\"Games\"]")).click();
		Thread.sleep(3000);
		
		SetUp.driver.findElement(By.xpath("//*[@data-id=\"keno-classic\"]")).click();
		
		
		
		if(SetUp.driver.findElement(By.xpath("(//*[@class=\"game-page-image\"])[1]")).isDisplayed()) 	
		{ 
			System.out.println("Keno Classic launched successfully");	
			
		}
		else 
		{
			System.out.println("Error in launching Keno Classic");			
		
		}
		
		
		
	}

}
