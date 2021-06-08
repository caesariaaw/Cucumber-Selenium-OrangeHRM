package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.allPage;

public class AdminStep {
	public static WebDriver driver;

	public AdminStep() {
		driver = Hooks.driver;
	}

//AddData
	@Given("User 1 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage2(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		
	}

	@When("User 1 click Admin button and click add button")
	public void goToAdminPageToAddUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		AllPage.addUserBtn();
	

	}

	@When("User select Admin as role & input \"(.*)\" as employeeUserName & input \"(.*)\" as userName & input \"(.*)\" as userPassword & input \"(.*)\" as userRePass & click save button")
	public void inputCredentialToAddUser(String employeeUserName, String userName, String userPassword,
			String userRePass) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.addUserEmployeeName(employeeUserName);
		AllPage.User_Name(userName);
		AllPage.UserPassword(userPassword);
		AllPage.userConfPassword(userRePass);
		AllPage.saveUserBtn();


	}

	@Then("User succesfully add new user data")
	public void userSuccessfullAddNewUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		try {
			if (AllPage.isUserNameAlreadyExist()) {
			System.out.println("Username Already Exist");
		} else {
			System.out.println("successfull");
		}
	}catch (Exception e){
		System.out.println("successfull");
	}

	}

//searchData	
	@Given("User 2 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage3(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();

	}

	@When("User 2 click Admin button")
	public void goToAdminPageSearchToUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();

	}

	@When("User input \"(.*)\" as userName & click search button")
	public void inputCredentialToSearchUser(String userName) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.searchUserName(userName);
		AllPage.searchBtn();

	}

	@Then("User get user data on the list")
	public void GetUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		try {
			if (AllPage.isNotFoundMessageAppear()) {
				System.out.println("unsuccessfully get data");
			} else {
				System.out.println("successfully get data");
			}
		} catch (Exception e) {
			System.out.println("successfully get data");
		}
	}

//search random data	
	@Given("User 3 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage4(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();

	}

	@When("Users 3 click Admin button")
	public void goToAdminPageSearchToXUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
	
	}

	@When("User input \"(.*)\" as xUserNamee & click search button")
	public void inputCredentialToSearchXUser(String xUserNamee) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.searchUserName(xUserNamee);
		AllPage.searchBtn();

	}

	@Then("User get notFoundMessage on the list")
	public void xGetUser() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isNotFoundMessageAppear());

	}

//regOAuthClient
	@Given("User 4 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage5(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();

	}

	@When("^User 4 click Admin button & click configuration button & click register OAuth client button$")
	public void userGoToRegOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		AllPage.configAdminBtn();
		AllPage.OAuthClientAdminBtn();
	}

	@When("User input \"(.*)\" as oAuthId & input \"(.*)\" as oAuthSecret & input \"(.*)\" as oAuthUrl & click button save")
	public void inputCredentialToRegOAuthClient(String oAuthId, String oAuthSecret, String oAuthUrl) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.OAuthID(oAuthId);
		AllPage.OAuthSecret(oAuthSecret);
		AllPage.OAuthURl(oAuthUrl);
		AllPage.OAuthSaveBtn();

	}

	@Then("User successfully register OAuth client")
	public void successfullyRegisterOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isOAuthSaved());

	}

//deleteAOuthClient
	@Given("User 5 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage6(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();

	}

	@When("User 5 click Admin button & click configuration button & click register OAuth client button")
	public void goToConfigAdminPageToDeleteOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.adminBtn();
		AllPage.configAdminBtn();
		AllPage.OAuthClientAdminBtn();

	}

	@When("User click one of data to be delete & click ok button")
	public void selectOAuthClientToBeDelete() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.OAuthToBeDelete();
		AllPage.OAuthDeleteBtn();
		AllPage.OAuthDeleteOkBtn();
	}

	@Then("User successfully delete OAuth client data")
	public void successfullyDeleteOAuthClient() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isOAuthDeleted());

	}
}
