package steps;

import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import framework.base.Base;
import framework.config.Settings;
import framework.utilities.CucumberUtil;
import framework.utilities.ExcelUtil;
import framework.utilities.WebElementExtension;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import pages.VehicleMasterPage;

public class VehicleMasterSteps extends Base {
    @Then("^I Click On Vehicle Tab$")
    public void iClickOnVehicleTab() throws Throwable {
        CurrentPage = GetInstance(VehicleMasterPage.class);
        CurrentPage.As(VehicleMasterPage.class).clickvehicleTab();
        try {
            ExcelUtil vehcileExcel = new ExcelUtil(Settings.VehcileMasterExcelSheet, "vehicle");

        } catch (Exception e) {

        }


    }

    @And("^I Click On Vehicle Master Link$")
    public void iClickOnVehicleMasterLink() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).clickvehicleMaster();

    }

    @And("^I See Text Present on Page$")
    public void iSeeTextPresentOnPage() throws Throwable {

        CurrentPage.As(VehicleMasterPage.class).isDisplayed();
    }

    @Then("^I Click On Add New vehicle button$")
    public void iClickOnAddNewVehicleButton() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).clickAddNewvehicleBtn();
    }

    @And("^I Enter Vehicle Number$")
    public void iEnterVehicleNumber() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).EnterVehicleNumber(ExcelUtil.ReadCell("Vehicle Number", 1));
    }

    @And("^I Enter Model$")
    public void iEnterModel() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).EnterModelNo(ExcelUtil.ReadCell("Model", 1));
    }

    @And("^I Select Vehicle Type$")
    public void iSelectVehicleType() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).selectVehicleType(ExcelUtil.ReadCell("Vehicle Type", 1));
    }

    @And("^I Select Raw Material$")
    public void iSelectRawMaterial() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).SelectRawMaterial(ExcelUtil.ReadCell("Raw Material", 1));
    }

    @And("^I Select No of Wheels$")
    public void iSelectNoOfWheels() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).SelectNoOFWheels(ExcelUtil.ReadCell("No of Wheels", 1));
    }

    @And("^I Select Fleet Type$")
    public void iSelectFleetType() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).SelectfleetType(ExcelUtil.ReadCell("Fleet Type", 1));

    }

    @And("^I Select Transporter Name$")
    public void iSelectTransporterName() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).SelectTransporterName(ExcelUtil.ReadCell("Transportern Name", 1));

    }

    @And("^I Select Insurance Policy Expiry Date$")
    public void iSelectInsurancePolicyExpiryDate() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).DateInsurancePolicyExpiry(ExcelUtil.ReadCell("Insurance Policy Expiry Date", 1));

    }

    @And("^I Select Fitness Renewal Date From$")
    public void iSelectFitnessRenewalDateFrom() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).DateFitnessRenewalDateFrom();

    }

    @And("^I Enter Pollution certificate number$")
    public void iEnterPollutionCertificateNumber() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).TxtPollutionCertificateNumber(ExcelUtil.ReadCell("Pollution Certificate Number", 1));

    }

    @And("^I Select Pollution Expiry Date$")
    public void iSelectPollutionExpiryDate() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).DatePollutionExpiryDate(ExcelUtil.ReadCell("Pollution Expiry Date", 1));
    }

    @And("^I Enter Insurance Policy Number$")
    public void iEnterInsurancePolicyNumber() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).TxtInsurancePlcyNumber(ExcelUtil.ReadCell("Insurance Policy Number", 1));
    }

    @And("^I Select Year Of Manufacturing$")
    public void iSelectYearOfManufacturing() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).SelectYearOfManufacturing(ExcelUtil.ReadCell("Year Of Manufacturing", 1));
    }

    @And("^I Select Fitness Renewal Date To$")
    public void iSelectFitnessRenewalDateTo() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).DateFitnessRenewalDateTo(ExcelUtil.ReadCell("Fitness Renewal Date TO", 1));
    }

    @And("^I Check Is Canter$")
    public void iCheckIsCanter() throws Throwable {

        CurrentPage.As(VehicleMasterPage.class).checkIsCanter();
    }

    @Then("^I Click On Save Button$")
    public void iClickOnSaveButton() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).clickRegister();
    }

    @Then("^I Click On Edit Against Vehicle number$")
    public void iClickOnEditAgainstVehicleNumber(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(VehicleMasterPage.class).EditBtn(CucumberUtil.GetCellValue("Vehicle_number"));

    }

    @Then("^I Update Model Number$")
    public void iUpdateModelNumber(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);

        CurrentPage.As(VehicleMasterPage.class).UpdatemodelNumberText(CucumberUtil.GetCellValue("ModelNoUpdated"));
    }

    @And("^I click On Update Button$")
    public void iClickOnUpdateButton() throws Throwable {

        CurrentPage.As(VehicleMasterPage.class).clickUpdateBtn();

    }

    @Then("^I Choose TransporterName$")
    public void iChooseTransporterName() throws Throwable {
        CurrentPage.As(VehicleMasterPage.class).UpdateTransporterName(ExcelUtil.ReadCell("Transportern Name", 1));

    }

    @Then("^I Verify Data in Html Table$")
    public void iVerifyDataInHtmlTable(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        WebElementExtension.verifyTableData(By.xpath("//table[@id='vehicleReport']/tbody"),CucumberUtil.GetCellValue("VehicleNumber"));
    }
}
