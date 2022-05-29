import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.stealmylogin.com/demo.html");
            driver.findElement(By.name("username")).sendKeys("nikola");
            Thread.sleep(3000);
            driver.findElement(By.name("password")).sendKeys("nikola");
            Thread.sleep(3000);
            WebElement login = driver.findElement(By.xpath("/html/body/form/input[3]"));
            Thread.sleep(3000);
            login.click();
            System.out.println("Nice");
            Thread.sleep(3000);
            driver.close();
        }catch (Exception ex) {
            System.out.println("Not nice!");
        }
    }
}
