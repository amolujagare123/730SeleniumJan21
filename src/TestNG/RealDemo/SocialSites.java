package TestNG.RealDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {
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
    public void facebook()
    {
        // open a url
        driver.get("http://facebook.com/");

    }


    @Test (priority = 1)
    public void twitter()
    {
        // open a url
        driver.get("http://twitter.com/");

    }

    @Test (priority = 2)
    public void instagram()
    {
        // open a url
        driver.get("http://instagram.com/");

    }



}
