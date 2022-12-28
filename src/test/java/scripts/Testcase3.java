package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pompages.Selenium;
import pompages.Skillrary;
import pompages.WishList;

public class Testcase3 extends StepGroup
{
	@Test
	public void tc3() throws IOException, InterruptedException 
	{
	Skillrary s=new Skillrary(driver);
	s.searchTextBox(pdata.getPropertydata("coursename"));
	s.searchButton();
	
	Selenium se=new Selenium(driver);
	se.corejavaselenium();
	
	WishList w=new WishList(driver);
	w.closepopup();
	driverutil.switchFrame(driver);
	
	w.palybtn();
	Thread.sleep(10000);
	w.pausebtn();
	driverutil.switchBackFrame(driver);
	w.wishlist();
	
	}
}
