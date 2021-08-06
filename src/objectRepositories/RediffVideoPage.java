package objectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffVideoPage {
	
	WebDriver driver;
	public RediffVideoPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath  = "//input[@id='srchword']")
	WebElement search;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	public WebElement Search()
	{
		return search;
	}

	public WebElement Submit()
	{
		return submit;
	}


}
