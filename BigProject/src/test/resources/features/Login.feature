@Login
Feature: Activity Login 

	@negativeLogin 
	Scenario: User unsuccessfully log in 
		Given User on the login page 
		When User input authorization using "Adminss" as Xusername & "s3Kol4HQA!*" as Xpassword 
		And User click on the LogIn button 
		Then User unsuccesfully log in and get "Invalid credential" as errormessage on screen
	
		@positiveLogin 
	Scenario: User successfully log in 
		Given User on OrangeHRM login page
		When User input authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		And User click Log in button
		Then User succesfully log in and goes to home page of OrangeHRM
