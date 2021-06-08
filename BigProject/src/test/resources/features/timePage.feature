@Time
Feature: user can punch in and punch out

	@puncInOut 
	Scenario: User successfully punch in & punch out 
		Given User 9 on homepage with authorization using "Admin" as username & "s3Kol4HQA!*" as password 
		When User 9 click time button & click attendance button & click punch in button 
		And User input "on time" as punchInNote & click punch in button
		Then User succesfully punch in
		Then User input "return" as punchOutNote & click punch out button
		Then User succesfully punch out
	
	
