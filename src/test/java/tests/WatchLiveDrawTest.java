package tests;

import org.testng.annotations.Test;

import pages.WatchLiveDraw;

public class WatchLiveDrawTest {
	
	//Similarly FAQ's Venue and all the other tabs can be tested if loaded successfully or not
	@Test(priority=4)
	public void checkWatchLiveDraw() {	
		
	 WatchLiveDraw watchLiveDraw= new WatchLiveDraw();
	 watchLiveDraw.watchLiveDrawButton();
		
		
	}

}
