package tests;

import org.testng.annotations.Test;

import pages.Games;

public class CheckGamesTest {
	
	@Test(priority=1)
	public void checkGamesDropdown() throws InterruptedException {
		
		Games games=new Games();
		games.checkGamesDropDown();
		
	}

}
