package HW7.pages;

import HW7.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactPersonsPage extends BasePage {
    public ContactPersonsPage (WebDriver driver) {super(driver);}

    @FindBy(xpath = "//h1[@class='crm-subtitle' and contains(.,'Контактные лица')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//table")
    private WebElement tableContactPersons;

    @FindBy(xpath = "//a[@title='Создать контактное лицо']")
    private  WebElement messageBox;

    public ContactPersonsPage checkPageTitle(){
        wait10second.until(ExpectedConditions.visibilityOf(pageTitle));
        assertThat(pageTitle.isDisplayed()).as("Открыта страница Контактные лица").isTrue();
        return this;
    }
    public ContactPersonsPage checkTableOnPage() {
        wait10second.until(ExpectedConditions.visibilityOf(tableContactPersons));
        assertThat(tableContactPersons.isDisplayed()).as("Присутствует Таблица контактных лиц").isTrue();
        return this;
    }
    public ContactPersonsPage checkButtonCreateOnPage() {
        wait10second.until((ExpectedConditions.visibilityOf(buttonCreateContact)));
        assertThat(buttonCreateContact.isDisplayed()).as("Присутствует кнопка Создать контактное лицо").isTrue();
        return this;
    }
    public ContactPersonsPage checkContactPersonsPage(){
        checkPageTitle();
        checkTableOnPage();
        checkButtonCreateOnPage();
        return this;
    }
    public ContactPersonsPage checkMessage(String messageText) {
        wait10second.until(ExpectedConditions.visibilityOf(messageBox));
        assertThat(messageBox.getText().contains(messageText)).isTrue();
        return this;
    }
    public CreateContactPersonPage clickOnButtonCreate() {
        buttonCreateContact.click();
        return  new CreateContactPersonPage(driver);
    }
}
