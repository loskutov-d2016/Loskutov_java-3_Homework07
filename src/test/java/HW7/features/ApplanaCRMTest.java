package HW7.features;

import HW7.base.BaseTest;
import HW7.common.ContractorsSubmenuButtons;
import HW7.common.NavigationBarTabs;
import HW7.pages.ContactPersonsPage;
import HW7.pages.LoginPage;
import HW7.pages.MyProjectsPage;
import Homework06.common.Conficuration;
import org.junit.Test;
import org.junit.jupiter.api.Nested;

public class ApplanaCRMTest extends BaseTest {

    @Test
    void createContactTest(){
        ContactPersonsPage contactPersonsPage = (ContactPersonsPage) new LoginPage(driver)
                .authorisation(Conficuration.STUDENT_LOGIN, Conficuration.STUDENT_PASSWORD)
                .checkPageTitle()
                .getPageNavigation()
                .moveCursorToNavigationTab(NavigationBarTabs.CONTRACTORS)
                .clickSubMenuButton(ContractorsSubmenuButtons.CONTACT_PERSONS);
       contactPersonsPage
               .checkContactPersonPage()
               .clickOnButtonCreate()
               .checkPageTitle()
               .fillformFields(HW7.common.Conficuration.LAST_NAME, HW7.common.Conficuration.FIRST_NAME, HW7.common.Conficuration.ORGANISATION_NAME, HW7.common.Conficuration.JOB_TITLE)
               .checkContactFormFieldsAreFill(HW7.common.Conficuration.LAST_NAME, HW7.common.Conficuration.FIRST_NAME, HW7.common.Conficuration.ORGANISATION_NAME, HW7.common.Conficuration.JOB_TITLE)
               .clickOnButtonSave()
               .checkMessage(HW7.common.Conficuration.CONTACT_CREATED_MESAGE);
    }

    @Nested
    class WhenContactCreated{
        @Test
        void createProjectTest(){
            MyProjectsPage myProjectsPage = (MyProjectsPage) new LoginPage(driver)
                    .authorisation(Conficuration.STUDENT_LOGIN,Conficuration.STUDENT_PASSWORD)
                    .checkPageTitle()
                    .getPageNavigation()
                    .moveCursorToNaviqationTab(NaviqationBarTabs.PROJECTS)

        }
    }
}
