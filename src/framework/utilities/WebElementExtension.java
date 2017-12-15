package framework.utilities;


import com.cucumber.listener.Reporter;
import framework.base.DriverContext;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WebElementExtension {
    public static void scrollingByCoordinatesofAPage(int x, int y) {
        ((JavascriptExecutor) DriverContext.Driver).executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public static void scrollingToBottomofAPage() {

        ((JavascriptExecutor) DriverContext.Driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollingToElementofAPage(By locator) {


        ((JavascriptExecutor) DriverContext.Driver).executeScript(
                "arguments[0].scrollIntoView();", DriverContext.Driver.findElement(locator));
    }

    public static void Hover(WebElement element) throws InterruptedException {
        Actions actions = new Actions(DriverContext.Driver);
        actions.moveToElement(element).perform();

    }

    public static void WaitConditions() {
        DriverContext.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebElement GetWhenVisible(By locator, int timeout) {

        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(DriverContext.Driver, timeout);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;

    }

    public static WebElement presenceOfElementLocated(By locator, int timeout) {

        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(DriverContext.Driver, timeout);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;

    }


    public static void waitForJStoLoad() {


        JavascriptExecutor js = (JavascriptExecutor) DriverContext.Driver;


        //Initially bellow given if condition will check ready state of pages.
        if (js.executeScript("return document.readyState").toString().equals("complete")) {
            System.out.println("Page Is loaded.");
            return;
        }
        for (int i = 0; i < 25; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            //To check pages ready state.
            if (js.executeScript("return document.readyState").toString().equals("complete")) {
                break;
            }
        }

    }

    public static void clickLinkByTextName(By locator, String linktextName) throws InterruptedException {

        List<WebElement> list = DriverContext.Driver.findElements(locator);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().equals(linktextName)) {
                list.get(i).click();
                break;
            }

        }
    }

    public static void javaScriptExcuterClick(String script, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverContext.Driver;
        //js.executeScript("arguments[0].click();",element);
        js.executeScript(script, element);
    }

    public static void javaScriptExcuterClickWithoutElemenet(String script) {
        JavascriptExecutor js = (JavascriptExecutor) DriverContext.Driver;
        // js.executeScript("arguments[0].click();",element);
        js.executeScript(script);
    }

    public static void waitForAjaxRequestToComplete(By by) {
        new WebDriverWait(DriverContext.Driver, 10).until(ExpectedConditions
                .invisibilityOfElementLocated(by));
    }

    public static void ExpectedConditionsAfterPagerefresh(By by) {
        new WebDriverWait(DriverContext.Driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void SelectDropDownList(By by, String value) {
        Select select = new Select(DriverContext.Driver.findElement(by));
        select.selectByValue(value);
    }

    public static void SelectDropDownListByName(By by, String name) {
        Select select = new Select(DriverContext.Driver.findElement(by));
        select.selectByVisibleText(name);
    }

    private static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal);
    }

    public static String getDatePlus(String plus) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(calendar.getTime());
        calendar.add(Calendar.DATE, Integer.parseInt(plus));
        Date yesterday = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String previousDate = dateFormat.format(yesterday);
        return previousDate;
    }

    public static String getDateMinus(String minus) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(calendar.getTime());
        calendar.add(Calendar.DATE, Integer.parseInt(minus));
        Date yesterday = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String previousDate = dateFormat.format(yesterday);
        return previousDate;
    }

    public static String getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(calendar.getTime());
        Date yesterday = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String previousDate = dateFormat.format(yesterday);
        return previousDate;
    }

    public static void checkBox(WebElement ele) {
        if (!ele.isSelected()) {
            ele.click();
        }
    }

    public static void radioButton(String name, By ele) {
        List<WebElement> oCheckBox = DriverContext.Driver.findElements(ele);
        int iSize = oCheckBox.size();
        for (int i = 0; i < iSize; i++) {
            String sValue = oCheckBox.get(i).getAttribute("name");
            if (sValue.equalsIgnoreCase(name)) {
                if (!oCheckBox.get(i).isSelected()) {
                    oCheckBox.get(i).click();
                    break;
                }

            }
        }
    }

    public static void radioButtonValue(String value, By ele) {
        List<WebElement> oCheckBox = DriverContext.Driver.findElements(ele);
        int iSize = oCheckBox.size();
        for (int i = 0; i < iSize; i++) {
            String sValue = oCheckBox.get(i).getAttribute("value");
            if (sValue.equalsIgnoreCase(value)) {
                if (!oCheckBox.get(i).isSelected()) {
                    oCheckBox.get(i).click();
                    break;
                }

            }
        }
    }

    public static void dynamicTableWithID(By by, String vehiclenumber, WebElement el) throws InterruptedException {
        WebElement mytable = DriverContext.Driver.findElement(by);

        List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
        int rows_count = rows_table.size();

        for (int row = 0; row < rows_count; row++) {
            List<WebElement> Column_rows = rows_table.get(row).findElements(By.tagName("td"));
            int columns_count = Column_rows.size();
            for (int column = 0; column < columns_count; column++) {
                String celltext = Column_rows.get(column).getText();
                //System.out.println("cell text--- " + celltext);
                if (celltext.equalsIgnoreCase(vehiclenumber)) {
                    WebElementExtension.javaScriptExcuterClick("arguments[0].click();", el);
                    break;
                }
            }
        }
    }

    public static void verifyTableData(By by, String Name) throws InterruptedException {
        WebElementExtension.waitForJStoLoad();
        Thread.sleep(5000);
        GetWhenVisible(by, 10);
        DriverContext.Driver.findElement(By.xpath("//input[@type='search']")).clear();
        DriverContext.Driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Name);
        List<WebElement> ls = DriverContext.Driver.findElements(by);
        int size = ls.size();

        System.out.println("datatable size " + size);

        for (int i = 0; i < size; i++) {
            System.out.println(ls.get(i).getText());
            String celltext = ls.get(i).getText();
            Assert.assertEquals("Data is not available", ls.get(i).getText(), Name);

            break;

        }


        //outerLoop:
        /*{

            for (int i = 0; i < 4; i++) {
                final WebDriverWait wait = new WebDriverWait(DriverContext.Driver, 10);
                wait.until(ExpectedConditions.refreshed(
                        ExpectedConditions.presenceOfElementLocated(by)));


                WebElement mytable = DriverContext.Driver.findElement(by);
                List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
                int rows_count = rows_table.size();

                for (int row = 0; row < rows_count; row++) {
                    List<WebElement> Column_rows = rows_table.get(row).findElements(By.tagName("td"));
                    int columns_count = Column_rows.size();
                    for (int column = 0; column < columns_count; column++) {
                        String celltext = Column_rows.get(column).getText();
                        System.out.println("cell text name " + celltext);
                        if (celltext.equals(Name.trim())) {
                            System.out.println("innner fdsfshf-----------");
                            Reporter.addStepLog("Save succesfully " + Column_rows.get(column).getText());
                            break outerLoop;
                        }
                    }
                }
            }
        }*/

    }


    public static void ScrollToElement(WebElement element) {
        ((JavascriptExecutor) DriverContext.Driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void alert(String action) {
        new WebDriverWait(DriverContext.Driver, 65)
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());
        Alert alert = DriverContext.Driver.switchTo().alert();
        if (action.equals("ok") || action.equals("accept")) {
            alert.accept();
        } else if (action.equals("cancel")) {
            alert.dismiss();
        }
    }

    public static void checkData(By by, String data) {


        WebElement el = DriverContext.Driver.findElement(By.xpath("//td[contains(text(),'" + data + "')]"));
        System.out.println("-----------ppp" + el.toString());
        if (el.getText().equals(data)) {
            System.out.println("-----------dasjkdhasjdhjasd-----------------");
        }

    }



}
