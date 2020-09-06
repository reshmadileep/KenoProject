package pages;

import org.openqa.selenium.By;

public class HowToWin {
	
	
	public void howToWinButton() {
		
		SetUp.driver.findElement(By.xpath("//*[@data-id=\"how-to-win-navbar\"]")).click();
				
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}				
		
		
		if(SetUp.driver.findElement(By.xpath("//*[@ng-animate-children=\"exp\"]")).isDisplayed()==true) {
			
			System.out.println("How To Win -Game Guide launched successfully");	
			
		}
		else  {
			
			System.out.println("Error in loading Game Guide page");	
			
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}				
		SetUp.driver.findElement(By.xpath("//*[@data-id=\"how-to-win-close-btn\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	

}
