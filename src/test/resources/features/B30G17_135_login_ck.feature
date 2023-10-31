@B30G17-155
Feature: Login feature

	
	@B30G17-149
	Scenario Outline: Verify users can log in with the valid credentials
		Given user is on the login page
		    When user enters valid credentials "<Username>" and "<Password>"
		    Then the user should be logged in successfully
		    Examples:
		
		      | Username | Password |
		      |hr3@cydeo.com|UserUser|
		      |helpdesk2@cydeo.com|UserUser|
		      |marketing1@cydeo.com|UserUser|

	@hrLogin
	 Scenario:
		Given user is on the login page
		When "hr" user enters with valid credential
		Then the user should be logged in successfully
#		When "Marketing" enters with valid credential

#	@helpdeskLogin
#	Scenario:
#		Given user is on the login page
#		When "helpdesk" enters with valid credential
#		Then the user should be logged in successfully
#
#	@marketingLogin
#	Scenario:
#		Given user is on the login page
#		When "marketing" enters with valid credential
#		Then the user should be logged in successfully
#
#
#	@B30G17-151
#	Scenario Outline: Verify users cant log in with the invalid credentials
#		Given user is on the login page
#		    When user enters invalid credentials "<Username>" and "<Password>"
#		    Then the user should see Incorrect login or password message
#		    Examples:
#
#		      | Username | Password |
#		      |hr3@cydeo.com|Useruser|
#		      |helpdesk12@cydeo.com|Userser|
#		      |marketing@cydeo.com|Useruser|

	
	@B30G17-152
	Scenario: verify  Please fill out this field error message 
		Given user is on the login page
		When user click login button without credentials
		Then user should see Please fill out this field error message	

	
	@B30G17-153
	Scenario: verify Remember Me link exists and is clickable on the login page
		Given user is on the login page
		Then user should see  Remember Me link and be able to click the box	

	
	@B30G17-154
	Scenario Outline: verify  the password in bullet signs by default
		Given user is on the login page
		When user enters "<password>"
		Then user should see the password in bullet signs 
		    Examples: 
		    |password|
		    |UserUser|