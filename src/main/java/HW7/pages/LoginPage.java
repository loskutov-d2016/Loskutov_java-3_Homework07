package HW7.pages;

import HW7.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {super(driver);}
    @FindBy(css = "input[name='_username']")
    private WebElement loginInput;
    @FindBy(css = "input[name='_password']")
    private WebElement passwordInput;
    @FindBy(css = "button[name='_submit']")
    private WebElement loginButton;

    public LoginPage enterLogin(String login) {
        loginInput.sendKeys(login);
        return this;
    }
    public LoginPage enterPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }
    public HomePage clickLoginButton() {
        loginButton.click();
        return new HomePage(driver);
    }
    public HomePage authorisation(String  userLogin, String userPassword) {
        enterLogin(userLogin);
        enterPassword(userPassword);
        clickLoginButton();
        return new HomePage(driver);
    }
}
