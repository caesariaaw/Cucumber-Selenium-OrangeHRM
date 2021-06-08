package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.allPage;

public class timeStep {
	public static WebDriver driver;

	public timeStep() {
		driver = Hooks.driver;
	}

	@Given("User 9 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage8(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
	}

	@When("User 9 click time button & click attendance button & click punch in button")
	public void goToTimePunchInPage() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.timeBtn();
		AllPage.attendanTimeBtn();
		AllPage.punchInOutBtn();

	}

	@When("User input \"(.*)\" as punchInNote & click punch in button")
	public void inputNotesToPunchIn(String punchInNote) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.notePunchIn(punchInNote);
		AllPage.punchBtn();
		
	}

	@Then("User succesfully punch in")
	public void successfulPunchIn() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertEquals(AllPage.punchInNotesAct(), AllPage.punchInNotesExp());
		
		
	}

	@Then("User input \"(.*)\" as punchOutNote & click punch out button")
	public void clickPunchOut(String punchOutNote) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.notePunchOut(punchOutNote);
		AllPage.punchBtn();
	
	}

	@Then("User succesfully punch out")
	public void successfulPunchOut() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isPunchOutSuccess());
		


	}
}
