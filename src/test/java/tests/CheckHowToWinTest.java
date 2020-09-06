package tests;

import org.testng.annotations.Test;

import pages.HowToWin;

public class CheckHowToWinTest {


@Test(priority=3)	//Similarly all the links can be checked if loaded or not	
public void checkHowToWinPage() {
	
	HowToWin howToWin = new HowToWin();
	howToWin.howToWinButton();	
	
}
}
