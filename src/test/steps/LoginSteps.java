package steps;

import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.base.Base;
import framework.base.DriverContext;
import pages.LoginPage;

import java.util.List;

public class LoginSteps extends Base{
    @When("^I Open PLMS Url$")
    public void iOpenPLMSUrl() throws Throwable {
        CurrentPage = GetInstance(LoginPage.class);
    }

    @Then("^I See Login Page$")
    public void iSeeLoginPage() throws Throwable {
        try {
            Reporter.addStepLog(DriverContext.Driver.getTitle());
        }
        catch (Exception e)
        {
            //Reporter.addStepLog("Not avail");
        }
    }

    @Then("^I Select Plant Type$")
    public void iSelectPlantType() throws Throwable {
        CurrentPage.As(LoginPage.class).selectPlantType("5");
    }

   /* @Then("^I Enter Admin Correct UserName as \"([^\"]*)\" and and Password as \"([^\"]*)\"$")
    public void iEnterAdminCorrectUserNameAndPasswordUserName(String UserName, String Password) throws Throwable {
       // List<List<String>> data = table.raw();
       CurrentPage.As(LoginPage.class).enterUserNamePassword(UserName, Password);
    }*/

    @And("^I Click On Login Button$")
    public void iClickOnLoginButton() throws Throwable {
       CurrentPage.As(LoginPage.class).clickLoginBtn();
    }

    @Then("^I see UserName on HomePage$")
    public void iSeeUserNameOnHomePage() throws Throwable {
        System.out.println("k");
    }

    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void I_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable{
        CurrentPage.As(LoginPage.class).enterUserNamePassword(arg1, arg2);
    }


}
