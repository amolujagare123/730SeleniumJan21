import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathDemo1 {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
       driver.get("http://stock.scriptinglogic.net/");

       WebElement txtUser = driver.findElement(By.xpath("//input[@id='login-username']"));
       txtUser.sendKeys("admin");

       WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
       txtPassword.sendKeys("admin");

       WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
       btnLogin.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));
        lnkAddCustomer.click();

/*

       //Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // implicit - directly
        // explicit - indirectly

       WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
       lnkAddCustomer.click();

       WebElement txtName =  driver.findElement(By.name("name"));
       txtName.sendKeys("kuldeep");

       WebElement txtAddress = driver.findElement(By.name("address"));
       txtAddress.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("8478374");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("8478374");

        WebElement btnSubmit = driver.findElement(By.name("Submit"));
        btnSubmit.click();
*/



    }

}
