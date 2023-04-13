package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownExample {
    ChromeDriver driver;
    @BeforeClass
    void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();//in order to open window in maximized screen
    }
    @Test
    void dropdownMethod() {
        Select select=new Select(driver.findElement(By.id("dropdown")));
        //select.selectByValue("1");
        //select.selectByIndex(2);
        //select.selectByVisibleText("Option 1");


        /*To select all option */
        List<WebElement> li=select.getOptions();
        for (WebElement a:li){
           // System.out.println(a);
            System.out.println(a.getText());
        }
    }
//    @AfterClass
//    void closeDriver(){
//        driver.close();
//
//    }
}