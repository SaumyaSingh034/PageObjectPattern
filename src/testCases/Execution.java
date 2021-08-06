package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepositories.RediffHomePage;
import objectRepositories.RediffLoginPage;
import objectRepositories.RediffVideoPage;

public class Execution {

	@Test
	public void LoginExecution() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.PassWord().sendKeys("password");
		rd.Submit().click();
		rd.HomePage().click();
		RediffHomePage rh = new RediffHomePage(driver);
		rh.Search().sendKeys("helo");
		//rh.Submit().click();
		rh.Videos().click();
		RediffVideoPage rv = new RediffVideoPage(driver);
		Thread.sleep(3000);
		rv.Search().sendKeys("Saumya");
		rv.Submit().click();
		
	}

}
