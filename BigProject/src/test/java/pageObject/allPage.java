package pageObject;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.lexer.Id;
import utilities.BaseClass;

public class allPage extends BaseClass {

	private static final CharSequence Enter = null;

	public allPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);

	}

//pim	

	public void PIMBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[.='PIM']"))).click();
		
	}


	public void addEmployeeBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_pim_addEmployee']"))).click();
	}

	@FindBy(id = "firstName")
	private WebElement firstNameEmployee;

	public void firstNameEmployee(String firstName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
		firstNameEmployee.sendKeys(firstName);
	}

	@FindBy(id = "middleName")
	private WebElement middleNameEmployee;

	public void middleNameEmployee(String middleName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("middleName")));
		middleNameEmployee.sendKeys(middleName);
	}

	@FindBy(id = "lastName")
	private WebElement lastNameEmployee;

	public void lastNameEmployee(String lastName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
		lastNameEmployee.sendKeys(lastName);
	}

	@FindBy(id = "employeeId")
	private WebElement idEmployee;

	public void idEmployee(String id_Employee) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("employeeId")));
		idEmployee.clear();
		idEmployee.sendKeys(id_Employee);
	}

	@FindBy(id = "chkLogin")
	private WebElement chckBoxEmployee;

	public void chckBoxEmployee() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("chkLogin")));
		chckBoxEmployee.click();
	}

	@FindBy(id = "btnSave")
	private WebElement save1Btn;

	public void save1Btn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave")));
		save1Btn.click();
	}

	@FindBy(id = "user_name")
	private WebElement unameEmployee;

	public void unameEmployee(String unameEmploy) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_name")));
		unameEmployee.sendKeys(unameEmploy);
	}

	@FindBy(id = "user_password")
	private WebElement passEmployee;

	public void passEmployee(String passEmploy) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_password")));
		
		passEmployee.sendKeys(passEmploy);
	}

	@FindBy(id = "re_password")
	private WebElement rePassEmployee;

	public void rePassEmployee(String rePassEmploy) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("re_password")));
		
		rePassEmployee.sendKeys(rePassEmploy);
	}

	@FindBy(id = "btnSave")
	private WebElement editBtn;

	public void editBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave"))).click();
	}

	@FindBy(id = "btnSave")
	private WebElement save2Btn;

	public void save2Btn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave"))).click();
	}

	@FindBy(id = "personal_txtLicenNo")
	private WebElement SIMNumber;

	public void SIMNumber(String SIMNumb) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_txtLicenNo")));
		
		SIMNumber.sendKeys(SIMNumb);
	}

	@FindBy(id = "personal_optGender_2")
	private WebElement genderChckBox;

	public void genderChckBox() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_optGender_2"))).click();
	}

	public void nationality() {
			
		Select nationality = new Select(webDriver.findElement(By.id("personal_cmbNation")));
		nationality.selectByVisibleText("Indonesian");
	}

	@FindBy(id = "personal_txtOtherID")
	private WebElement otherId;

	public void otherId(String otherID) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_txtOtherID")));
		otherId.sendKeys(otherID);
	}

	@FindBy(id = "personal_txtLicExpDate")
	private WebElement licExpDate;

	public void licExpDate(String SIMExpDate) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_txtLicExpDate")));
		licExpDate.clear();
		licExpDate.sendKeys(SIMExpDate);
		licExpDate.sendKeys(Keys.ENTER);
	}

	public void maritalStatus() {
		Select maritalStatus = new Select(webDriver.findElement(By.id("personal_cmbMarital")));
		maritalStatus.selectByValue("Single");

	}

	@FindBy(id = "personal_DOB")
	private WebElement birthDate;

	public void birthDate(String BirthDate) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_DOB")));
		birthDate.clear();
		birthDate.sendKeys(BirthDate);
		birthDate.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath = "//div[@id='pdMainContainer']/div[@class='inner']/script[1]")
	private WebElement successAddEmployee;
	
	public boolean isSuccesAddEmployeeAppear() {
	successAddEmployee.isDisplayed();
	return true ;
	}

	@FindBy(id = "menu_pim_viewEmployeeList")
	private WebElement employeeListBtn;

	public void employeeListBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewEmployeeList")));
		employeeListBtn.click();
	}

	@FindBy(id = "empsearch_employee_name_empName")
	private WebElement fullNameToSearch;

	public void searchName(String fullName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("empsearch_employee_name_empName")));
		
		fullNameToSearch.sendKeys(fullName);
	}

	public void includeEmployee() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("empsearch_termination")));
		
		Select includeEmployee = new Select(webDriver.findElement(By.id("empsearch_termination")));
		includeEmployee.selectByValue("2");

	}
	

	@FindBy(id = "searchBtn")
	private WebElement searchBtn;

	public void searchBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn"))).click();
	}

	@FindBy(xpath = "//a[.='kim jong']")
	private WebElement resultName;


	public boolean isEmployeeNameAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='kim jong']")));
		resultName.isDisplayed();
		return true;
	}



//admin
	@FindBy(xpath = "//b[.='Admin']")
	private WebElement adminBtn;

	public void adminBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[.='Admin']"))).click();
	}

	@FindBy(id = "btnAdd")
	private WebElement addUserBtn;

	public void addUserBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnAdd"))).click();
	}

	public void userType() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("systemUser_userType")));
		
		Select userType = new Select(webDriver.findElement(By.id("systemUser_userType")));
		userType.selectByValue("2");

	}

	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement addUserEmployeeName;

	public void addUserEmployeeName(String employeeUserName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("systemUser_employeeName_empName")));
		addUserEmployeeName.clear();
		addUserEmployeeName.sendKeys(employeeUserName);
	}

	@FindBy(id = "systemUser_userName")
	private WebElement User_Name;

	public void User_Name(String UserName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("systemUser_userName")));
		User_Name.clear();
		User_Name.sendKeys(UserName);
	}

	@FindBy(xpath = "//input[@id='systemUser_password']")
	private WebElement UserPassword;

	public void UserPassword(String userPassword) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='systemUser_password']")));
		UserPassword.sendKeys(userPassword);
	}

	@FindBy(id = "systemUser_confirmPassword")
	private WebElement userConfPassword;

	public void userConfPassword(String userRePass) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("systemUser_confirmPassword")));
		userConfPassword.sendKeys(userRePass);
	}

	@FindBy(id = "btnSave")
	private WebElement saveUserBtn;

	public void saveUserBtn() {
		new WebDriverWait(webDriver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnSave']"))).click();

	}

	@FindBy(id = "searchSystemUser_userName")
	private WebElement searchUserName;

	public void searchUserName(String userName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchSystemUser_userName")));
		searchUserName.sendKeys(userName);
	}

	public void searchXUserName(String xUserNamee) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchSystemUser_userName")));
		searchUserName.sendKeys(xUserNamee);
	}

	@FindBy(id = "searchBtn")
	private WebElement searchUserNameBtn;

	public void searchUserNameBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn"))).click();
	}

	@FindBy(className = "validation-error")
	private WebElement resultUserName;

	public boolean isUserNameAlreadyExist() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.className("validation-error")));
		resultUserName.isDisplayed();
		return true;
	}

	@FindBy(xpath = "//td[.='No Records Found']")
	private WebElement notFoundMessage;

	public boolean isNotFoundMessageAppear() {
		notFoundMessage.isDisplayed();
		return true;
	}

	@FindBy(id = "menu_admin_Configuration")
	private WebElement configAdminBtn;

	public void configAdminBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_admin_Configuration"))).click();
	}

	public void OAuthClientAdminBtn() {
		new WebDriverWait(webDriver, 20).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_admin_registerOAuthClient']")))
				.click();
	}

	@FindBy(id = "oauth_client_id")
	private WebElement OAuthID;

	public void OAuthID(String oAuthId) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("oauth_client_id")));
		OAuthID.sendKeys(oAuthId);
	}

	@FindBy(id = "oauth_client_secret")
	private WebElement OAuthSecret;

	public void OAuthSecret(String oAuthSecret) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("oauth_client_secret")));
		OAuthSecret.sendKeys(oAuthSecret);
	}

	@FindBy(id = "oauth_redirect_uri")
	private WebElement OAuthURl;

	public void OAuthURl(String oAuthUrl) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("oauth_redirect_uri")));
		OAuthURl.sendKeys(oAuthUrl);
	}

	@FindBy(id = "btnSave")
	private WebElement OAuthSaveBtn;

	public void OAuthSaveBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave"))).click();
	}

	@FindBy(xpath = "//a[.='rere']")
	private WebElement OAuthNameSaved;

	public boolean isOAuthSaved() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='rere']")));
		OAuthNameSaved.isDisplayed();
		return true;
	}

	@FindBy(id = "ohrmList_chkSelectRecord_rere")
	private WebElement OAuthToBeDelete;

	public void OAuthToBeDelete() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("ohrmList_chkSelectRecord_rere")));
		OAuthToBeDelete.click();
	}

	@FindBy(id = "btnDelete")
	private WebElement OAuthDeleteBtn;

	public void OAuthDeleteBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnDelete")));
		OAuthDeleteBtn.click();
	}

	@FindBy(id = "dialogDeleteBtn")
	private WebElement OAuthDeleteOkBtn;

	public void OAuthDeleteOkBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("dialogDeleteBtn")));
		OAuthDeleteOkBtn.click();
	}

	@FindBy(xpath = "//div[@id='content']//div[@class='inner']/script[1]")
	private WebElement messageSuccessFadable;

	public boolean isOAuthDeleted() {
		messageSuccessFadable.isDisplayed();
		return true;
	}


//leave
	@FindBy(xpath = "//b[.='Leave']")
	private WebElement leaveBtn;

	public void leaveBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[.='Leave']"))).click();
	
	}

	@FindBy(id = "menu_leave_assignLeave")
	private WebElement leaveAssignBtn;

	public void leaveAssignBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_leave_assignLeave"))).click();
	}

	@FindBy(id = "assignleave_txtEmployee_empName")
	private WebElement xLeaveAssignName;

	public void xleaveAssignName(String xEmployeeNameToLeave) {	
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("assignleave_txtEmployee_empName")));
		xLeaveAssignName.clear();
		xLeaveAssignName.sendKeys(xEmployeeNameToLeave);
	}

	@FindBy(xpath = "//input[@id='assignleave_txtEmployee_empName']")
	private WebElement leaveAssignName;

	public void tleaveAssignName(String employeeNameToLeave) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='assignleave_txtEmployee_empName']")));
		leaveAssignName.clear();
		leaveAssignName.sendKeys(employeeNameToLeave);
	}

	public void leaveType() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("assignleave_txtLeaveType")));
		Select leaveType = new Select(webDriver.findElement(By.id("assignleave_txtLeaveType")));
		leaveType.selectByVisibleText("Emergency Leave");

	}

	@FindBy(id = "assignleave_txtFromDate")
	private WebElement leaveAssignFromDate;

	public void leaveAssignFromDate(String leaveFromDate) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("assignleave_txtFromDate")));
		leaveAssignFromDate.clear();
		leaveAssignFromDate.sendKeys(leaveFromDate);
		leaveAssignFromDate.sendKeys(Keys.ENTER);
	}

	@FindBy(id = "assignleave_txtToDate")
	private WebElement leaveAssignToDate;

	public void leaveAssignToDate(String leaveToDate) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("assignleave_txtToDate")));
		leaveAssignToDate.clear();
		leaveAssignToDate.sendKeys(leaveToDate);
		leaveAssignToDate.sendKeys(Keys.ENTER);
	}

	public void partialDays() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("assignleave_partialDays")));
		
		Select leaveType = new Select(webDriver.findElement(By.id("assignleave_partialDays")));
		leaveType.selectByValue("all");

	}

	public void durationDays() {
	
		new WebDriverWait(webDriver, 20).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[@id='assignleave_firstDuration_duration']")));
		Select durationDays = new Select(webDriver.findElement(By.id("assignleave_duration_duration")));
		durationDays.selectByVisibleText("Specify Time");

	}


	@FindBy(id = "assignleave_txtComment")
	private WebElement textCommentLeave;

	public void textCommentLeave(String commentLeave) {
		
		new WebDriverWait(webDriver, 20).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='assignleave_txtComment']")));
		textCommentLeave.sendKeys(commentLeave);
	}

	@FindBy(id = "assignBtn")
	private WebElement assignBtn;

	@FindBy(id = "confirmOkButton")
	private WebElement OkBtn;

	public void assignBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("assignBtn"))).click();
	

		if (OkBtn.isDisplayed()) {
			new WebDriverWait(webDriver, 20)
			.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmOkButton"))).click();
		}

	}

	@FindBy(css = "[for='assignleave_txtEmployee_empName']")
	private WebElement isAssignErrorAppear;

	public String assignErrorExp() {
		return "Invalid";
	}

	public String assignErrorAct() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[for='assignleave_txtEmployee_empName']")));
		return isAssignErrorAppear.getText();
	}

	@FindBy(id = "leaveList_chkSearchFilter_checkboxgroup_allcheck")
	private WebElement allCheckBtn;

	public void allCheckBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")));
		allCheckBtn.click();
	}

	@FindBy(id = "leaveList_txtEmployee_empName")
	private WebElement searchNameLeave;

	public void searchNameLeave(String fullNameLeave) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("leaveList_txtEmployee_empName")));
		searchNameLeave.clear();
		searchNameLeave.sendKeys(fullNameLeave);

	}

	@FindBy(id = "btnSearch")
	private WebElement searchLeaveBtn;

	public void searchLeaveBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSearch")));
		searchLeaveBtn.click();
	}

	@FindBy(xpath = "//a[.='kim jong un']")
	private WebElement isResultLeaveName;

	public String expResultLeaveName() {
		return "kim jong un";
	}

	public String actResultLeaveName() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='kim jong un']")));
		return isResultLeaveName.getText();
	}
	
	@FindBy(xpath = "//div[@class='inner']/script[1]")
	private WebElement isSuccessLeaveAppear;

	public boolean isSuccessLeaveAppear() {
		isSuccessLeaveAppear.isDisplayed();
		return true;
	}
	

//Time	
	@FindBy(xpath = "//b[.='Time']")
	private WebElement timeBtn;

	public void timeBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[.='Time']")));
		timeBtn.click();
	}

	@FindBy(id = "employee")
	private WebElement timeEmployeeName;

	public void timeEmployeeName(String employeeName) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("employee")));
		timeEmployeeName.sendKeys(employeeName);
	}

	@FindBy(id = "btnView")
	private WebElement timeViewBtn;

	public void timeViewBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnView")));
		timeViewBtn.click();
	}

	@FindBy(id = "btnAddTimesheet")
	private WebElement AddTimesheetBtn;

	public void AddTimesheetBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnAddTimesheet")));
		AddTimesheetBtn.click();
	}

	@FindBy(id = "menu_attendance_Attendance")
	private WebElement attendanTimeBtn;

	public void attendanTimeBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_attendance_Attendance")));
		attendanTimeBtn.click();
	}

	public void punchInOutBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_attendance_punchIn']"))).click();
	}

	@FindBy(id = "btnPunch")
	private WebElement punchBtn;

	public void punchBtn() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnPunch")));
		punchBtn.click();
	}

	@FindBy(id = "note")
	private WebElement notePunch;

	public void notePunchIn(String punchInNote) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("note")));
		notePunch.sendKeys(punchInNote);
	}

	public void notePunchOut(String punchOutNote) {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("note")));
		notePunch.sendKeys(punchOutNote);
	}


	@FindBy(css = "#punchTimeForm li:nth-of-type(2) > label:nth-of-type(2)")
	private WebElement punchInNotes;

	public String punchInNotesAct() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#punchTimeForm li:nth-of-type(2) > label:nth-of-type(2)")));
		return punchInNotes.getText();
	}

	public String punchInNotesExp() {
		
		return "on time";
	}
	

	@FindBy(xpath = "//div[@class='inner']/script[1]")
	private WebElement succesPunchOut;

	public boolean isPunchOutSuccess() {
		succesPunchOut.isDisplayed();
		return true;
	}
	

	public boolean isPunchInTitleAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Punch In']"))).isDisplayed();
		return true;
	}
	

	public boolean isPunchOutTitleAppear() {
		new WebDriverWait(webDriver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Punch In']"))).isDisplayed();
		return true;
	}

}
