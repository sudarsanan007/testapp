package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	public Skillrary(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton()
	{
		gearstab.click();
	}
	
	public void demoSkillraryApp()
	{
		demoapp.click();
	}

	public void searchTextBox(String propertydata) {
		// TODO Auto-generated method stub
		
	}

	public void searchButton() {
		// TODO Auto-generated method stub
		
	}

}
