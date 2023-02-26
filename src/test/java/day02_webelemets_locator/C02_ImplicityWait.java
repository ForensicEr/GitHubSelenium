package day02_webelemets_locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ImplicityWait {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver_win32");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        driver bir web uygulamsina göndedigimizde o sayfanin acilmasi, orada istedigimiz islemleri yapmak icin
        elementleri bulmasi... gibi islemler zaman gerektirebilir

        implicitlywait bu tür zaman isteyen islemler icin
        driver'in maksimum ne kadar bekleyecegini belirler

         */
    }
}
