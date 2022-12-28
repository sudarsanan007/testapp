package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	
	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	@FindBy(id="mycart")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public Testing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebookicon() {
		facebook.click();
	}
	
}
