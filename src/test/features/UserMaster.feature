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
    |Dummy User Name|
    And I Click Multi Login Check Box
    And I Enter First Name
      |First Name|
      |Demo First Name|
    And I Enter Last Name
      |Last Name|
      |Demo Last Name|
    And I Enter Mobile Number
      |Mobile number|
      |9717559062|
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
    |User Name|
    |Dummy User Name|

  Scenario: Verify Update User Master is Working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    And I Click on User Master Link
    Then I click on User This Edit Button
      |User Name|
      |Dummy User Name|
    Then I Enter Update User Name
    |UserName|
    | update user name       |
    And I Click on Update User Button
    Then I check validate UserName in HTML Page
      |UserName|
      | update user name       |

