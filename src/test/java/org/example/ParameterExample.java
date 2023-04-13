package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setupDriver(String browser, String link){

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver=new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.chromedriver().setup();
            driver=new EdgeDriver();
        }
////        else if (browser.equalsIgnoreCase("brave")) {
////            WebDriverManager.chromiumdriver().browserVersion("96.0.4664.45").setup();
////            driver=new ChromeDriver();
////
//            System.setProperty("webdriver.chrome.driver", "d:/BraveBrowserNightlySetup.exe");
//            driver = new ChromeDriver();
//        }
        driver.get(link);
        driver.manage().window().maximize(); //in order to open window in maximized screen
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
