@Smoke 
Feature: OrangeHRM Project 

	Description: Login to OrangeHRM

Scenario: Login Practice 

	Given open a browser and go to the website 
	When user verify the page title "OrangeHRM" 
	And user enter valid username and password
    And Click the Login butten 
    Then User Logout 


