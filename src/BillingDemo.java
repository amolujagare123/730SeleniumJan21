import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BillingDemo {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://billing.scriptinglogic.net/");

       WebElement txtUser = driver.findElement(By.xpath("//input[@name='email']"));
       txtUser.sendKeys("amolujagare@gmail.com");

       WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
       txtPassword.sendKeys("admin123");

       WebElement btnLogin = driver.findElement(By.xpath("//input[@name='btn_login']"));
       btnLogin.click();

        WebElement lnkClient = driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
        lnkClient.click();


        WebElement lnkAddClient = driver.findElement(By.xpath("//a[normalize-space()='View Clients']"));
        lnkAddClient.click();


        String name="Admin2";

        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//div")).click();

        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//i[contains(@class,'edit')]")).click();





    }

}
