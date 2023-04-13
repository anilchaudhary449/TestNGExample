package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class JavaScriptAlertExample {
    ChromeDriver driver;
    @BeforeClass
    void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();//in order to open window in maximized screen
    }
   @Test
    void alertMethod() {
       //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
       //driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
       Alert alert = driver.switchTo().alert();
       //alert.dismiss();
       alert.sendKeys("hihello");
       alert.accept();
   }
//    @AfterClass
//    void closeDriver(){
//        driver.close();
//
//    }
}

