package framework.base;

import org.openqa.selenium.support.PageFactory;

import javax.naming.ldap.ControlFactory;

public class Base {

    public static BasePage CurrentPage;

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page)
    {
        Object obj = PageFactory.initElements(DriverContext.Driver, page);
        return page.cast(obj);
    }
}
