import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private WebDriver driver;

    @Before
    public void start(){
        driver = BaseDriver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
    }

    @After
    public void quit(){
    //    BaseDriver.quitDriver();
    }
}

