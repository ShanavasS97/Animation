package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Classbooking2 extends Base{
	
	public void CancelBooking2() {
		PageFactory.initElements(driver , this);
	}

	
	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private WebElement txtbkditny;
	
	@FindBy(id="order_id_text")
	private WebElement btnGo;
	
	@FindBy(name="name=\"ids[]\"")
	private WebElement btnSelect;
	
	@FindBy(xpath="//input[@style=\"width:150px;\"][1]")
	private WebElement btnCancel;

	public WebElement getTxtbkditny() {
		return txtbkditny;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}	
	
	public void cancelBkng2(String orderno) {
		click(getTxtbkditny());
		sendKeys(getTxtbkditny(),orderno);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
