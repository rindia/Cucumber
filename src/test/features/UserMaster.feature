Feature: TMS - User Master Features

  Scenario: Verify User Master is Working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    And I Click on User Master Link
    Then I click on Register User Button
    And I Enter User Name
    |User Name|
    |DemoUser|
    And I Click Multi Login Check Box
    And I Enter First Name
      |First Name|
      |Demo First Name|
    And I Enter Last Name
      |Last Name|
      |Demo Last Name|
    And I Enter Mobile Number
      |Mobile number|
      |9897120123|
    And  I Select Role
      |Role|
      |Admin|
    And I Enter Password
      |Password|
      |123456|
    And I Enter Confirm Password
      |Cpassword|
      |123456|
    And I Select Active User Registration
      |Active|
      |1|
    Then I click on User Registration Submit Button
    And I check Registered User Should Visibile in HTML Table
    |First Name|
    |Demo First Name|
