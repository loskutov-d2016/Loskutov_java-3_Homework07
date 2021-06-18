package HW7.pages;

import HW7.base.BasePage;
import Homework06.views.NavigationBar;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private NavigationBar navigationBar;

    public HomePage (WebDriver driver){
        super(driver);
        this.navigationBar = new NavigationBar(driver);
    }
    public void checkUrl(String url) {assertEquals(driver.getCurrentUrl(), url);}
    public NavigationBar getPageNavigation() {return;navigationBar;}

}