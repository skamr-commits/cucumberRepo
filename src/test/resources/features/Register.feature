#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Register
Feature: Register a new user
  I want to use this template for my feature file

  @Smoke
  Scenario Outline: Register a new user
    Given I am on the Home Page
    And I click on Register
    When I enter my "<FirstName>", "<LastName>", "<Email>", "<Password>"
    Then I am registered successfully

    Examples: 
      | FirstName | LastName | Email                | Password    |
      | Test      | Tester   | tester1212@gmail.com | Testing432! |
      
  #@Smoke
  #Scenario Outline: Register an existing user
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
