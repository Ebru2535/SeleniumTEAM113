package day01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverilkClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","C:\\Desktop\\com.seleniumTeam113\\src\\resources\\chromedriver.exe");
        // windows kullanıcılarında sonda .exe olmali
        // mac kullanıcılarında .exe olmayacak

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(5000); // mili saniye olraka yazdığımız süresince bekletir
        driver.close(); // acilan browser i kapatir


    }
}
