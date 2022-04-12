Feature: Dress booking in Auomation application
@men
Scenario Outline: Login Page
Given user Launch The Application
When user Enters the "<username>" in UN Field
And user Enters the "<password>" in Pwd Field
Then user Clicks Login And Navigates To The MyAccount Page

Examples:
|username|password|
|Stark|123#|
|Mark|1234|
|12345@123.com|12345|
@women
Scenario: Search Dress
When user Clicks on Dresses
And user Clicks on Casual Dresses