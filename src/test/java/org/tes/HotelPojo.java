package org.tes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class HotelPojo extends BaseClass {

	public HotelPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement user;
	@FindAll({ @FindBy(xpath = "//input[@type='password']"), @FindBy(id = "password") })
	private WebElement pass;
	@FindBy(id = "login")
	private WebElement log;
	@FindBy(id = "location")
	private WebElement loc;
	@FindBy(id = "hotels")
	private WebElement hot;
	@FindBy(id = "room_type")
	private WebElement rotype;
	@FindBy(id = "room_nos")
	private WebElement ronos;
	@FindBy(id = "adult_room")
	private WebElement adrom;
	@FindBy(id = "child_room")
	private WebElement chroom;
	@FindAll({ @FindBy(id = "Submit"), @FindBy(xpath = "//input[@type='submit']") })
	private WebElement sub;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioclk;
	@FindBy(name = "continue")
	private WebElement searchhotel;
	@FindBy(name = "first_name")
	private WebElement firstname;
	@FindBy(name = "last_name")
	private WebElement lastname;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement cardno;
	@FindBy(name = "cc_type")
	private WebElement cardtype;
	@FindBy(name = "cc_exp_month")
	private WebElement cardmonth;
	@FindBy(name = "cc_exp_year")
	private WebElement cardyrs;
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	@FindBy(name = "book_now")
	private WebElement book;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLog() {
		return log;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHot() {
		return hot;
	}
	public WebElement getRotype() {
		return rotype;
	}
	public WebElement getRonos() {
		return ronos;
	}
	public WebElement getAdrom() {
		return adrom;
	}
	public WebElement getChroom() {
		return chroom;
	}
	public WebElement getSub() {
		return sub;
	}
	public WebElement getRadioclk() {
		return radioclk;
	}
	public WebElement getSearchhotel() {
		return searchhotel;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardmonth() {
		return cardmonth;
	}
	public WebElement getCardyrs() {
		return cardyrs;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}

}
