package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pompages.Skillrary;
import pompages.SkillraryDemo;
import pompages.Testing;

public class Testcase2 extends StepGroup
{
	@Test
	public void tc2() throws IOException
	{
		Skillrary s = new Skillrary(driver);
		s.gearsButton();
		s.demoSkillraryApp();
		
		SkillraryDemo sd =  new SkillraryDemo(driver);
		driverutil.switchTabs(driver);
		driverutil.dropdown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		
		Testing t = new Testing(driver);
		driverutil.dragAndDrop(driver, t.getSelenium(), t.getCart());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		driverutil.scrollBar(driver, x, y);
		t.facebookicon();
	}
}
