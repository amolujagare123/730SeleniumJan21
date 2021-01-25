package TestNG.AsserstDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddCustomerDuplicate {

    @Test
    public void addCutomerTest()
    {
        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // implicit - directly
        // explicit - indirectly

        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();

        String custName ="kuldeep122";

        WebElement txtName =  driver.findElement(By.name("name"));
        txtName.sendKeys(custName);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("8478374");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("8478374");

        WebElement btnSubmit = driver.findElement(By.name("Submit"));
        btnSubmit.click();

        String expected = "Dublicat Entry. Please Verify";

        String actual ="";
        try {
          //  actual = driver.findElement(By.cssSelector(".error-box")).getText();

            actual = driver.findElement(By.xpath("//div[contains(@class,'box')]")).getText();


        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"not as expected");


       // org.junit.Assert.assertEquals("message",expected,actual);

    }
}
