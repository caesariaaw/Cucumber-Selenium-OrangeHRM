@Admin
Feature: Search add and delete data on Admin Page

	
		@AddData 
		Scenario: Add new user data
			Given User 1 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
			When User 1 click Admin button and click add button to go to add user page
			And User select Admin as role & input "kim jong un" as employeeUserName & input "TinyWiniBity" as userName & input "s3Kol4HQA!*" as userPassword & input "s3Kol4HQA!*" as userRePass & click save button 
			Then User succesfully add new user data
	
		@SearchData
		Scenario: User verify user data entered exist
			Given User 2 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
			When User 2 click Admin button
			And User input "TinyWiniBity" as userName & click search button
			Then User get user data on the list
			
		@SearchRandomData
		Scenario: User looking for random data
			Given User 3 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
			When Users 3 click Admin button
			And User input "rere" as xUserNamee & click search button
			Then User get notFoundMessage on the list
		
			
		@regOAuthClient
		Scenario: User register OAuth client
			Given User 4 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
			When User 4 click Admin button & click configuration button & click register OAuth client button
			And User input "rere" as oAuthId & input "123" as oAuthSecret & input "[ https://orangehrm.github.io/orangehrm-api-doc ]." as oAuthUrl & click button save
			Then User successfully register OAuth client
			
		@deleteOAuthClient
		Scenario: User delete OAuth client data
			Given User 5 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password
			When User 5 click Admin button & click configuration button & click register OAuth client button
			And User click one of data to be delete & click ok button 
			Then User successfully delete OAuth client data
			
 