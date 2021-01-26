package TestNG.RealDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites {
    WebDriver driver;

    @BeforeClass
    public void mymethod1()
    {
        // open a browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();
    }

    @AfterClass
    public void mymethod2()
    {
        driver.close();
    }


    @Test (priority = 3)
    public void scriptinglogic()
    {
        // open a url
        driver.get("http://scriptinglogic.com/");

    }


    @Test (priority = 1)
    public void tutorialspoint()
    {


        Assert.assertEquals(true,false,"test is getting failed");
        // open a url
        driver.get("http://tutorialspoint.com/");

    }

    @Test (priority = 2)
    public void javatpoint()
    {
        // open a url
        driver.get("http://javatpoint.com/");

    }



}
