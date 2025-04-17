package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToIdNameClass {
    public static void main(String[] args) {
        /*
        1. go to https://www.saucedemo.com/
        2. provide username
        3. provide password
        4. click on login
        5. verify user was able to login
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        String url = driver.getCurrentUrl();

        if (url.contains("inventory")){
            System.out.println("PASS! User was able to login");
        }else {
            System.out.println("FAIL");
        }

    }
}
