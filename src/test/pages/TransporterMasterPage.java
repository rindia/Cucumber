package pages;

import framework.base.BasePage;
import framework.utilities.WebElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransporterMasterPage extends BasePage {

    /*Start Add Transporter Master*/
    private static final String transporterTabXpath = ".//*[@id='sidebar-menu']/div/ul/li[6]/a";
    private static final String transporterLinkXpath = "//a[contains(text(),'Transporter Master')]";
    private static final String addTransporterBtnXpath = "//input[@value='Add Transporter']";
    private static final String transporterNameByID = "transName";
    private static final String transCodeByID = "transCode";
    private static final String tranOwnerNameByID = "tranOwnerName";
    private static final String tranMobileNoByID = "tranMobileNo";
    private static final String tranOwnerAddByID = "tranOwnerAdd";
    private static final String tranOwnerDobByID = "tranOwnerDob";
    private static final String transporterAllocationXpath = "//input[@name='tranAllocationStatus']";
    private static final String tranAllocationPerByID = "tranAllocationPer";
    private static final String tranAlternateContactnoByID = "tranAlternateContactno";
    private static final String selecttranCountryID = "tranCountry";
    private static final String selecttranStateID = "tranState";
    private static final String selecttranCityID = "tranCity";
    private static final String tranPinCodeByID = "tranPinCode";
    private static final String tranContactpersonByID = "tranContactperson";
    private static final String tranContactnumberByID = "tranContactnumber";
    private static final String tranEmail_IdByID = "tranEmail_Id";
    private static final String activeInactiveXpath = "//input[@name='IsActive']";
    private static final String addTransporterbtnXpath = "//button[@onclick='registerTransporter()']";

    @FindBy(how = How.XPATH, using = transporterTabXpath)
    private WebElement transporterTab;

    @FindBy(how = How.XPATH, using = transporterLinkXpath)
    private WebElement transporterLink;

    @FindBy(how = How.XPATH, using = addTransporterBtnXpath)
    private WebElement addTransporterBtn;

    @FindBy(how = How.ID, using = transporterNameByID)
    private WebElement transporterName;

    @FindBy(how = How.ID, using = transCodeByID)
    private WebElement transCode;

    @FindBy(how = How.ID, using = tranOwnerNameByID)
    private WebElement tranOwnerName;

    @FindBy(how = How.ID, using = tranMobileNoByID)
    private WebElement tranMobileNo;

    @FindBy(how = How.ID, using = tranOwnerAddByID)
    private WebElement tranOwnerAdd;

    @FindBy(how = How.ID, using = tranOwnerDobByID)
    private WebElement tranOwnerDob;

    @FindBy(how = How.XPATH, using = transporterAllocationXpath)
    private WebElement transporterAllocation;

    @FindBy(how = How.ID, using = tranAllocationPerByID)
    private WebElement tranAllocationPer;

    @FindBy(how = How.ID, using = tranAlternateContactnoByID)
    private WebElement tranAlternateContactno;

    @FindBy(how = How.ID, using = selecttranCountryID)
    private WebElement selecttranCountry;

    @FindBy(how = How.ID, using = selecttranStateID)
    private WebElement selecttranState;

    @FindBy(how = How.ID, using = selecttranCityID)
    private WebElement selecttranCity;

    @FindBy(how = How.ID, using = tranPinCodeByID)
    private WebElement tranPinCode;

    @FindBy(how = How.ID, using = tranContactpersonByID)
    private WebElement tranContactperson;

    @FindBy(how = How.ID, using = tranContactnumberByID)
    private WebElement tranContactnumber;

    @FindBy(how = How.ID, using = tranEmail_IdByID)
    private WebElement tranEmail_Id;

    @FindBy(how = How.XPATH, using = activeInactiveXpath)
    private WebElement activeInactive;

    @FindBy(how = How.XPATH, using = addTransporterbtnXpath)
    private WebElement addTransporterbtn;


    public void clickTransporterTab() {
        WebElementExtension.GetWhenVisible(By.xpath(transporterTabXpath), 10);
        transporterTab.click();
    }

    public void clickTransporterLink() {
        WebElementExtension.GetWhenVisible(By.xpath(transporterLinkXpath), 10);
        transporterLink.click();
    }

    public void clickAddTransporterBtn() {
        //WebElementExtension.GetWhenVisible(By.id(transporterNameByID),10);
        addTransporterBtn.click();
    }

    public void enterTransporterName(String name) {
        WebElementExtension.GetWhenVisible(By.id(transporterNameByID), 10);
        transporterName.sendKeys(name);
    }

    public void enterTransporterCode(String code) {
        transCode.sendKeys(code);
    }

    public void enterOwnerName(String name) {
        tranOwnerName.sendKeys(name);
    }

    public void enterOwnerMobile(String mobile) {
        tranMobileNo.sendKeys(mobile);
    }

    public void enterOwneraddress(String address) {
        tranOwnerAdd.sendKeys(address);
    }

    public void enterDOB(String dob) {
        tranOwnerDob.sendKeys(dob);
    }

    public void selectTransporterAllocation(String value) {
        WebElementExtension.radioButtonValue(value, By.xpath(transporterAllocationXpath));
    }

    public void enterPercentage(String percentage) {
        tranAllocationPer.sendKeys(percentage);
    }

    public void enterAlterNativeNumber(String number) {
        tranAlternateContactno.sendKeys(number);
    }

    public void selectCountry(String name) {
        WebElementExtension.SelectDropDownListByName(By.id(selecttranCountryID), name);
    }

    public void selectState(String state) {
        WebElementExtension.SelectDropDownListByName(By.id(selecttranStateID), state);
    }

    public void selectCity(String city) {
        WebElementExtension.SelectDropDownListByName(By.id(selecttranCityID), city);
    }

    public void enterPinCode(String pincode) {
        tranPinCode.sendKeys(pincode);
    }

    public void enterContactPersonName(String name) {
        tranContactperson.sendKeys(name);
    }

    public void enterContactNumber(String number) {
        tranContactnumber.sendKeys(number);
    }

    public void clickSaveBtn() {
        addTransporterbtn.click();
    }

    public void enterEmail(String email) {
        tranEmail_Id.sendKeys(email);
    }

    public void checkData(String data) throws InterruptedException {
        WebElementExtension.verifyTableData(By.xpath("//tbody/tr/td"), data);
    }

    public void selectActive(String value) {
        WebElementExtension.radioButtonValue(value, By.xpath(activeInactiveXpath));
    }

/*End Add Transporter Master*/


}
