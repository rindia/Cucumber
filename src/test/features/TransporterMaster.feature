Feature: TMS - Transporter Master features

  Scenario: Verify Driver Master is working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Transporter Tab
    When I click on Transporter link
    Then I Click on Add Transporter Button
    And I Enter Transporter name
      | Transporter Name  |
      | Dummy Transporter |
    And I Enter Transporter code
      | Transporter Code |
      | 120123           |
    And I Enter Owner name
      | Owner  Name      |
      | Dummy Owner Name |
    And I Enter Owner Mobile number
      | Owner Mobile Number |
      | 1234569845          |
    And I Enter Owner address
      | Owner Address |
      | Dummy Address |
    And I Enter Owner DOB Date
      | DOB        |
      | 01/02/1989 |

    Then I Select Allocation Active/Inactive
      | Allocation Status |
      | 1            |
    And I Enter Allocation Percentage
      | Allocation Percentage |
      | 35                    |
    And I Enter Alternative Contact Number
      | Alternative Contact Number |
      | 7852365478                 |
    And I Select Country
      | Country |
      | India   |
    And I Select State
      | State     |
      | Rajasthan |
    And I Select City
    |city|
    |Ghaziabad|
    And I Enter Pin code
      | Pin Code |
      | 5498965  |
    And I Enter Contact Person Name
      | Contact Person Name       |
      | Dummy Contact Person Name |
    And I Enter Contact Number
      | Contact Number |
      | 5647895214     |
    And I Enter Email ID
      | Email ID        |
      | dummy@gmail.com |

    And I Select Active/Inactive Transporter


    When I click on Transporter Submit Button
    Then I Validate Data in HTML Table
      | Transporter Name  |
      | Dummy Transporter |




