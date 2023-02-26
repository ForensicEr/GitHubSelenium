import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium01 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // amazon ana sayfaya gidin, gittiginiz sayfadaki title ve url' yazdirin
        // amazon ana sayfaya gittiginizi test edin


    }
}
