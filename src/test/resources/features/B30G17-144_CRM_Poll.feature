@B30G17-166
Feature: Default


  @B30G17-159
  Scenario Outline: Verify default recipient is set to "All employees"
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    Then The delivery should be addressed to "All employees" by default

    Examples:
      | user      |
      | HR        |
      | Marketing |
      | helpDesk  |

  @wipL
    @B30G17-160
  Scenario Outline: Verify User should be able to create a poll by adding questions and multiple answers
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user adds a message "<text>"
    And user adds a question "How is your project going?"
    And user adds multiple answers "Great!" and "Can't do it"
    And user click the Send Button
    Then user should be able to create a poll

    Examples:
      | user      | text    |
      | HR        | please  |
      | Marketing | tell me |
      | helpDesk  | work    |


  @B30G17-161
  Scenario Outline: Verify user should be able to select the “Allow multiple choice” checkbox
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user click the Send Button
    Then user should be able to select -Allow multiple choice- checkbox

    Examples:
      | user      |
      | HR        |
      | Marketing |
      | helpDesk  |


  @B30G17-162
  Scenario Outline: Verify user sees error message: "The message title is not specified"
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user adds one recipient
    And user adds a question "How are you feeling?"
    And user adds one answer "Great!"
    And user click the Send Button
    Then user should see Error message: "The message title is not specified"

    Examples:
      | user      |
      | HR        |
      | Marketing |
      | helpDesk  |


  @B30G17-163
  Scenario Outline: Verify user sees error message: "Please specify at least one person."
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user adds a message "<text>"
    And user removes the default recipient
    And user adds a question "Can I help?"
    And user adds one answer "No"
    And user click the Send Button
    Then user should see Error message: "Please specify at least one person."

    Examples:
      | user      |text|
      | HR        | hi |
      | Marketing |bye |
      | helpDesk  |well|


  @B30G17-164
  Scenario Outline: Verify user sees error message: "The question text is not specified."
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user adds a message "<text>"
    And user adds one recipient
    And user adds one answer "No"
    And user click the Send Button
    Then user should see Error message: "The question text is not specified."

    Examples:
      | user      |text|
      | HR        | hello|
      | Marketing |wow   |
      | helpDesk  |tie   |


  @B30G17-165
  Scenario Outline: Verify user sees Error message: "The question "........." has no answers."
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user adds a message "<text>"
    And user adds one recipient
    And user adds a question "<question>"
    And user click the Send Button
    Then user should see Error message: "The question \"<question>\" has no answers."

    Examples:
      | user      | question                          |text|
      | HR        | How is your project coming along? |honestly|
      | Marketing | How is your project coming along? |tell me |
      | helpDesk  | How is your project coming along? |please  |

  @wipL
    @B30G17-168
  Scenario Outline: Verify user can create a poll with multiple answers and allow multiple choice
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user adds a message "<text>"
    And user adds a question "What languages do you know?"
    And user adds multiple answers "Java" and "Gherkin"
    And user should be able to select -Allow multiple choice- checkbox
    And user click the Send Button
    Then user should be able to create a poll
    Then user should be able to select multiple answers from the poll

    Examples:
      | user      |text|
      | HR        |honestly|
      | Marketing | tell mee|
      | helpDesk  |you rock |

  @wipL
    @B30G17-169
  Scenario Outline: Verify user can create a poll with multiple questions and allow multiple choice only on one question
    Given "<user>" user enters with valid credential
    When user click on Activity Stream
    And user click on Poll tab
    And user adds a message "<text>"
    And user adds a question "Are you excited to graduate"
    And user adds multiple answers "Can't wait!" and "Mixed feeling"
    And user should be able to select -Allow multiple choice- checkbox
    And user adds a second question "Do you like Java"
    And user adds multiple answers under the second question "Yes" and "No"
    And user click the Send Button
    Then user should be able to create a poll
    Then user should be able to select multiple answers from the first question
    Then user should be able to select only one answer from the second question

    Examples:
      | user      |text|
      | HR        |wow |
      | Marketing |please work|
      | helpDesk  |almost there|