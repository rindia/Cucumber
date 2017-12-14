package steps;


import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import framework.base.Base;
import framework.utilities.CucumberUtil;
import framework.utilities.WebElementExtension;
import org.openqa.selenium.By;
import pages.PlantMasterPage;

public class PlantMasterSteps extends Base{
    @Then("^I Click on Master Tab$")
    public void iClickOnMasterTab() throws Throwable {
      CurrentPage = GetInstance(PlantMasterPage.class);
      CurrentPage.As(PlantMasterPage.class).clickMasterTab();
    }

    @Then("^I Click on Plant Master Link$")
    public void iClickOnPlantMasterLink() throws Throwable {
        CurrentPage.As(PlantMasterPage.class).clickPlantMasterLink();
    }

    @Then("^I Click On Add Plant Button$")
    public void iClickOnAddPlantButton() throws Throwable {
        CurrentPage.As(PlantMasterPage.class).clickAddPlantBtn();
    }

    @And("^I Enter PlantName$")
    public void iEnterPlantName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(PlantMasterPage.class).enterPlantName(CucumberUtil.GetCellValue("PlantName"));

    }

    @And("^I Enter Plant Code$")
    public void iEnterPlantCode(DataTable table) throws Throwable {
       CucumberUtil.ConvertDataTableToDict(table);
       CurrentPage.As(PlantMasterPage.class).enterPlantCode(CucumberUtil.GetCellValue("PlantCode"));
    }

    @And("^I Select Unit Type$")
    public void iSelectUnitType(DataTable  table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(PlantMasterPage.class).selectUnitType(CucumberUtil.GetCellValue("UnitType"));
    }

    @And("^I Select Active$")
    public void iSelectActive(DataTable table) throws Throwable {
       CucumberUtil.ConvertDataTableToDict(table);
       CurrentPage.As(PlantMasterPage.class).selectActiveInactive(CucumberUtil.GetCellValue("ActiveOption"));
    }

    @Then("^I click Submit Button$")
    public void iClickSubmitButton() throws Throwable {
       CurrentPage.As(PlantMasterPage.class).clickSubmitBtn();
    }

    @Then("^I See Data in Html Table$")
    public void iSeeDataInHtmlTable(DataTable table) throws Throwable {

        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(PlantMasterPage.class).veifyData(CucumberUtil.GetCellValue("validationData"));

    }

    @Then("^I click on This Edit Button$")
    public void iClickOnThisEditButton(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
       CurrentPage.As(PlantMasterPage.class).clickEditButton(CucumberUtil.GetCellValue("Plantname"));
    }

    @Then("^I Enter New Plant code$")
    public void iEnterNewPlantCode(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
       CurrentPage.As(PlantMasterPage.class).EnterUpdatePlantCode(CucumberUtil.GetCellValue("PlantCode"));
    }

    @And("^I click on Submit Button$")
    public void iClickOnSubmitButton() throws Throwable {
      CurrentPage.As(PlantMasterPage.class).clickUpdateSubmitBtn();
    }

    @Then("^I Click This Delete Button$")
    public void iClickThisDeleteButton(DataTable table) throws Throwable {
       CucumberUtil.ConvertDataTableToDict(table);
       CurrentPage.As(PlantMasterPage.class).clickDelteBtn(CucumberUtil.GetCellValue("Plantname"));
    }

    @And("^I Click On Yes Button$")
    public void iClickOnYesButton() throws Throwable {
      CurrentPage.As(PlantMasterPage.class).clickYesBtn();
    }


    @Then("^I Check Data Is Deleted$")
    public void iCheckDataIsDeleted(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        WebElementExtension.verifyTableData(By.xpath("//table[@id='plantTable']/tbody"),CucumberUtil.GetCellValue("Plantname"));
    }
}
