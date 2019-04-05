package com.mindtree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement fb_username;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement fb_password;

	@FindBy(xpath = "//input[@id='u_0_2']")
	private WebElement fb_login_btn;

	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setFb_Username(String username) {
		fb_username.clear();
		fb_username.sendKeys(username);
	}

	public void setFb_Password(String password) {
		fb_password.clear();
		fb_password.sendKeys(password);
	}

	public void clickFb_Loginbtn() {
		fb_login_btn.click();
	}
}
