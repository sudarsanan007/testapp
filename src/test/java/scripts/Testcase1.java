package scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pompages.AddToCart;
import pompages.Skillrary;
import pompages.SkillraryDemo;


public class Testcase1 extends StepGroup
{
	@Test
	public void tc1()
	{
		Skillrary s = new Skillrary(driver);
		s.gearsButton();
		s.demoSkillraryApp();
		
		SkillraryDemo sd = new SkillraryDemo(driver);
		driverutil.switchTabs(driver);
		driverutil.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddToCart ad = new AddToCart(driver);
		driverutil.doubleClick(driver, ad.getAddbtn());
		ad.addtocartbtn();
		driverutil.alertPopup(driver);
	}
	
}
