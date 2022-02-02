package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmation extends Base{

	@FindBy(id="order_no")
	 private WebElement txtOrderno;

	public WebElement getTxtOrderno() {
		return txtOrderno;
	}
	public String BookingOrderID(String oid1) throws InterruptedException {
       Thread.sleep(2000);
        String attribute = getAttribute(getTxtOrderno(), oid1);
		System.out.println("Order No:"+attribute);
		return attribute;
	}
	
	
	
}
