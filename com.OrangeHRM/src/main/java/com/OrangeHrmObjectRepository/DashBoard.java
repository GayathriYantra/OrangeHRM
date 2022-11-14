package com.OrangeHrmObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author admin
 *
 */
public class DashBoard 
{
@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")private WebElement searchTextField;


public DashBoard(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void getSearchTxtField(String name)
{
	searchTextField.sendKeys(name);
}

}