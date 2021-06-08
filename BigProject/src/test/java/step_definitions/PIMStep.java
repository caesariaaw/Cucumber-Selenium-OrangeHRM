package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.allPage;

public class PIMStep {
	public static WebDriver driver;

	public PIMStep() {
		driver = Hooks.driver;
	}

	@Given("User 10 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void visitLoginPagee(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		
	}

	@When("User 10 click PIM button & click add employee button")
	public void goToAddEmployee() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.PIMBtn();
		AllPage.addEmployeeBtn();
		

	}

	@When("User input \"(.*)\" as firstName & input \"(.*)\" as middleName & input \"(.*)\" as lastName & input \"(.*)\" as id_Employee & click checkBox")
	public void inputEmployeeData1(String firstName, String middleName, String lastname, String id_Employee)
			throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.firstNameEmployee(firstName);
		AllPage.middleNameEmployee(middleName);
		AllPage.lastNameEmployee(lastname);
		AllPage.idEmployee(id_Employee);
		AllPage.chckBoxEmployee();
		

	}

	@When("^User input \"(.*)\" as unameEmploy & input \"(.*)\" as passEmploy & input \"(.*)\" as rePassEmploy & click save btn & click edit btn$")
	public void inputEmployeeData2(String unameEmploy, String passEmploy, String rePassEmploy) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.unameEmployee(unameEmploy);
		AllPage.passEmployee(passEmploy);
		AllPage.rePassEmployee(rePassEmploy);
		AllPage.save1Btn();
		Thread.sleep(3000);
		AllPage.editBtn();

	}

	@When("User input \"(.*)\" as SIMNumb & click genderChckBox & select nationality & input \"(.*)\" as otherID & input \"(.*)\" as SIMExpDate & select marital status & input \"(.*)\" as BirthDate & click save btn")
	public void inputEmployeeData3(String SIMNumb, String otherID, String SIMExpDate, String BirthDate)
			throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.SIMNumber(SIMNumb);
		AllPage.genderChckBox();
		AllPage.nationality();
		AllPage.otherId(otherID);
		AllPage.licExpDate(SIMExpDate);
		AllPage.maritalStatus();
		AllPage.birthDate(BirthDate);
		AllPage.save2Btn();

	}

	@Then("User succesfully add employee")
	public void successfulAddEmployee() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isSuccesAddEmployeeAppear());

	}

//search
	@Given("User 11 on homepage with authorization using \"(.*)\" as username & \"(.*)\" as password")
	public void VisitLoginPage3(String username, String password) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.waitLoginAppear();
		Assert.assertTrue(loginPage.isLoginPageAppear());
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickLoginButton();
		
	}

	@When("User 11 click PIM button")
	public void goToSearchEmployee() throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.PIMBtn();
	
	}

	@When("User input \"(.*)\" as fullName & select include employe & click search btn")
	public void inputSearchData(String fullName) throws Throwable {
		allPage AllPage = new allPage(driver);
		AllPage.searchName(fullName);
		AllPage.includeEmployee();
		AllPage.searchBtn();
		

	}

	@Then("User get employee on the list")
	public void successfulGetEmployee() throws Throwable {
		allPage AllPage = new allPage(driver);
		Assert.assertTrue(AllPage.isEmployeeNameAppear());

		
		
		
	}
}
