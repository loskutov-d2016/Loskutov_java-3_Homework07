package HW7.base;

import HW7.common.ContractorsSubmenuButtons;
import HW7.pages.ContactPersonsPage;
import org.openqa.selenium.WebDriver;

public class ContractorSubmenu extends BasePage implements SubMenu {

    public ContractorSubmenu(WebDriver driver) { super(driver);}

    @Override
    public BasePage clickSubMenuButton(SubmenuButtons button) {
        if (button instanceof ContractorsSubmenuButtons) {
            switch ((ContractorsSubmenuButtons) button) {
                case CONTACT_PERSONS:
                    driver.findElement(((ContractorsSubmenuButtons) button).getBy()).click();
                    return new ContactPersonsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Not implemented yet");
        }
    }
}
