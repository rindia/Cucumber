Feature: TMS - Product Master Features
  Scenario: Verify Product Master is Working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    Then I Click on Product Master link
    Then I click On Add Prodcut Button
    And I Enter Product Name
    |ProductName|
    |DemoProduct           |
    And I Enter Product Code
      |ProductCode|
      |123456           |
    And I Select Active/Inactive
      |Active|
      |1|
    Then I click on Add Product Submit Button
    Then I Check Data Is Saved In HTML Table
    |CheckData|
    |DemoProduct|

  Scenario: Verify Update Product Master is Working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    Then I Click on Product Master link
    Then I click on This Product Edit Button
      | ProductName |
      | DemoProduct|
    Then I Update Plant Code Value
    |PlantCode|
    | 98798        |
    And I click Update Submit Button


  Scenario: Verify Delete Product Master is Working
    When I Open PLMS Url
    Then I See Login Page
    Then I Select Plant Type
    Then I Enter Admin Correct UserName and Password userName
      | UserName | Password |
      | jkCement | admin    |
    And I Click On Login Button
    Then I Click on Master Tab
    Then I Click on Product Master link
    Then I click on This Product Delete Button
      | ProductName |
      | DemoProduct|
    Then I click Yes This Button