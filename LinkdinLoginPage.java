package com.mindtree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkdinLoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@id='login-email']")
	private WebElement ld_username;

	@FindBy(xpath = "//input[@id='login-password']")
	private WebElement ld_password;

	@FindBy(xpath = "//input[@id='login-submit']")
	private WebElement ld_login_btn;

	public LinkdinLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setld_Username(String username) {
		ld_username.clear();
		ld_username.sendKeys(username);
	}

	public void setld_Password(String password) {
		ld_password.clear();
		ld_password.sendKeys(password);
	}

	public void clickld_Loginbtn() {
		ld_login_btn.click();
	}
}
