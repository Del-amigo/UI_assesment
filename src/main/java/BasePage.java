import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class BasePage extends CommonMethods {
   BasePage(){
       PageFactory.initElements( driver,this );
   }
   @FindBy(id = "userName")
    private WebElement user_inputElement;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "addend1")
    private WebElement firstNumberInput;

    @FindBy(id = "addend2")
    private WebElement secondNumberInput;

    @FindBy(id = "sum")
    private WebElement sum;

    @FindBy(id = "additionButton")
    private WebElement additionButton;

    @FindBy(id = "loggedInUser")
    private WebElement loggedInUser;

    public WebElement getWebElement(String elementName){
        WebElement webElement = null;
        switch ( elementName){
            case "user_inputElement":
                return user_inputElement;
            case "loginButton":
                return loginButton;
            case "firstNumberInput":
                return firstNumberInput;
            case "secondNumberInput":
                return secondNumberInput;
            case "sum":
                return sum;
            case "additionButton":
                return additionButton;
            case "loggedInUser":
                return loggedInUser;
        }
        return webElement;
    }
}
