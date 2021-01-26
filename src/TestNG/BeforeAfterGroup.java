package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroup {

    @BeforeGroups(groups="security")
    public void setUpSecurity() {
        System.out.println("setUpSecurity()");
    }

    @AfterGroups(groups="security")
    public void tearDownSecurity() {
        System.out.println("tearDownSecurity()\n");
    }

    @BeforeGroups(groups="database")
    public void setUpDatabase() {
        System.out.println("setUpDatabase()");
    }

    @AfterGroups(groups="database")
    public void tearDownDatabase() {
        System.out.println("tearDownDatabase()\n");
    }

    @BeforeGroups(groups="ui")
    public void setUpUI() {
        System.out.println("setUpUI()");
    }

    @AfterGroups(groups ="ui")
    public void tearDownUI() {
        System.out.println("tearDownUI()\n");
    }

    @Test(groups= "database")
    public void testInsert(){
        System.out.println("testInsert()");
    }

    @Test(groups= "database")
    public void testUpdate(){
        System.out.println("testUpdate()");
    }

    @Test(groups= "database")
    public void testDelete(){
        System.out.println("testDelete()");
    }

    @Test(groups= "security")
    public void accessHomePage() {
        System.out.println("accessHomePage()");
    }

    @Test(groups= "security")
    public void accessAdminPage() {
        System.out.println("accessAdminPage()");
    }

    @Test(groups= "ui")
    public void openConfirmationDialog() {
        System.out.println("openConfirmationDialog()");
    }

    @Test(groups= "ui")
    public void openFileDialog() {
        System.out.println("openFileDialog()");
    }

}
