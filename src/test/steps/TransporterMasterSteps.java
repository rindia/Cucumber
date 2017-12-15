package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.Base;
import framework.utilities.CucumberUtil;
import pages.TransporterMasterPage;

public class TransporterMasterSteps extends Base {
    @Then("^I Click on Transporter Tab$")
    public void iClickOnTransporterTab() throws Throwable {
        CurrentPage = GetInstance(TransporterMasterPage.class);
        CurrentPage.As(TransporterMasterPage.class).clickTransporterTab();
    }

    @When("^I click on Transporter link$")
    public void iClickOnTransporterLink() throws Throwable {
        CurrentPage.As(TransporterMasterPage.class).clickTransporterLink();
    }

    @Then("^I Click on Add Transporter Button$")
    public void iClickOnAddTransporterButton() throws Throwable {
        CurrentPage.As(TransporterMasterPage.class).clickAddTransporterBtn();
    }

    @And("^I Enter Transporter name$")
    public void iEnterTransporterName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterTransporterName(CucumberUtil.GetCellValue("Transporter Name"));
    }

    @And("^I Enter Transporter code$")
    public void iEnterTransporterCode(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterTransporterCode(CucumberUtil.GetCellValue("Transporter Code"));
    }

    @And("^I Enter Owner name$")
    public void iEnterOwnerName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterOwnerName(CucumberUtil.GetCellValue("Owner  Name"));
    }

    @And("^I Enter Owner Mobile number$")
    public void iEnterOwnerMobileNumber(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterOwnerMobile(CucumberUtil.GetCellValue("Owner Mobile Number"));
    }

    @And("^I Enter Owner address$")
    public void iEnterOwnerAddress(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterOwneraddress(CucumberUtil.GetCellValue("Owner Address"));
    }

    @And("^I Enter Owner DOB Date$")
    public void iEnterOwnerDOBDate(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterDOB(CucumberUtil.GetCellValue("DOB"));
    }

    @Then("^I Select Allocation Active/Inactive$")
    public void iSelectAllocationActiveInactive(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).selectTransporterAllocation("1");
    }

    @And("^I Enter Allocation Percentage$")
    public void iEnterAllocationPercentage(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterPercentage(CucumberUtil.GetCellValue("Allocation Percentage"));
    }

    @And("^I Enter Alternative Contact Number$")
    public void iEnterAlternativeContactNumber(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterAlterNativeNumber(CucumberUtil.GetCellValue("Alternative Contact Number"));
    }

    @And("^I Select Country$")
    public void iSelectCountry(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).selectCountry(CucumberUtil.GetCellValue("Country"));

    }

    @And("^I Select State$")
    public void iSelectState(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).selectState(CucumberUtil.GetCellValue("State"));
    }

    @And("^I Enter Pin code$")
    public void iEnterPinCode(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterPinCode(CucumberUtil.GetCellValue("Pin Code"));
    }

    @And("^I Enter Contact Person Name$")
    public void iEnterContactPersonName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterContactPersonName(CucumberUtil.GetCellValue("Contact Person Name"));
    }

    @And("^I Enter Contact Number$")
    public void iEnterContactNumber(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterContactNumber(CucumberUtil.GetCellValue("Contact Number"));
    }

    @And("^I Enter Email ID$")
    public void iEnterEmailID(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).enterEmail(CucumberUtil.GetCellValue("Email ID"));
    }


    @When("^I click on Transporter Submit Button$")
    public void iClickOnTransporterSubmitButton() throws Throwable {
        CurrentPage.As(TransporterMasterPage.class).clickSaveBtn();
    }

    @Then("^I Validate Data in HTML Table$")
    public void iValidateDataInHTMLTable(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).checkData(CucumberUtil.GetCellValue("Transporter Name"));
    }

    @And("^I Select City$")
    public void iSelectCity(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(TransporterMasterPage.class).selectCity(CucumberUtil.GetCellValue("city"));
    }

    @And("^I Select Active/Inactive Transporter$")
    public void iSelectActiveInactiveTransporter() throws Throwable {
       CurrentPage.As(TransporterMasterPage.class).selectActive("1");
    }
}
