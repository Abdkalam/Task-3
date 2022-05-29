package org.tes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass{
	
	public Pojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement email;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	@FindBy(xpath ="//input[@id='login']")
	private WebElement login;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}

}
