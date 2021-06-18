package HW7.common;

import HW7.base.SubmenuButtons;
import org.openqa.selenium.By;

public enum ProjectsSubmenuButtons implements SubmenuButtons {
    CONTACT_PERSONS("//li[@data-route='crm_project_my']/a");

    private final By by;

    ProjectsSubmenuButtons(String xpath) {this.by = By.xpath(xpath);}

    public  By getBy() {return by;}
}