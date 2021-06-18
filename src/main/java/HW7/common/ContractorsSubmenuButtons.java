package HW7.common;

import HW7.base.SubmenuButtons;
import org.openqa.selenium.By;

public enum ContractorsSubmenuButtons implements SubmenuButtons {
    CONTACT_PERSONS("//li[@data-route='crm_contact_index']/a");

    private final By by;

    ContractorsSubmenuButtons(String xpath) {this.by = By.xpath(xpath);}

    public  By getBy() {return by;}
}
