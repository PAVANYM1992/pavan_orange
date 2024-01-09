package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(name="username")
	private WebElement un_tf;
	
	@FindBy(name="password")
	private WebElement un_pwd;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement enter_un()
	{
		return un_tf;
	}
	
	public WebElement enter_pwd()
	{
		return un_pwd;
	}
	
	public WebElement click_lgn()
	{
		return loginButton;
	}
	
	
	
	
	
	

}
