package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "user-name")
    WebElement username;
    @FindBy(how = How.ID, using = "password")
    WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    WebElement loginButton;

public void setUsernamePassword(String name, String pass){
    username.sendKeys(name);
    password.sendKeys(pass);
    loginButton.click();
}
}
