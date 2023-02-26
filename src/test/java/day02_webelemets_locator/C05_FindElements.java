package day02_webelemets_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FindElements {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32 ");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // amazon ana sayfaya gidin
        driver.get("https://wwww.amazon.com");


        // arama kutusuna java yazip aratin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java");
        aramaKutusu.submit();

        // arama sonuclarinda cikan resimlerdeki yazilari yazdirin
        List<WebElement> aramaSonuclariElementList = driver.findElements(By.className("sg-col-inner"));

        System.out.println(aramaSonuclariElementList.size()); //82

        // bu 82 elementi yazdiralim
        int elementNo=1;
        for (WebElement eachElemnt:aramaSonuclariElementList
             ) {
            System.out.println(elementNo + "---" + eachElemnt.getText());
            elementNo++;
        }
        Thread.sleep(3000);
        driver.close();

    }
}
