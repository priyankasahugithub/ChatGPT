package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class ApplicationHooks {

    private WebDriver driver;

    @Before
    public void launchBrowser() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        DriverFactory.quitDriver();
    }
}
