package JunitDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo2 {

    static WebDriver driver;

    @BeforeClass // method below this annotation will run before first test of the class
    public static void myMethod1()
    {
        // open a browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // maximize the browser
        driver.manage().window().maximize();
    }

    @AfterClass // method below this annotation will run after last test of the class
    public static  void myMethod2()
    {
        driver.close();
    }


    @Test
    public void myTest1()
    {

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
      //  btnLogin.click();
    }

    @Test
    public void myTest2()
    {

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("fdf");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("fdf");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();
    }

    @Test
    public void myTest3()
    {

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
      //  btnLogin.click();
    }


}
