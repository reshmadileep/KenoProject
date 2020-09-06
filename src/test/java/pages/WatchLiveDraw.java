package pages;

import org.openqa.selenium.By;

public class WatchLiveDraw {
	
	public void watchLiveDrawButton() {			
			
			
			SetUp.driver.findElement(By.xpath("(//*[@class=\"btn btn-primary btn-watch-keno-nav\"])[2]")).click();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
				
			if(SetUp.driver.findElement(By.xpath("//*[@class=\"btn btn-how-to-win\"]")).isEnabled()==true) {
				
				System.out.println("Watch Live Draw page launched successfully");	
				
			}
			else  {
				
				System.out.println("Error in launching Watch Live Draw page");	
				
			}


}
}
