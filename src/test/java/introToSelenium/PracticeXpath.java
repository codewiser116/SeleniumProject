package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to https://demoqa.com/text-box
        2. fill out the form
        3. click on Submit
        4. verify text appeared in the bottom
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        String name = "John Doe";
        String emailAddress = "john.doe@gmail.com";
        String address = "123 Abc street";

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys(name);

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys(emailAddress);

        WebElement addressField = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        addressField.sendKeys(address);

        WebElement permanAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanAddress.sendKeys(address);

        WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitBtn.click();

        String submittedName = driver.findElement(By.xpath("//p[@id='name']")).getText();
        String submittedEmail = driver.findElement(By.xpath("//p[@id='email']")).getText();
        String submittedCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
        String submittedPermAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();

        System.out.println(submittedName.contains(name));
        System.out.println(submittedEmail);
        System.out.println(submittedCurrentAddress);
        System.out.println(submittedPermAddress);
        System.out.println();
    }
}
