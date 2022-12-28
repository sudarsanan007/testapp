package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium
{

	@FindBy(xpath="//a[@title='Core Java For Selenium Training']")
    private WebElement corejava;
	
	public Selenium(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
     public void corejavaselenium() {
		corejava.click();
	}
}
