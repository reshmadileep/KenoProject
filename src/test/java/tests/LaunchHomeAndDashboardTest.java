package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.SetUp;

public class LaunchHomeAndDashboardTest {
	
	public static WebDriver driver;	

	@Test(priority=0)
	public void launchHomePageAndDashboard() throws InterruptedException {
	
		SetUp setUp=new SetUp();
		Dashboard dashBoard=new Dashboard();
		setUp.openBrowser();
		setUp.launchUrl();
		dashBoard.verifyDashboardLogo();	
	
    }
	
}
