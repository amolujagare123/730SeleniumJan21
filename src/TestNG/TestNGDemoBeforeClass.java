package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGDemoBeforeClass {
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


    @Test
    public void mytest1()
    {


        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void mytest2()
    {

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("rere");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("rere");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @Test
    public void mytest3()
    {
     

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

}
