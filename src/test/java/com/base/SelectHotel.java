package com.base;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class SelectHotel extends Base {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement rdbtns;
	
	@FindBy(id="continue")
	private WebElement btncontinue;
	
	@FindBy(className="login_title")
	private WebElement txtSelectHotel;

	public WebElement getRdbtns() {
		return rdbtns;
	}

	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	public void verifySelectHotelMsg(String expValue) {
		String actValue = getText(getTxtSelectHotel());
		Assert.assertEquals("verify select hotel", expValue, actValue);
	}
	
	
	public void SelectHotel() {
		click(getRdbtns());
		click(getBtncontinue());
		
	}

}



