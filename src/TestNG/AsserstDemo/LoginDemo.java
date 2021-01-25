package TestNG.AsserstDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginDemo {

    @Test
    public void mytest1() {
        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin1");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      /*  String expected ="http://stock.scriptinglogic.net/dashboard.php";

        String actual = driver.getCurrentUrl();

        Assert.assertEquals(actual,expected,"The actual URL is different");
*/

 /*       String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();
        Assert.assertEquals(actual,expected,"The actual Page Title is different");
 */

        String expected = "Dashboard";
        String actual ="";
        try {

            actual = driver.findElement(By.cssSelector(".active-tab")).getText();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    Assert.assertEquals(actual,expected,"Dashboard test is absent");


    }
}
