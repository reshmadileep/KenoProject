
	
	package pages;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;   
    import org.testng.annotations.Test;

	public class SetUp {

		public static WebDriver driver;
		String baseUrl="https://www.keno.com.au/";
		
	
		public void openBrowser() {
		
		String projectPath = System.getProperty("user.dir");   
		    //setting path of chrome driver
		System.setProperty("webdriver.chrome.driver",projectPath + "\\src\\test\\resources\\drivers\\chromedriver.exe");		
			
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
				
		@Test(priority=1)
		public void launchUrl() throws InterruptedException {
			
		driver.get(baseUrl);	
		Thread.sleep(3000);
		if(driver.getTitle().equals("Visit The Official Keno Website | Keno")) 	
		{ 
			System.out.println("Home Page launched successfully");	
			
		}
		else 
		{
			System.out.println("Error in launching Home Page");			
		
		}
		
		//selecting state
			driver.findElement(By.xpath("(//*[@type=\"button\"][@data-id=\"select-state-button\"])[2]")).click();
		    driver.findElement(By.xpath("(//*[@data-id=\"VIC\"])[2]")).click();
		    
		    Thread.sleep(3000);	  
			
		}	
		
	}



