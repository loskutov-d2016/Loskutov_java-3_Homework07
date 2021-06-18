package HW7.base;

import HW7.common.ProjectsSubmenuButtons;
import HW7.pages.MyProjectsPage;
import org.openqa.selenium.WebDriver;

public class ProjectsSubmenu extends BasePage implements SubMenu {

    public ProjectsSubmenu(WebDriver driver) {super(driver);}

    @Override
    public BasePage clickSubMenuButton(SubmenuButtons button) {
        if (button instanceof ProjectsSubmenuButtons) {
            switch ((ProjectsSubmenuButtons) button) {
                case MY_PROJECTS:
                    driver.findElement(((ProjectsSubmenuButtons) button).getBy()).click();
                    return new MyProjectsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Not implemented yet");
        }
    }
}
