package introToSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpathMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to https://demoqa.com/automation-practice-form
        2. fill out the form
        3. click on Submit

        USE XPATH METHODS: contains, text, starts-with, normalize-space
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.xpath("//input[contains(@placeholder, 'First')]"));
        WebElement lastName = driver.findElement(By.xpath("//input[contains(@placeholder, 'Last')]"));
        WebElement email = driver.findElement(By.xpath("//input[contains(@id, 'Email')]"));

        firstName.sendKeys("Jessica");
        lastName.sendKeys("Connor");
        email.sendKeys("jessica@gmail.com");

        Thread.sleep(2000);
        WebElement femaleRadioButton = driver.findElement(By.xpath("//label[contains(@for, 'gender-radio-2')]"));
        femaleRadioButton.click();
        Thread.sleep(1000);

        if (femaleRadioButton.isSelected()){
            System.out.println("Gender was selected!");
        }else{
            System.out.println("Fail: gender was not selected");
        }

        WebElement mobile = driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Mobile')]"));
        mobile.sendKeys("3127185000");

        WebElement subjects = driver.findElement(By.xpath("//input[starts-with(@id, 'subjects')]"));
        subjects.sendKeys("C");

        Thread.sleep(1000);

        WebElement compScience = driver.findElement(By.xpath("//div[normalize-space(text())='Computer Science']"));
        compScience.click();

        Thread.sleep(3000);

        WebElement readingCheckbox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
        readingCheckbox.click();

        if (readingCheckbox.isSelected()){
            System.out.println("Reading was selected");
        }else{
            System.out.println("Failed to select reading");
        }

        WebElement submitBtn = driver.findElement(By.xpath("//button[normalize-space(text())='Submit']"));
        submitBtn.click();



    }
}
