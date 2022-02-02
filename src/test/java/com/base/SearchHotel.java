package com.base;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class SearchHotel extends Base {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement dDnLoc;
	
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNos;
	
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	@FindBy(id="username_show")
	private WebElement txtWelMsg;
	
	public WebElement getTxtWelMsg() {
		return txtWelMsg;
	}

	public WebElement getdDnLoc() {
		return dDnLoc;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public void verifyWelMsg(String expValue) {
		String actValue = getAttributevalue(getTxtWelMsg());
		Assert.assertEquals("verify welcome message", expValue, actValue);

	}
	
	
	 public void SearchHotels(String Location,String Hotels,String roomType,String noOfRooms,String checkInDate,String checkOutDate,String adultRoom,String childRoom) {
			selectOptionByText(getdDnLoc(), Location);
			selectOptionByText(getdDnhotels(), Hotels);
			selectOptionByText(getdDnRoomType(), roomType);
			selectOptionByText(getdDnRoomNos(), noOfRooms);
			sendKeys(getTxtCheckInDate(), checkInDate);
			sendKeys(getTxtCheckOutDate(), checkOutDate);
			selectOptionByText(getdDnAdultRoom(), adultRoom);
			selectOptionByText(getdDnChildRoom(), childRoom);
			click(getBtnSearch());
			
}
}