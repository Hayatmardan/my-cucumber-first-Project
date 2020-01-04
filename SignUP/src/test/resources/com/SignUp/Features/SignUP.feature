Feature: abc

  @Test
  Scenario: abc login
    Given that I should be able to do abc
    And verify the title "Facebook - Log In or Sign Up"
    #Then i should be able enter firstname
    #And i should be able enter lastname
    #And i should enter email address
    #And i should enter my password
    #Given that I should be able to do abc
    Then i should be able enter "hayat" in First name field
    And i should be able enter "ullah" in last name field
    And i should enter "email address" in email field
    And i should enter my "password"
  
  @Test
  Scenario: select my date of birth
    Given that I should be able to selet month of my DOB
    Then i should be able to select  Date of my DOB
    And i should be able to select Year of my DOB
@Test
  Scenario: Select Gender
    Given i should be adle to select male
@Test
  Scenario: click SignUp bottan
    Given i should be able to click SignUp bottan
