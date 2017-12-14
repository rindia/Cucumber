package pages;

import framework.base.BasePage;
import framework.utilities.WebElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserMasterPage extends BasePage {

    /*Start UserMaster Path*/
    private static final String userMasterLinkByID = "UserSummary";
    private static final String rgistartionBtnXpath = "//input[starts-with(@value,'Register')]";
    private static final String userNameByID = "saveUserName";
    private static final String multiLoginID = "saveMultiLogin";
    private static final String firstNameID = "saveUserFirstName";
    private static final String lastNameID = "saveUserLastName";
    private static final String userMobileID = "saveUserMobile";
    private static final String selectUserRoleID = "userRole";
    private static final String passwordID = "password";
    private static final String cnfrmPasswordID = "cnfrmPassword";
    private static final String activeInactiveXpath = "//input[@name='editIsActive']";
    private static final String saveUserBtnXpath = "//button[@onclick='saveUserDetails()']";
    private static final String tableXpath = ".//*[@id='userTable']/tbody";
    /*End UserMaster Path*/

    /*Start Edit UserMaster Path*/
    private static final String editBtnXpath = "//button[@onclick='getRowData(this.id)']";
    private static final String editUserFirstNameXpath = "editUserFirstName";
    private static final String editUserLastNameXpath = "editUserLastName";
    private static final String updateUserBtnXpath = "//input[@onclick='editUserDetails()']";
    /*End Edit UserMaster Path*/

    /*Start Add UserMaster Webelement*/
    @FindBy(how = How.ID, using = userMasterLinkByID)
    private WebElement userMasterLink;

    @FindBy(how = How.XPATH, using = rgistartionBtnXpath)
    private WebElement rgistartionBtn;

    @FindBy(how = How.ID, using = userNameByID)
    private WebElement userName;

    @FindBy(how = How.ID, using = multiLoginID)
    private WebElement multiLogin;

    @FindBy(how = How.ID, using = firstNameID)
    private WebElement firstName;

    @FindBy(how = How.ID, using = lastNameID)
    private WebElement lastName;

    @FindBy(how = How.ID, using = userMobileID)
    private WebElement userMobile;

    @FindBy(how = How.ID, using = selectUserRoleID)
    private WebElement selectUserRole;

    @FindBy(how = How.ID, using = passwordID)
    private WebElement password;

    @FindBy(how = How.ID, using = cnfrmPasswordID)
    private WebElement cnfrmPassword;

    @FindBy(how = How.XPATH, using = activeInactiveXpath)
    private WebElement activeInactive;

    @FindBy(how = How.XPATH, using = saveUserBtnXpath)
    private WebElement saveUserBtn;
     /*End Add UserMaster Webelement*/

      /*Start Add UserMaster Functions*/
      public void clickUserMasterLink()
      {
         WebElementExtension.presenceOfElementLocated(By.id(userMasterLinkByID),10);
          userMasterLink.click();
      }
      public void clickAddUserBtn()
      {
          WebElementExtension.presenceOfElementLocated(By.xpath(rgistartionBtnXpath),10);
          rgistartionBtn.click();
      }
      public void enterUserName(String username)
      {
          WebElementExtension.presenceOfElementLocated(By.id(userNameByID),5);
          userName.sendKeys(username);
      }
      public void checkMultilogin()
      {

          WebElementExtension.checkBox(multiLogin);
      }
      public void enterFirstname(String firstname)
      {

          firstName.sendKeys(firstname);
      }

      public void enterLastName(String lastname)
      {
          lastName.sendKeys(lastname);
      }

      public void enterMobileNumber(String number)
      {
          userMobile.sendKeys(number);
      }
      public void selectRole(String role)
      {
          WebElementExtension.SelectDropDownListByName(By.id(selectUserRoleID),role);
      }
      public void enterPassword(String pass)
      {
          password.sendKeys(pass);
      }
      public void enterConPassword(String cPass)
      {
          cnfrmPassword.sendKeys(cPass);
      }
      public void selectActive(String value)
      {
          WebElementExtension.radioButtonValue(value,By.xpath(activeInactiveXpath));
      }
      public void clickSaveBtn()
      {
          saveUserBtn.click();
          WebElementExtension.alert("ok");
          WebElementExtension.alert("ok");
      }

      public void checkData(String data) throws InterruptedException {
          WebElementExtension.presenceOfElementLocated(By.xpath("//div[@class='x_title']/h2"),10);
          WebElementExtension.verifyTableData(By.xpath(tableXpath),data);
      }


}
