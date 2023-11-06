
 @B30G17-180
Feature: Default


	Background:
		Given "<User>" is on the login page

	@B30G17-174
	Scenario Outline:  Verify the users can log out from the app after clicking the “Log out” button.
		When   "<User>" enters valid credentials and logs in
		 And    User clicks on user profile name
		 And    User clicks on log out option
		 Then   User can log out
		Examples:
			| User      |
			| hr        |
			| helpdesk  |
			| marketing |


	@B30G17-178
	Scenario Outline:  Verify users see five options under the profile name.
		When   "<User>" enters valid credentials and logs in
		And    User clicks on user profile name
		Then    User sees the following options is displayed

			|My Profile             |
			|Edit Profile Settings  |
			|Themes                 |
			|Configure notifications|
			|Log out                |


		Examples:
			| User      |
			| hr        |
			| helpdesk  |
			| marketing |
