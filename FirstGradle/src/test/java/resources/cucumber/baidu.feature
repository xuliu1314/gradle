
Feature: Register a baiDu user 

Background:
	Given the page is open "https://passport.baidu.com/v2/?reg&tt=1521992892277&overseas=undefined&gid=B2CD3CB-E56D-4A02-A21B-D1ED22B752A6&tpl=mn&u=https%3A%2F%2Fwww.baidu.com%2F" 
	When I want to set my user name as "zhangsan131455" 
	When I want to set my mobile number as "18909204521 " 
	Then Set a login in password "xuan901111" 

@locateElement
Scenario: Register a new user in baidu 
	Then I agree the terms and condition 
	When I want to get the verification codes 
		
@dataTable	
Scenario Outline: Register two new user in baidu 
	Given the page is open "https://passport.baidu.com/v2/?reg&tt=1521992892277&overseas=undefined&gid=B2CD3CB-E56D-4A02-A21B-D1ED22B752A6&tpl=mn&u=https%3A%2F%2Fwww.baidu.com%2F" 
	Given I want to set my login in account as <userName> 
	When I want to set my register mobile number as <mobileNumber> 
	Then Set a register pass word as <passWord>
	 
	Examples: 
		| userName         | passWord   | mobileNumber|
		| "zhangsan131455" | "xuan901111" |18909204520  |
		| "zhangsan131457" | "xuan901112" |18909204521  |
		| "zhangsan131459" | "xuan901113" |18909204522  |
		
		
		



		
		
		
		
		
		
