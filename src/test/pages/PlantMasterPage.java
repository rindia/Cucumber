package pages;

import framework.base.BasePage;
import framework.base.DriverContext;
import framework.utilities.WebElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PlantMasterPage extends BasePage {

    /*Start Add plant Master Path*/
    private static final String MasterTabXpath = ".//*[@id='sidebar-menu']/div/ul/li[3]/a";
    private static final String PlantMasterLinkByID = "plantMas";
    private static final String AddPlantBtnByXpath = "//button[contains(text(),'Add Plant')]";
    private static final String TxtPlantnameByID = "savePlantName";
    private static final String TxtPlantCodeID = "savePlantCode";
    private static final String SelectUnitTypeByID = "uomType";
    private static final String ActiveInactiveByXpath = ".//*[@id='radioForm']/input";
    private static final String SubmitBtnXpath = "//button[@onclick='addPlantDetails()']";
    /*End  Add plant Master Path*/


      /*Start Update plant Master Path*/
    private static final String ClickEditBtnXpath = "//button[contains(text(),'Edit')]";
    private static final String UpdatePlantCodeID = "editPlantCode";
    private static final String UpdateSubmitBtnXpath = "//button[@onclick='editPlantDetails()']";
     /*End  Update plant Master Path*/



       /*Start Delete plant Master Path*/
       private static final String DeletePlantBtnXpath = "//button[contains(text(),'Delete')]";
    private static final String ConfirmYesXpath = "//button[@ onclick='deletePlant(this.id)']";
        /*Start Delete plant Master Path*/



    /*Start  Add plant Master WebElement*/
    @FindBy(how = How.XPATH, using = MasterTabXpath)
    private WebElement MasterTab;

    @FindBy(how = How.ID, using = PlantMasterLinkByID)
    private WebElement PlantMasterLink;

    @FindBy(how = How.XPATH, using = AddPlantBtnByXpath)
    private WebElement AddPlantBtn;

    @FindBy(how = How.ID, using = TxtPlantnameByID)
    private WebElement TxtPlantname;

    @FindBy(how = How.ID, using = TxtPlantCodeID)
    private WebElement TxtPlantCode;

    @FindBy(how = How.ID, using = SelectUnitTypeByID)
    private WebElement SelectUnitType;

    @FindBy(how = How.XPATH, using = ActiveInactiveByXpath)
    private WebElement ActiveInacctive;

    @FindBy(how = How.XPATH, using = SubmitBtnXpath)
    private WebElement SubmitBtn;
     /*End  Add plant Master WebElement*/


     /*Start Update plant Master WebElement*/

    @FindBy(how = How.XPATH, using = ClickEditBtnXpath)
    private WebElement ClickEditBtn;

    @FindBy(how = How.ID, using = UpdatePlantCodeID)
    private WebElement UpdatePlantCode;

    @FindBy(how = How.XPATH, using = UpdateSubmitBtnXpath)
    private WebElement UpdateSubmitBtn;
     /*End Update plant Master WebElement*/

      /*Start Delete plant Master WebElement*/
      @FindBy(how = How.XPATH, using = DeletePlantBtnXpath)
      private WebElement DeletePlantBtn;

    @FindBy(how = How.XPATH, using = ConfirmYesXpath)
    private WebElement ConfirmYes;
       /*End Delete plant Master WebElement*/



    /*Start  Add plant Master Function*/
    public void clickMasterTab() {
        WebElementExtension.GetWhenVisible(By.xpath(MasterTabXpath), 10);
        WebElementExtension.waitForJStoLoad();
        MasterTab.click();
    }

    public void clickPlantMasterLink() {
        PlantMasterLink.click();
    }

    public void clickAddPlantBtn() {
        WebElementExtension.waitForJStoLoad();
        AddPlantBtn.click();
    }

    public void enterPlantName(String plantName) {
        TxtPlantname.sendKeys(plantName);
    }

    public void enterPlantCode(String plnatCode) {
        TxtPlantCode.sendKeys(plnatCode);
    }

    public void selectUnitType(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(SelectUnitTypeByID), name);
    }

    public void selectActiveInactive(String name) {
        WebElementExtension.radioButton(name, By.id(SelectUnitTypeByID));
    }

    public void clickSubmitBtn() {
        SubmitBtn.click();
    }

    public void WaitpageLoad() {
        WebElementExtension.GetWhenVisible(By.xpath(AddPlantBtnByXpath), 10);
    }
        public void veifyData(String value) throws InterruptedException {


            WebElementExtension.presenceOfElementLocated(By.xpath("//div[@class='x_title']/h2"),10);

            WebElementExtension.verifyTableData(By.xpath("//table[@id='plantTable']/tbody"),value);
        }

         /*End  Add plant Master Function*/


          /*Start  Update plant Master Function*/
    public void clickEditButton(String plantname) throws Exception {
        DriverContext.Driver.findElement(By.xpath(".//*[@id='plantTable_filter']/label/input")).sendKeys(plantname);
        WebElementExtension.dynamicTableWithID(By.xpath("//table[@id='plantTable']/tbody"), plantname, ClickEditBtn);
    }

    public void EnterUpdatePlantCode(String plntCode) throws Exception {
        WebElementExtension.GetWhenVisible(By.id(UpdatePlantCodeID), 10);
        UpdatePlantCode.clear();
        UpdatePlantCode.sendKeys(plntCode);
    }

    public void clickUpdateSubmitBtn() {
        WebElementExtension.GetWhenVisible(By.xpath(UpdateSubmitBtnXpath), 10);
        UpdateSubmitBtn.click();
    }
           /*End  Update plant Master Function*/



           /*Start Delete plant Master function*/
           public void clickDelteBtn(String name) throws InterruptedException {
               DriverContext.Driver.findElement(By.xpath(".//*[@id='plantTable_filter']/label/input")).sendKeys(name);
               WebElementExtension.dynamicTableWithID(By.xpath("//table[@id='plantTable']/tbody"), name, DeletePlantBtn);
           }

           public void clickYesBtn()
           {
               WebElementExtension.GetWhenVisible(By.xpath(ConfirmYesXpath),5);
               ConfirmYes.click();
           }
           /*End Delete plant Master function*/

}
