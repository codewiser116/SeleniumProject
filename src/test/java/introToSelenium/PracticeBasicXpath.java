package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBasicXpath {
    public static void main(String[] args) throws InterruptedException {
        /*
            1. go to https://magento.softwaretestingboard.com/
            2. click on “Women”
            3. verify url contains “women”
            4. click on “Jackets”
            5. verify price of first jacket is **$77.00**
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");

        WebElement womenDropDown = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
        womenDropDown.click();

        Thread.sleep(2000);

        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains("women")){
            System.out.println("PASS: the url is correct");
        }else {
            System.out.println("FAIL: the url was not updated");
        }

        WebElement jackets = driver.findElement(By.linkText("Jackets"));
        jackets.click();

        WebElement firstJacketPrice = driver.findElement(By.xpath("//span[@id='product-price-1396']/span"));
        String jacketPrice = firstJacketPrice.getText();

        if (jacketPrice.equals("$77.00")){
            System.out.println("PASS: the price is correct");
        }else {
            System.out.println("FAIL: the price was not updated");
        }

        driver.quit();



    }
}
