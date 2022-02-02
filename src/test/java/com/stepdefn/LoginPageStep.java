package com.stepdefn;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;
import com.base.BookAHotel;
import com.base.CancelBooking;
import com.base.LoginPage;
import com.base.SearchHotel;
import com.base.SelectHotel;
import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep extends Base {
	
	@Given("user on the adactin page")
	public void user_on_the_adactin_page() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	}

	@When("user should login username and password")
	
	public void user_should_login_username_and_password(io.cucumber.datatable.DataTable data) {
	
	 List<Map<String,String>> asMaps = data.asMaps();
	 String string = asMaps.get(2).get("username");
	 WebElement lgn = driver.findElement(By.id("username"));
	 lgn.sendKeys(string);
	 
	 List<Map<String,String>> asMaps2 = data.asMaps();
	 String string2 = asMaps.get(2).get("password");
	 WebElement pass = driver.findElement(By.id("password"));
	 pass.sendKeys(string2);
	 
	}

	@When("user click login buuton")
	public void user_click_login_buuton() {
		WebElement clk = driver.findElement(By.id("login"));
		clk.click();
	}

	@Then("user verify success msg")
	public void user_verify_success_msg() {
		 Assert.assertTrue("verify a msg",true );
		  // driver.quit();
	   
	}
	
}
		
	
//
//	@Given("user on the adactin page")
//	public void user_on_the_adactin_page() {
//	getDriver();
//	loadUrl("https://adactinhotelapp.com/");
//	maximize();
//	}
//
//	@When("user should login {string} and {string}")
//	public void user_should_login_and(String username,String password) {
//	
//	LoginPage lp = new LoginPage();
//	lp.login(username, password);
//		
//		
//	}
//
//	@When("user should search hotel {string}and{string}and{string}and{string}and{string}and{string}and{string}and{string}")
//	public void user_should_search_hotel_and_and_and_and_and_and_and(String Location,String Hotels,String roomType,String noOfRooms,String checkInDate,String checkOutDate,String adultRoom,String childRoom) {
//	
//		SearchHotel sh = new SearchHotel();
//		sh.SearchHotels(Location, Hotels, roomType, noOfRooms, checkInDate, checkOutDate, adultRoom, childRoom);
//	}
//
//	@When("user should select a hotel")
//	public void user_should_select_a_hotel() {
//		SelectHotel sh2 = new SelectHotel();
//		sh2.SelectHotel();
//    }
//
//	@When("user should book a hotel {string}and{string}and{string}and{string}and{string}and{string}and{string}and{string}")
//	public void user_should_book_a_hotel_and_and_and_and_and_and_and(String FisrtName,String LastName,String Address,String CreditCardNo,String CreditCardTpye,String ExMonth,String exYear,String Ccv) {
//    BookAHotel bh = new BookAHotel();
//    bh.BookHotel(FisrtName, LastName, Address, CreditCardNo, CreditCardTpye, ExMonth, exYear, Ccv);
//	}
//	@When("user should cancel booking")
//	public void user_should_cancel_booking() {
//		 CancelBooking cb = new CancelBooking();
//		 cb.cbk();
//		   
//	    
//	}
//
//	
//	@Then("user verify success msg")
//	public void user_verify_success_msg() {
//	   Assert.assertTrue("verify a msg",true );
//	   driver.quit();
//	}
	

	
//}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("user on the adactin page")
//	public void user_on_the_adactin_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/index.php");
//		driver.manage().window().maximize();
//
//	
//	}
//
//	@When("user should login {string} and {string}")
//	public void user_should_login_and(String string, String string2) {
//		
//		WebElement lgn = driver.findElement(By.id("username"));
//		lgn.sendKeys(string);
//		WebElement pass = driver.findElement(By.id("password"));
//		pass.sendKeys(string2);
//		WebElement clk = driver.findElement(By.id("login"));
//		clk.click();
//	   
//	}
//
//	@When("user should search hotel {string}and{string}and{string}and{string}and{string}and{string}and{string}and{string}")
//	public void user_should_search_hotel_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
//		
//		WebElement loc = driver.findElement(By.id("location"));
//		loc.sendKeys(string);
//		WebElement hot = driver.findElement(By.id("hotels"));
//		hot.sendKeys(string2);
//		WebElement rmtype = driver.findElement(By.id("room_type"));
//		rmtype.sendKeys(string3);
//		WebElement rmno = driver.findElement(By.id("room_nos"));
//		rmno.sendKeys(string4);
//		WebElement date = driver.findElement(By.id("datepick_in"));
//		date.sendKeys(string5);
//		WebElement dateout = driver.findElement(By.id("datepick_out"));
//		dateout.sendKeys(string6);
//		WebElement aroom = driver.findElement(By.id("adult_room"));
//		aroom.sendKeys(string7);
//		WebElement croom = driver.findElement(By.id("child_room"));
//		croom.sendKeys(string8);
//		WebElement sbclk = driver.findElement(By.id("Submit"));
//		sbclk.click();
//
//	}
//
//	@When("user should select a hotel")
//	public void user_should_select_a_hotel() {
//		WebElement rad = driver.findElement(By.id("radiobutton_0"));
//		rad.click();
//		WebElement cnt = driver.findElement(By.id("continue"));
//		cnt.click();
//	   
//	}
//
//	@When("user should book a hotel {string}and{string}and{string}and{string}and{string}and{string}and{string}and{string}")
//	public void user_should_book_a_hotel_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
//
//		WebElement fname = driver.findElement(By.id("first_name"));
//		fname.sendKeys(string);
//		WebElement lname = driver.findElement(By.id("last_name"));
//		lname.sendKeys(string2);
//		WebElement add = driver.findElement(By.id("address"));
//		add.sendKeys(string3);
//		WebElement ccn = driver.findElement(By.id("cc_num"));
//		ccn.sendKeys(string4);
//		WebElement cct = driver.findElement(By.id("cc_type"));
//		cct.sendKeys(string5);
//		WebElement ccm = driver.findElement(By.id("cc_exp_month"));
//		ccm.sendKeys(string6);
//		WebElement ccy = driver.findElement(By.id("cc_exp_year"));
//		ccy.sendKeys(string7);
//		WebElement ccv = driver.findElement(By.id("cc_cvv"));
//		ccv.sendKeys(string8);
//		WebElement bknw = driver.findElement(By.id("book_now"));
//		bknw.click(); 
//	}
//    
//	@Then("finally user should get an unique order id")
//	public void finally_user_should_get_an_unique_order_id() throws InterruptedException {
//		Thread.sleep(5000);
//		WebElement oid = driver.findElement(By.id("order_no"));
//		String data = oid.getAttribute("value");
//		System.out.println(data);
//		
//		Assert.assertTrue("verify user get order id ", true);
//		
//		
//		
//		driver.quit();
//		
//		
//	}


