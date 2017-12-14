package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import framework.base.Base;
import framework.utilities.CucumberUtil;
import gherkin.lexer.Da;
import pages.UserMasterPage;

public class UserMasterSteps extends Base {
    @And("^I Click on User Master Link$")
    public void iClickOnUserMasterLink() throws Throwable {
        CurrentPage = GetInstance(UserMasterPage.class);
        CurrentPage.As(UserMasterPage.class).clickUserMasterLink();
    }


    @Then("^I click on Register User Button$")
    public void iClickOnRegisterUserButton() throws Throwable {
        CurrentPage.As(UserMasterPage.class).clickAddUserBtn();
    }

    @And("^I Enter User Name$")
    public void iEnterUserName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).enterUserName(CucumberUtil.GetCellValue("User Name"));
    }

    @And("^I Click Multi Login Check Box$")
    public void iClickMultiLoginCheckBox() throws Throwable {
        CurrentPage.As(UserMasterPage.class).checkMultilogin();
    }

    @And("^I Enter First Name$")
    public void iEnterFirstName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).enterFirstname(CucumberUtil.GetCellValue("First Name"));
    }

    @And("^I Enter Last Name$")
    public void iEnterLastName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).enterLastName(CucumberUtil.GetCellValue("Last Name"));
    }

    @And("^I Enter Mobile Number$")
    public void iEnterMobileNumber(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).enterMobileNumber(CucumberUtil.GetCellValue("Mobile number"));
    }

    @And("^I Select Role$")
    public void iSelectRole(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).selectRole(CucumberUtil.GetCellValue("Role"));
    }

    @And("^I Enter Password$")
    public void iEnterPassword(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).enterPassword(CucumberUtil.GetCellValue("Password"));
    }

    @And("^I Enter Confirm Password$")
    public void iEnterConfirmPassword(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).enterConPassword(CucumberUtil.GetCellValue("Cpassword"));
    }

    @And("^I Select Active User Registration$")
    public void iSelectActiveUserRegistration(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).selectActive(CucumberUtil.GetCellValue("Active"));
    }

    @Then("^I click on User Registration Submit Button$")
    public void iClickOnUserRegistrationSubmitButton() throws Throwable {
        CurrentPage.As(UserMasterPage.class).clickSaveBtn();
    }

    @And("^I check Registered User Should Visibile in HTML Table$")
    public void iCheckRegisteredUserShouldVisibileInHTMLTable(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(UserMasterPage.class).checkData(CucumberUtil.GetCellValue("First Name"));
    }
}
