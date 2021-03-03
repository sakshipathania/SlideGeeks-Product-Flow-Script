@sign_in_via_email_with_Incorrect_Data
Feature: paid User Sign In via Email
Scenario: Test Sign in for paid User via Email 

Given user is already on Home Page of Geeks Website iii
Then user navigates to login page iii
Then user login to website with invalid email and password iii
Then validate the error message iii
Then user login to website with valid email and password iii
