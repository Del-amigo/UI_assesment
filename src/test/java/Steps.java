import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Steps {
   private WebDriver driver;
   BasePage bp = new BasePage();

    public Steps() {
        this.driver = BaseDriver.getDriver();
    }

    @Given("User navigates to {string}")
    public void user_navigates_to(String stringLink) {
        driver.get( stringLink );
    }

    @When("User sends text as {string} to {string}")
    public void userSendsTextAsTo(String text, String webElement) {
       bp.getWebElement( webElement ).sendKeys( text );
    }

    @When("User clicks on {string}")
    public void user_clicks_on(String string) {
        bp.getWebElement( string ).click();
    }

    @Then("Verify that {string} is displayed on {string}")
    public void isDisplayedOn(String expected, String webElement) {
        bp.waitUntilVisible( bp.getWebElement( webElement ));
        String actual = bp.getWebElement( webElement ).getText();
        Assert.assertEquals( actual, expected);
    }
}
