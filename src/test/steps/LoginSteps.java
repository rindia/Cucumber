package steps;

import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
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

    @Then("^I Enter Admin Correct UserName and Password userName$")
    public void iEnterAdminCorrectUserNameAndPasswordUserName(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
       CurrentPage.As(LoginPage.class).enterUserNamePassword(data.get(1).get(0),data.get(1).get(1));
    }

    @And("^I Click On Login Button$")
    public void iClickOnLoginButton() throws Throwable {
       CurrentPage.As(LoginPage.class).clickLoginBtn();
    }

    @Then("^I see UserName on HomePage$")
    public void iSeeUserNameOnHomePage() throws Throwable {
        System.out.println("k");
    }
}
