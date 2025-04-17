package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocatorsIdName {
    public static void main(String[] args) {
        /*
        Test Case: Verify user can login and buy products

        Steps:
        1. go to https://www.saucedemo.com/
        2. enter username
        3. enter password
        4. click on login button
        5. add "Sauce Labs Backpack" to cart
        6. add "Sauce Labs Bolt T-Shirt" to cart
        7. go to cart
        8. click on "checkout" button
        9. enter "first name"
        10. enter "last name"
        11. enter "zip code"
        12. click on "continue" button
        13. click on "finish" button
        14. verify text appeared "Thank you for your order!"
        15. verify URL contains "checkout-complete"
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement backpackAddToCartBtn = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpackAddToCartBtn.click();

        WebElement tShirtAddToCardBtn = driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt"));
        tShirtAddToCardBtn.click();

        WebElement cart = driver.findElement(By.className("shopping_cart_link"));
        cart.click();

        WebElement checkoutBtn = driver.findElement(By.id("checkout"));
        checkoutBtn.click();

        WebElement firstName = driver.findElement(By.cssSelector("input#first-name"));
        firstName.sendKeys("Bena");

        WebElement lastName = driver.findElement(By.cssSelector("input#last-name"));
        lastName.sendKeys("Baialieva");

        WebElement zipCode = driver.findElement(By.cssSelector("input[id='postal-code']"));
        zipCode.sendKeys("13432");

        WebElement continueBtn = driver.findElement(By.cssSelector("input[name='continue']"));
        continueBtn.click();

        WebElement finishBtn = driver.findElement((By.cssSelector("button[class='btn btn_action btn_medium cart_button']")));
        finishBtn.click();

        WebElement thankYouText = driver.findElement(By.cssSelector("h2[data-test='complete-header']"));
        
        String actualText = thankYouText.getText();

        if (actualText.contains("Thank you for your order!")){
            System.out.println("PASS: the checkout was successful");
        }else{
            System.out.println("FAIL: checkout failed");
        }

        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains("checkout-complete")){
            System.out.println("PASS: url is correct");
        }else {
            System.out.println("FAIL: url is wrong");
        }

        driver.quit();



    }
}
