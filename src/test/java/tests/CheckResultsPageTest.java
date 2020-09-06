package tests;

import org.testng.annotations.Test;

import pages.CheckResults;

public class CheckResultsPageTest {

	
	@Test(priority=2)
	public void checkResultsPageLoad() {
		
		CheckResults checkResults=new CheckResults();
		
		checkResults.checkCheckResultsButton();
		checkResults.loadResults();
		
	}
	
	
}
