package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemo {
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement coursedd;
	
	public SkillraryDemo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCoursetab()
	{
		return coursetab;
	}
	
	public void seleniumtrainingbtn() 
	{
		seleniumtraining.click();
	}

	public WebElement getCoursedd() 
	{
		return coursedd;
	}
}