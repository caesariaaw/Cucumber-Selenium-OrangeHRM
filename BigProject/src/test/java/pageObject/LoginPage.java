package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "txtUsername")
	private WebElement inputUsername;

	@FindBy(id = "txtPassword")
	private WebElement inputPassword;

	@FindBy(id = "btnLogin")
	private WebElement btnLogin;

	@FindBy(id = "spanMessage")
	private WebElement ErrorMessageLogIn;

	@FindBy(xpath = "//h1[.='Dashboard']")
	private WebElement dashboard;

	public void waitLoginAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
	}
		
	public boolean isLoginPageAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername"))).isDisplayed();
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword"))).isDisplayed();
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin"))).isDisplayed();
		return true;
	}
	
	

	public boolean isLoginSuccess() {
		dashboard.isDisplayed();
		return true;
	}

	public void setUsername(String username) {
		inputUsername.sendKeys(username);

	}

	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}

	public void setXUsername(String Xusername) {
		inputUsername.sendKeys(Xusername);

	}

	public void setXPassword(String Xpassword) {
		inputPassword.sendKeys(Xpassword);
	}

	public void clickLoginButton() {
		btnLogin.click();
	}
	
	public boolean isErrorMessageAppear() {
		ErrorMessageLogIn.isDisplayed();
		
		return true;

	}

	

}
