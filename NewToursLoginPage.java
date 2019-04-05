package com.mindtree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewToursLoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement nt_username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement nt_password;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement nt_login_btn;

	public NewToursLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setnt_Username(String username) {
		nt_username.clear();
		nt_username.sendKeys(username);
	}

	public void setnt_Password(String password) {
		nt_password.clear();
		nt_password.sendKeys(password);
	}

	public void clicknt_Loginbtn() {
		nt_login_btn.click();
	}
}
