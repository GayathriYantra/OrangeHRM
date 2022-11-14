package com.OrangeHrmObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage 
{
@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")private WebElement directoryLnk;
@FindBy(xpath="//input[@placeholder='Type for hints...']")private WebElement empNameTxtField;
@FindBy(xpath="//label[text()='Location']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/descendant::div[@class='oxd-select-text-input']")
private WebElement locationDrDown;
@FindBy(xpath="//button[@type='submit']")private WebElement searchLink;

@FindBy(xpath="//div[text()='Canadian Regional HQ']")private WebElement canadianText;

public DirectoryPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void getDirectoryLnk()
{
	directoryLnk.click();
}
public void getEmpTxtField(String EmpName)
{
	empNameTxtField.sendKeys(EmpName);
}
public void getLocationDrDown()
{
	locationDrDown.click();
}
public void getCanadianText()
{
	canadianText.click();
}
public void getSearchLink()
{
	searchLink.submit();
}
}
