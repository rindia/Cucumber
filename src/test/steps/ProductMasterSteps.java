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
import pages.ProductMasterPage;

import javax.xml.crypto.Data;

public class ProductMasterSteps extends Base {
    @Then("^I Click on Product Master link$")
    public void iClickOnProductMasterLink() throws Throwable {
      CurrentPage = GetInstance(ProductMasterPage.class);
      CurrentPage.As(ProductMasterPage.class).clickproductMasterLink();
    }

    @Then("^I click On Add Prodcut Button$")
    public void iClickOnAddProdcutButton() throws Throwable {
       CurrentPage.As(ProductMasterPage.class).clickaddproductBtn();
    }

    @And("^I Enter Product Name$")
    public void iEnterProductName(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(ProductMasterPage.class).enterProductName(CucumberUtil.GetCellValue("ProductName"));
    }

    @And("^I Enter Product Code$")
    public void iEnterProductCode(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(ProductMasterPage.class).enterProductCode(CucumberUtil.GetCellValue("ProductCode"));
    }

    @And("^I Select Active/Inactive$")
    public void iSelectActiveInactive(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(ProductMasterPage.class).selectinactiveActive(CucumberUtil.GetCellValue("Active"));
    }

    @Then("^I click on Add Product Submit Button$")
    public void iClickOnAddProductSubmitButton() throws Throwable {
       CurrentPage.As(ProductMasterPage.class).clickSaveBtn();
    }

    @Then("^I Check Data Is Saved In HTML Table$")
    public void iCheckDataIsSavedInHTMLTable(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(ProductMasterPage.class).checkData(CucumberUtil.GetCellValue("CheckData"));
    }

    @Then("^I click on This Product Edit Button$")
    public void iClickOnThisProductEditButton(DataTable table) throws Throwable {
      CucumberUtil.ConvertDataTableToDict(table);
      CurrentPage.As(ProductMasterPage.class).clickEditBtn(CucumberUtil.GetCellValue("ProductName"));
    }

    @Then("^I Update Plant Code Value$")
    public void iUpdatePlantCodeValue(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(ProductMasterPage.class).enterUpdateProductName(CucumberUtil.GetCellValue("PlantCode"));
    }

    @And("^I click Update Submit Button$")
    public void iClickUpdateSubmitButton() throws Throwable {
      CurrentPage.As(ProductMasterPage.class).clickUpdateBtn();
    }

    @Then("^I click on This Product Delete Button$")
    public void iClickOnThisProductDeleteButton(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(ProductMasterPage.class).clickDeleteBtn(CucumberUtil.GetCellValue("ProductName"));
    }

    @Then("^I click Yes This Button$")
    public void iClickYesThisButton() throws Throwable {
        CurrentPage.As(ProductMasterPage.class).clickYesBtn();
    }
}
