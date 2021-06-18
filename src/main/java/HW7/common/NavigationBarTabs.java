package HW7.common;

import org.openqa.selenium.By;

public enum NavigationBarTabs {
    CONTRACTORS(".//span[@class='title' and text()='Контрагенты']"),
    PROJECTS(".//span[@class='title' and texxt()='Проекты']"),
    PRE_SALES(".//span[@class='title' and texxt()='Предпродажи']"),
    EXPENSES(".//span[@class='title' and texxt()='Расходы']"),
    PREMIUMS(".//span[@class='title' and texxt()='Премии']"),
    DICTIONARIES(".//span[@class='title' and texxt()='Справочники']"),
    REPORTS(".//span[@class='title' and texxt()='Отчеты']"),
    SYSTEM(".//li[@class='mobile-hide dropdown']/a/span[@class='title']"),
    HELP(".//span[@class='title' and texxt()='Помощь']");

    private final By by;
    NavigationBarTabs(String xpath) {this.by = By.xpath(xpath);}
    public By getBy(){return by;}
}
