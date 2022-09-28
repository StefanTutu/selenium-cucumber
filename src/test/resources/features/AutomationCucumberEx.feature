Feature: Automation Scenarios

  Background: Access Test Page page

  @secondcucumber

  Scenario: Handling Alerts
    Given I navigate to https://testpages.herokuapp.com/styled/alerts/alert-test.html
    When I click the first button
    Then I confirm the alert

  Scenario: Handling alerts 2
    Given I navigate to https://testpages.herokuapp.com/styled/alerts/alert-test.html
    When I click on second button
    And I confirm the alert
    Then the text: You clicked OK, confirm appears on the page


  Scenario: Handling alerts 3
    Given I navigate to https://testpages.herokuapp.com/styled/alerts/alert-test.html
    When I click on third button
    And I confirm the alert
    Then the text: any text appears on the page



