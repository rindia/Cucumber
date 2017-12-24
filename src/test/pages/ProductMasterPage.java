package pages;

import framework.base.BasePage;
import framework.base.DriverContext;
import framework.utilities.WebElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductMasterPage extends BasePage {

    //Start Product Master Path
    private static final String productMasterByID = "ProductMaster";
    private static final String addproductbyXpath = "//button[contains(text(),'Add Product')]";
    private static final String productnameByID = "saveProductName";
    private static final String saveProductCodeByID = "saveProductCode";
    private static final String activeInactiveXpath = "//input[@type='radio']";
    private static final String SaveProductMasterBtnByXpath = "//button[@onclick='addProductDetails()']";
    //End Product Master Path

    //Start Edit Product Master Path
    private static final String TableXpath = "//table[@id='productTable']/tbody";
    private static final String editBtnXpath = "//button[contains(text(),'Edit')]";
    private static final String editProductCodeID = "editProductCode";
    private static final String updateProductMasterBtnByXpath = "//button[@onclick='editProductDetails()']";
    //End Edit Product Master Path

    //Start Delete Product Master Path
    private static final String DeleteBtnXpath = "//button[contains(text(),'Delete')]";
    private static final String yesBtnXpath ="//button[contains(text(),'Yes')]";
    //End Delete Product Master Path



    //Start Product Master WebElement
    @FindBy(how = How.ID, using = productMasterByID)
    private WebElement productMaster;

    @FindBy(how = How.XPATH, using = addproductbyXpath)
    private WebElement addproduct;

    @FindBy(how = How.ID, using = productnameByID)
    private WebElement productname;

    @FindBy(how = How.ID, using = saveProductCodeByID)
    private WebElement saveProductCode;

    @FindBy(how = How.XPATH, using = activeInactiveXpath)
    private WebElement activeInactiv;

    @FindBy(how = How.XPATH, using = SaveProductMasterBtnByXpath)
    private WebElement SaveProductMasterBtn;
    //End Product Master WebElement





    //Start Edit Product Master WebElement
    @FindBy(how = How.XPATH, using = editBtnXpath)
    private WebElement editBtn;

    @FindBy(how = How.ID,using = editProductCodeID)
    private WebElement editProductCode;

    @FindBy(how = How.XPATH, using = updateProductMasterBtnByXpath)
    private WebElement updateProductMasterBtn;
    //End Edit Product Master WebElement

    //Start Delete Product Master WebElement
    @FindBy(how = How.XPATH,using = yesBtnXpath)
    private WebElement yesBtn;

    @FindBy(how = How.XPATH,using = DeleteBtnXpath)
    private WebElement DeleteBtn;
    //End Delete Product Master WebElement


    //Start Product Master Functions
    public void clickproductMasterLink() {

        WebElementExtension.presenceOfElementLocated(By.id(productMasterByID),10);
        productMaster.click();
    }
    public void clickaddproductBtn()
    {
        WebElementExtension.GetWhenVisible(By.xpath(addproductbyXpath),10);
        addproduct.click();
    }
    public void enterProductName(String pname)
    {
        WebElementExtension.GetWhenVisible(By.id(productnameByID),10);
        productname.sendKeys(pname);
    }
    public void enterProductCode(String code)
    {
        saveProductCode.sendKeys(code);
    }
    public void selectinactiveActive(String name)
    {
        WebElementExtension.radioButtonValue(name, By.xpath(activeInactiveXpath));
    }
    public void clickSaveBtn()
    {
        SaveProductMasterBtn.click();
        WebElementExtension.waitForJStoLoad();

    }
    //End Product Master Functions

    //Start Update Product Master Functions
    public void clickEditBtn(String name) throws InterruptedException {
        DriverContext.Driver.findElement(By.xpath(".//*[@id='productTable_filter']/label/input")).sendKeys(name);
        WebElementExtension.dynamicTableWithID(By.xpath(TableXpath), name, editBtn);
    }

    public void enterUpdateProductName(String code)
    {
        WebElementExtension.GetWhenVisible(By.id(editProductCodeID),5);
        editProductCode.clear();
        editProductCode.sendKeys(code);
    }
    public void clickUpdateBtn()
    {
        WebElementExtension.GetWhenVisible(By.xpath(updateProductMasterBtnByXpath),10);
        updateProductMasterBtn.click();
    }

    public void waitPageLoad()
    {
        WebElementExtension.GetWhenVisible(By.xpath(addproductbyXpath),10);
        WebElementExtension.waitForJStoLoad();

    }

    public void  checkData(String value) throws InterruptedException {
        WebElementExtension.presenceOfElementLocated(By.xpath("//div[@class='x_title']/h2"),10);
        WebElementExtension.verifyTableData(By.xpath("//tbody/tr/td"),value);

    }
    //End Update Product Master Functions

    //Start Delete Product Master Functions
    public void clickDeleteBtn(String name) throws InterruptedException {
        DriverContext.Driver.findElement(By.xpath(".//*[@id='productTable_filter']/label/input")).sendKeys(name);
        WebElementExtension.dynamicTableWithID(By.xpath("//table[@id='productTable']/tbody"), name, DeleteBtn);
    }

    public void clickYesBtn()
    {
        WebElementExtension.GetWhenVisible(By.xpath(yesBtnXpath),10);
        yesBtn.click();
    }


}
