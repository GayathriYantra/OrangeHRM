package com.OrangeHRMLogin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.OrangeHrmObjectRepository.DashBoard;
import com.OrangeHrmObjectRepository.DirectoryPage;
import com.OrangeHrmObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	@Test
	public void loginToApp()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp=new LoginPage(driver);
		lp.getUsername("Admin");
		lp.getPassword("admin123");
		lp.getLogin();
		DashBoard db=new DashBoard(driver);
		db.getSearchTxtField("directory");

		DirectoryPage dp=new DirectoryPage(driver);
		dp.getDirectoryLnk();
		//dp.getEmpTxtField("jas");
		//	Actions action=new Actions(driver);
		//driver.getAttribute("value");
		//	action.sendKeys(Keys.ARROW_DOWN);
		//dropdown
		dp.getLocationDrDown();
		List<WebElement> list = driver.findElements(By.xpath("//label[text()='Location']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text-input']"));
		for(WebElement ele:list)	
		{
		
			System.out.println(ele.getText());
			if(ele.getText().equals("Canadian Regional HQ"))
			{
				ele.click();
				break;
			}
		}
		dp.getSearchLink();
		






	}
}
