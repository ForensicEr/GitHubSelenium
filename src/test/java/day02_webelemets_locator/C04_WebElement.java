package day02_webelemets_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElement {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // sonra arama kutusunu locate edip bir web element olarak kaydedin
        //id'si totabseacrhtextbox olan webelement seklinde locate edecegiz
        /*
        drriver'a weelement' tarif etme islemine locate,
        bu tarifi yapbilmek icin kullanabilecegim degiskenlere de LOCATOR denir
        8 tane locator vardir
        Locator'larin 6 tanesi weelement'in ozellilerine baglidir
            -id
            - classname-
            - name
            - tagname
            - linkText
            - partialLinkText
         Geriye kalan 2 locator ise here türlü webelementi locate etmek icin kullanilabiliri
         - xpat
         - cssSelector
         */
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        // arama kutusuna "Nutella" yazip aratin

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        driver.close();



    }
}
