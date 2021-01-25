package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenClinicDemo {


    public static void main(String[] args) throws InterruptedException {

        // open a browser
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        // open a url
        driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");
        
        String name = "Hayan";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//img[@alt='edit']")).click();

    }

}
