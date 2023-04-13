package org.example;

import org.testng.annotations.Test;

public class AppTest1 {
    @Test(priority = 1)
    void openBrowser(){
        System.out.println("OpenBrowser");
    }
    @Test(priority = 3)
    void closeLPULive(){
        System.out.println("closeLPULive");
    }
    @Test(priority = 2)
    void clickLPULive(){
        System.out.println("OpenLPULive");
    }
    @Test(priority = 4)
    void closeBrowser(){
        System.out.println("closeBrowser");
    }

}
