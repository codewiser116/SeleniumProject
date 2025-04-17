package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextMethod {
    public static void main(String[] args) {
        /*
        1. go to https://www.blazedemo.com/
        2. verify text "Welcome to the Simple Travel Agency!" is visible
        3. click on "Find Flights"

        USE xpath text() method everywhere
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/");

        WebElement banner = driver.findElement(By.xpath("//h1[text()='Welcome to the Simple Travel Agency!']"));

        if (banner.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement banner2 = driver.findElement(By.xpath("//h2[text()='Choose your departure city:']"));
        if (banner2.isDisplayed()){
            System.out.println("Hooray!");
        }else{
            System.out.println("Oh no!");
        }


    }




}
