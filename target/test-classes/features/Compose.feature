Feature: New Message Feature

Background:
    Given User is on the outlook home page
    Then User clicks on the New Message Button
  	Then User must see the To button to send the message
    
@TC_001
 Scenario: TO Click Send Button without any recipent or any DATA an to check for the  error message
 	And User clicks on the send button 
 	Then error message should get displayed
 	
 @TC_002
  Scenario: To add a recipient and click send without any subject yet send
 	When User enters the recipient in the to field
 	And When User clicks on send button without any subject
 	Then a User prompt stating missing subject should get displayed
 	When User clicks on send button 
 	Then Message should get sent
 	
 	
 @Tc_003
 Scenario: To add a recipient and click send without any subject or body and do not send
 	When User enters the recipient in the to field
 	And When User clicks on send button without any subject
 	Then a User prompt stating missing subject should get displayed
 	When User clicks on do not send button
 	Then Message should not get sent
 	
 @TC_004
  Scenario: adding subject without body and sending msg should be sent
 	When User enters the recipient in the to field
 	And User enters the subject 
 	When User clicks on send button to send message
 	Then Message should get sent
 	
 	
 @TC_005
  Scenario: adding subject and body and sending msg should get sent
 		When User enters the recipient in the to field
 		And User enters the subject 
 		And User enters the body
 		When User clicks on send button to send message
 	   Then Message should get sent
 
 	
 	
 
 	
 	