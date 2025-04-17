package introToSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToSeleniumWebdriver {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com/");

        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com/imghp?hl=en&tab=ri&ogbl");
        System.out.println(driver.getTitle());

        driver.close();

        driver.navigate().to("");


    }
}
