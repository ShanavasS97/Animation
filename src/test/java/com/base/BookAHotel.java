package com.base;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class BookAHotel extends Base{
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
 	private WebElement txtFname;
	
	@FindBy(id="last_name")
	private WebElement txtLnme;
	
	@FindBy(id="address")
	private WebElement txtAdd;
	
	@FindBy(id="cc_num")
	private WebElement txtCcn;
	
	@FindBy(id="cc_type")
	private WebElement dDnCct;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnCcm;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnCcy;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCcv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	
	public WebElement getTxtFname() {
		return txtFname;
	}

	public WebElement getTxtLnme() {
		return txtLnme;
	}

	public WebElement getTxtAdd() {
		return txtAdd;
	}

	public WebElement getTxtCcn() {
		return txtCcn;
	}

	public WebElement getdDnCct() {
		return dDnCct;
	}

	public WebElement getdDnCcm() {
		return dDnCcm;
	}

	public WebElement getdDnCcy() {
		return dDnCcy;
	}

	public WebElement getTxtCcv() {
		return txtCcv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	public void BookHotel(String FisrtName,String LastName,String Address,String CreditCardNo,String CreditCardTpye,String ExMonth,String exYear,String Ccv) {
		
		sendKeys(getTxtFname(), FisrtName);
		sendKeys(getTxtLnme(), LastName);
		sendKeys(getTxtAdd(), Address);
		sendKeys(getTxtCcn(), CreditCardNo);
		selectOptionByText(getdDnCct(), CreditCardTpye);
		selectOptionByText(getdDnCcm(), ExMonth);
		selectOptionByText(getdDnCcy(), exYear);
		sendKeys(getTxtCcv(), Ccv);
		click(getBtnBookNow());
		

}
}
