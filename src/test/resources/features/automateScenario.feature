Feature: Example automation with cucumber

  Background: Access DD page and clear cookies
    Given The Deloitte Digital page is accessed
    And I wait to dismiss the cookies dialog

  @myFirstCucumber
  Scenario: Perform automation task
    When I click an element by the link text: Contact Us
And I input text: Elena in the First Name input field
And I input text: Dede in the Last Name input field
And I input text: email@example.com in the Email input field
And I select the option: Hux in the Topic drop down menu
And I click the radio button with label: Yes




