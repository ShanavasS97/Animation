package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class CancelBooking extends Base {
	 public CancelBooking() {
		 PageFactory.initElements(driver, this);
	}
	 
	 public WebElement getBk() {
		return bk;
	}

	public WebElement getAl() {
		return al;
	}

	public WebElement getCl() {
		return cl;
	}

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	 private WebElement bk;
	
	@FindBy(name="check_all")
	private WebElement al;
	
	@FindBy(name="cancelall")
	private WebElement cl;
	
	public void cbk() {
		
		click(bk);
		click(al);
		click(cl);
		
		
	}
	
}
