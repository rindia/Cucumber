package pages;

import framework.base.BasePage;
import framework.base.DriverContext;
import framework.utilities.WebElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleMasterPage extends BasePage {

    /*Start Insert Vehicle Master*/
    private static final String vehicleTabXpath = ".//*[@id='sidebar-menu']/div/ul/li[7]/a";
    private static final String vehicleMasterXpath = ".//*[@id='vehicleMaster']";
    private static final String txtPresntOnPageXpath = "//div[@class='x_title']/h2";
    private static final String BtnAddNewVehicleXpath = "//input[@value='Add Vehicle']";
    private static final String TxtVehicleNoXpath = ".//*[@id='VehcileNumber']";
    private static final String TxtModelXpath = ".//*[@id='ModelNumber']";
    private static final String SelectVehciletypeByID = "VehicleType";
    private static final String SelectVRawMaterialByID = "RawMaterial";
    private static final String SelectNoOFWheelsByID = "NoOfWheels";
    private static final String SelectfleetTypeByID = "fleetTypeWeightage";
    private static final String SelectTransporterNameByID = "TransporterName";
    private static final String DateInsurancePolicyExpiryByID = "InsurancePolicyExpiryDate";
    private static final String DateFitnessRenewalDateFromByID = "FitnessRenewalDateFrom";
    private static final String DateFitnessRenewalDateToByID = "FitnessRenewalDateTo";
    private static final String TxtPollutionCertificateNumberByID = "PollutionCertificateNumber";
    private static final String TxtPPollutionExpiryDateByID = "PollutionExpiryDate";
    private static final String SelectYearOfManufacturingByID = "YearOfManufacturing";
    private static final String ChkIsCanterByID = "IsCanter";
    private static final String Btnregister = "register";
    private static final String InsurancePolicyNumberByID = "InsurancePolicyNumber";
    private static final String IsCanterByID = "IsCanter";
    private static final String registerID = "register";
    /*End Insert Vehicle Master*/

    /*Start Update Vehicle Master*/
    private static final String ModelNumber1ByID = "ModelNumber1";
    private static final String editeVehicleByID = "editeVehicle";
    private static final String EditXpath="//a[@onclick='getRowData(this.id)']";
    private static final String UpdateTransporterNameByID="TransporterName1";

    /*End Update Vehicle Master*/




    /*Start Insert Vehicle Master*/
    @FindBy(how = How.ID, using = InsurancePolicyNumberByID)
    private WebElement InsurancePolicyNumber;

    @FindBy(how = How.ID, using = IsCanterByID)
    private WebElement IsCanter;

    @FindBy(how = How.ID, using = registerID)
    private WebElement register;

    @FindBy(how = How.XPATH, using = vehicleTabXpath)
    private WebElement vehicleTab;

    @FindBy(how = How.XPATH, using = vehicleMasterXpath)
    private WebElement vehicleMaster;

    @FindBy(how = How.XPATH, using = txtPresntOnPageXpath)
    private WebElement txtPresntOnPage;

    @FindBy(how = How.XPATH, using = BtnAddNewVehicleXpath)
    private WebElement BtnAddNewVehicle;

    @FindBy(how = How.XPATH, using = TxtVehicleNoXpath)
    private WebElement TxtVehicleNo;

    @FindBy(how = How.XPATH, using = TxtModelXpath)
    private WebElement TxtModel;

    @FindBy(how = How.ID, using = SelectVehciletypeByID)
    private WebElement SelectVehciletype;

    @FindBy(how = How.ID, using = SelectVRawMaterialByID)
    private WebElement SelectRawMaterial;

    @FindBy(how = How.ID, using = SelectNoOFWheelsByID)
    private WebElement SelectNoOFWheels;

    @FindBy(how = How.ID, using = SelectfleetTypeByID)
    private WebElement SelectfleetType;

    @FindBy(how = How.ID, using = SelectTransporterNameByID)
    private WebElement SelectTransporterName;

    @FindBy(how = How.ID, using = DateInsurancePolicyExpiryByID)
    private WebElement DateInsurancePolicyExpiry;

    @FindBy(how = How.ID, using = DateFitnessRenewalDateFromByID)
    private WebElement DateFitnessRenewalDateFrom;

    @FindBy(how = How.ID, using = DateFitnessRenewalDateToByID)
    private WebElement DateFitnessRenewalDateTo;

    @FindBy(how = How.ID, using = TxtPollutionCertificateNumberByID)
    private WebElement TxtPollutionCertificateNumber;

    @FindBy(how = How.ID, using = TxtPPollutionExpiryDateByID)
    private WebElement TxtPPollutionExpiryDate;

    @FindBy(how = How.ID, using = SelectYearOfManufacturingByID)
    private WebElement SelectYearOfManufacturing;

    @FindBy(how = How.ID, using = ChkIsCanterByID)
    private WebElement ChkIsCanter;

    @FindBy(how = How.ID, using = Btnregister)
    private WebElement Btnreg;
    /*End Insert Vehicle Master*/




 /*Start Update Vehicle Master*/

    @FindBy(how = How.ID, using = ModelNumber1ByID)
    private WebElement UpdateModelNumber1;

    @FindBy(how = How.ID, using = editeVehicleByID)
    private WebElement editeVehicleBy;

    @FindBy(how = How.XPATH, using = EditXpath)
    private WebElement Edit;

    @FindBy(how = How.ID, using = UpdateTransporterNameByID)
    private WebElement UpdateTransporterName;
    /*End Update Vehicle Master*/
    /*Start Insert Vehicle Master*/
    public void clickvehicleTab() {
        WebElementExtension.GetWhenVisible(By.xpath(vehicleTabXpath), 10);
        vehicleTab.click();
    }

    public void clickvehicleMaster() {
        WebElementExtension.GetWhenVisible(By.xpath(vehicleMasterXpath), 10);

        WebElementExtension.javaScriptExcuterClick("arguments[0].click();", vehicleMaster);
    }

    public void isDisplayed() {
        WebElementExtension.GetWhenVisible(By.xpath(txtPresntOnPageXpath), 10);
        txtPresntOnPage.isDisplayed();
    }

    public void clickAddNewvehicleBtn() throws InterruptedException {


        BtnAddNewVehicle.click();
    }

    public void EnterVehicleNumber(String vehcileNo) {
        WebElementExtension.GetWhenVisible(By.xpath(TxtVehicleNoXpath), 10);
        TxtVehicleNo.clear();
        TxtVehicleNo.sendKeys(vehcileNo);
    }

    public void EnterModelNo(String modelNo) {
        TxtModel.clear();
        TxtModel.sendKeys(modelNo);
    }

    public void selectVehicleType(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(SelectVehciletypeByID), name);
    }

    public void SelectRawMaterial(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(SelectVRawMaterialByID), name);
    }

    public void SelectNoOFWheels(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(SelectNoOFWheelsByID), name);
    }

    public void SelectfleetType(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(SelectfleetTypeByID), name);
    }

    public void SelectTransporterName(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(SelectTransporterNameByID), name);
    }

    public void DateInsurancePolicyExpiry(String plus) {
        //DateInsurancePolicyExpiry.click();

        DateInsurancePolicyExpiry.sendKeys(WebElementExtension.getDatePlus(plus));
        System.out.println("-------------date----------------------" + WebElementExtension.getDatePlus(plus));

    }

    public void DateFitnessRenewalDateFrom() {
        DateFitnessRenewalDateFrom.sendKeys(WebElementExtension.getCurrentDate());
    }

    public void DateFitnessRenewalDateTo(String plus) {
        DateFitnessRenewalDateTo.sendKeys(WebElementExtension.getDateMinus(plus));
    }

    public void TxtPollutionCertificateNumber(String name) {
        TxtPollutionCertificateNumber.sendKeys(name);
    }

    public void DatePollutionExpiryDate(String plus) {
        TxtPPollutionExpiryDate.sendKeys(WebElementExtension.getDatePlus(plus));
    }

    public void checkIsCanter() {
        WebElementExtension.checkBox(IsCanter);
    }

    public void clickSave() {
        register.click();
    }

    public void TxtInsurancePlcyNumber(String data) {
        InsurancePolicyNumber.click();
        InsurancePolicyNumber.sendKeys(data);
    }

    public void SelectYearOfManufacturing(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(SelectYearOfManufacturingByID), name);
    }

    public void clikcIscentercheckBox() {
        WebElementExtension.checkBox(ChkIsCanter);
    }

    public void clickRegister() throws InterruptedException {


        Btnreg.click();
    }
 /*End Insert Vehicle Master*/

/*Start Update Vehicle Master*/

    public void EditBtn(String value) throws InterruptedException {
        DriverContext.Driver.findElement(By.xpath("//*[@id='vehicleReport1_filter']/label/input")).sendKeys(value);
        DriverContext.Driver.findElement(By.xpath(".//*[@id='vehicleReport_filter']/label/input")).sendKeys(value);
        WebElementExtension.dynamicTableWithID(By.xpath("//table[@id='vehicleReport']/tbody"),value,Edit);
    }

    public void UpdatemodelNumberText(String value)
    {
        WebElementExtension.GetWhenVisible(By.id(ModelNumber1ByID),10);
        UpdateModelNumber1.clear();
        UpdateModelNumber1.sendKeys(value);
    }

    public void UpdateTransporterName(String name)
    {
        WebElementExtension.SelectDropDownListByName(By.id(UpdateTransporterNameByID), name);

    }
    public void clickUpdateBtn() throws InterruptedException {
        WebElementExtension.presenceOfElementLocated(By.id(editeVehicleByID),10);
        WebElementExtension.ScrollToElement(editeVehicleBy);
        editeVehicleBy.click();
        Thread.sleep(3000);
    }
 /*End Update Vehicle Master*/



}
