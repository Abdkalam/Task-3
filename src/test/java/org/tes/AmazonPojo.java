package org.tes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="twotabsearchtextbox")
	private WebElement product;
	@FindAll({ 
		@FindBy (id="nav-search-submit-button"),
		@FindBy (xpath="//input[@type='submit']")
		
	})
	private WebElement search;
	
	
	@FindBy(name="username")
	private WebElement email;


	public WebElement getEmail() {
		return email;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
}
