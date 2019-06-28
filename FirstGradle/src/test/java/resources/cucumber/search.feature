
Feature: Search a word in chrome 

Background: 
	Given the page is open "http://www.google.com" 
	
Scenario Outline: Task1-search a string in cucumber 
	When I search for <word> 
	
	Examples: 
		|    word     |
		| "microsoft" |
		|  "apple"    |
    