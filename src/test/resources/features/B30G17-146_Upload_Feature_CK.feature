@B30G17-173
Feature: File and Image Upload feature

	Background:
		Given user is on the login page
		When user enters valid credentials "hr1@cydeo.com" and "UserUser"
		Then the user should be logged in successfully



	@B30G17-170
		Scenario: User interacts with file and image upload feature
			When user clicks on the MORE tab
		  	And user clicks on Appreciation section
		  	And user clicks upload files section
		  	And user sends file to Upload field
		  	And user  Uploads files and images
		    Then the file should be uploaded successfully and be displayed under Attached files and images section with  type
		    	|.pdf|
		    	|.txt|
		    	|.jpeg|
		    	|.png|
		    	|.docx|

	@B30G17-171
		Scenario: User inserts the file into the text area
		    Given user is on the home page and and the file is uploaded successfully
		    When the user clicks on the Insert in text section
		    Then the file should be inserted into the text area


	@B30G17-172
	Scenario: User removes file before sending
		Given user is on the home page and and the file is uploaded successfully
		When the user clicks on the Insert in text section
		When the file should be inserted into the text area
		When the user click X button
		Then the file should be remove

#	@B30G17-172
#		Scenario: User removes file before sending
#		    Given user is on the home page and and the file is uploaded successfully and displayed in text area
#			When the user clicks on the X button next to the In text section
#		    Then the file should be removed from the text area and Attached files and images area