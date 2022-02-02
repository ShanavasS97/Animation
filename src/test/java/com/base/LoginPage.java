package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUsrNme;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
		
	public WebElement getTxtUsrNme() {
		return txtUsrNme;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}


	public void login(String username,String password) {
		sendKeys(getTxtUsrNme(), username);
		sendKeys(getTxtPassword(), password);
		click(getBtnLogin());
		
	}
}