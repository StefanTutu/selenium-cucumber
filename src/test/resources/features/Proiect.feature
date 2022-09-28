Feature: Project Scenarios

  Background: Access Test Page page

  @project

  Scenario: 1
    Given I navigate to https://testpages.herokuapp.com/styled/basic-html-form-test.html
    And I input text: Elena in the username input field
    And I input text: Password123 in the password input field
    And I input text: Notes in the comments input field
    And I click an element by the link text: Checkbox2
    And I click the radio button with label: Radio3
    And I select the options SelectionItem3 and SelectionItem4 in the Multiple Select Values drop down menu
    And I select the option DropDownItem6 in the Dropdown drop down menu
    When I click on submit button
#    Then I wait and check fields for submit action
    Then The expected username is username
    And The expected password is Password
    And The expected checkbox is checkBoxes
    And The expected radio button is radioButtons
    And The expected selected multiple value is multipleSelect
    And The expected dropdown option is dropdownOption


////////////////////////////////////////////////////////
  Scenario Outline: Submitting username and password
    Given I navigate to https://testpages.herokuapp.com/styled/basic-html-form-test.html    When I input text:<Username> in the Username input field
    And I input text:<Password> in the Password input field
    And I click on checkbox: <checkBoxes>
    And I click the radio button: <radioButtons>
    And I click on multiple select values: <multipleSelect>
    And I select the option: <dropdownOption> in the Dropdown menu
    And I click the submit button
    Then The expected username is <Username>
    And The expected password is <Password>
    And The expected checkbox is <checkBoxes>
    And The expected radio button is <radioButtons>
    And The expected selected multiple value is <multipleSelect>
    And The expected dropdown option is <dropdownOption>
    Examples:
      | Username   | Password| checkBoxes | radioButtons | multipleSelect | dropdownOption |
      | Andrei     | ast     | 1          | 1            | 1              | 1              |
      | Radu       | det     | 2          | 2            | 2              | 2              |
      | Andru      | dff     | 3          | 3            | 4              | 6              |
      | .          | dfr     | 3          | 3            | 4              | 6              |


