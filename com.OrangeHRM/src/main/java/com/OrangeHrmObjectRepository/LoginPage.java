package com.OrangeHrmObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
@FindBy(xpath="//input[@name='username']") private WebElement userNameTxtField;
@FindBy(xpath="//input[@name='password']")private WebElement passwordTxtField;
@FindBy(xpath="//button[@type='submit']")private WebElement loginBtn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void getUsername(String userNAme)
{
	userNameTxtField.sendKeys(userNAme);
}
public void getPassword(String passWord)
{
	passwordTxtField.sendKeys(passWord);	
}
public void getLogin()
{
	loginBtn.submit();	
}
}