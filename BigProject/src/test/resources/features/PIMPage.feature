@PIM
Feature: User can add new employee and search employee

	@addEmployee 
	Scenario: add and complete data of employee 
		Given User 10 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 10 click PIM button & click add employee button
		And User input "winnie" as firstName & input "the" as middleName & input "pooh" as lastName & input "00192" as id_Employee & click checkBox 
		And User input "winiedelalapo" as unameEmploy & input "s3Kol4HQA!*" as passEmploy & input "s3Kol4HQA!*" as rePassEmploy & click save btn & click edit btn
		And User input "98882102125" as SIMNumb & click genderChckBox & select nationality & input "327222102990000" as otherID & input "2024-05-21" as SIMExpDate & select marital status & input "1999-05-21" as BirthDate & click save btn
		Then User succesfully add employee
		
	@searchEmployee
	Scenario: search employee 
		Given User 11 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 11 click PIM button
		And User input "kim jong un" as fullName & select include employe & click search btn 
		Then User get employee on the list
		
	
	

