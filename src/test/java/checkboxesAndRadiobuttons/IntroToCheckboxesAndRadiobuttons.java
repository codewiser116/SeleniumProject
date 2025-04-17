package checkboxesAndRadiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToCheckboxesAndRadiobuttons {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. go to https://demoqa.com/automation-practice-form
        2. select Male as Gender (radiobutton)
        3. select Sports, Music, Reading as Hobbies (checkboxes)
         */

        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/automation-practice-form");

//        WebElement maleGender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        maleGender.click();
//
//        Thread.sleep(2000);
//
//        if (maleGender.isSelected()){
//            System.out.println("Yay, male gender was selected!");
//        }
//
//        WebElement sports = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
//        WebElement music = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
//        WebElement reading = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
//
//        sports.click();
//        music.click();
////        reading.click();
//        Thread.sleep(2000);
//
//        if (driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).isSelected()){
//            System.out.println("sports selected");
//        }
//
//        if (!reading.isSelected()){
//            System.out.println("reading is not selected");
//        }


        driver.navigate().to("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();

        Thread.sleep(2000);

        WebElement documentsCheckbox = driver.findElement(By.xpath("//label[@for='tree-node-documents']"));
        documentsCheckbox.click();

        Thread.sleep(3000);

        if (documentsCheckbox.isSelected()){
            System.out.println("Documents selected");
        }

    }
}
