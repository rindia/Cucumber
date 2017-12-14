package pages;

import framework.base.BasePage;
import framework.utilities.WebElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends BasePage {

    private static final String SelectPlantByID= "plantID";
    private static final  String userNameByID ="username";
    private static final  String passwordByID ="password";
    private static final  String BtnLoginByXpath="//button[@name='LogIn']";

    @FindBy(how = How.ID,using = SelectPlantByID)
    private WebElement SelectPlant;

    @FindBy(how = How.ID,using = userNameByID)
    private WebElement userName;

    @FindBy(how = How.ID,using = passwordByID)
    private WebElement password;

    @FindBy(how = How.XPATH,using = BtnLoginByXpath)
    private WebElement BtnLogin;


    public void selectPlantType(String Value)
    {
        WebElementExtension.SelectDropDownList(By.id(SelectPlantByID),Value);
    }

    public void enterUserNamePassword(String username,String pass)
    {

        userName.clear();
        userName.sendKeys(username);
        password.clear();
        password.sendKeys(pass);

    }

    public void  clickLoginBtn()
    {
        BtnLogin.click();
    }





}