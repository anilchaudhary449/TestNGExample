package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class frameExample{
    ChromeDriver driver;

    @BeforeClass
    void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();//in order to open window in maximized screen
    }

    @Test
    void iframeMethod() throws InterruptedException {
        driver.switchTo().frame("mce_0_ifr");
        WebElement e = driver.findElement(By.id("tinymce"));
        e.clear();
        e.sendKeys("Epam Class on testing.");
        Thread.sleep(2000);

    }

    @AfterClass
    void closeDriver() {
        driver.close();

    }
}

