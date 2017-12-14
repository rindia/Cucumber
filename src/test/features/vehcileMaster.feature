Feature: PLMS - Vehicle Master Features
  Scenario: Verify Vehicle Master is working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      |UserName|Password|
      |jkCement        |  admin      |
    And I Click On Login Button
    Then I Click On Vehicle Tab
    And I Click On Vehicle Master Link
    And  I See Text Present on Page
    Then I Click On Add New vehicle button
    And I Enter Vehicle Number
    And I Enter Model
    And I Select Vehicle Type
    And I Select Raw Material
    And I Select No of Wheels
    And I Select Fleet Type
    And I Select Transporter Name
    And I Select Insurance Policy Expiry Date
    And I Select Fitness Renewal Date From
    And I Select Fitness Renewal Date To
    And I Enter Pollution certificate number
    And I Select Pollution Expiry Date
    And I Enter Insurance Policy Number
    And I Select Year Of Manufacturing
    And I Check Is Canter
    Then I Click On Save Button
    Then I Verify Data in Html Table
      |VehicleNumber|
      |Hr7798700    |


    Scenario: Verify Update Vehicle Master is working
      When I Open PLMS Url
      Then I See Login Page
      Then I Select Plant Type
      Then I Enter Admin Correct UserName and Password userName
        |UserName|Password|
        |jkCement        |  admin      |
      And I Click On Login Button
      Then I Click On Vehicle Tab
      And I Click On Vehicle Master Link
      Then I Click On Edit Against Vehicle number
      |Vehicle_number|
      |DL78TR09|
      Then I Update Model Number
        |ModelNoUpdated|
        |5489854|
      Then I Choose TransporterName
      And I click On Update Button




