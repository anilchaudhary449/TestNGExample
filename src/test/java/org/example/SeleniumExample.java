package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumExample {
        ChromeDriver driver;
        @BeforeClass
        void setupDriver(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

            driver.get("https://www.google.com/");
            driver.manage().window().maximize();//in order to open window in maximized screen
        }
        @Test
        void getTitlefromPage() throws InterruptedException{
            driver.findElement(By.name("q")).sendKeys("Mobile");
            Thread.sleep(1000);

            driver.findElement(By.name("btnK")).click();
            Thread.sleep(1000);

            Assert.assertEquals(driver.getTitle(), "Mobile - Google Search");
        }
        @AfterClass
        void closeDriver(){
            driver.close();

        }
}
