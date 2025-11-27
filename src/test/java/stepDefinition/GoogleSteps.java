package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleSteps {

    WebDriver driver = DriverFactory.getDriver();

    @Given("I open google homepage")
    public void openGoogle() {
        driver.get("https://google.com");
    }

    @Then("Page title should contain Google")
    public void validateTitle() {
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}
