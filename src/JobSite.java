import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobSite {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.click.in/pune/60/post.html");

        WebElement qualification = driver.findElement(By.id("source_508"));

        Select selQualification = new Select(qualification);

        selQualification.selectByValue("2");
        selQualification.selectByValue("3");
        selQualification.selectByValue("4");

        WebElement btnAdd = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[1]"));
        btnAdd.click();

        WebElement qualificationAdded = driver.findElement(By.id("fld_508"));
        Select selQualificationAdded = new Select(qualificationAdded);

        Thread.sleep(4000);
        selQualificationAdded.selectByIndex(1);

        WebElement btnRemove = driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img[2]"));
        btnRemove.click();



    }

}
