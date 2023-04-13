package org.example;

import org.testng.annotations.*;

public class Test2 {
    @BeforeClass
    void beforeClass() {
        System.out.println("This will run before CLASS");
    }


    @AfterClass
    void afterClass() {
        System.out.println("This will run after CLASS");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will run before METHOD");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will run after METHOD");
    }

    @Test
    void test4() {
        System.out.println("TEST4");
    }

    @Test
    void test5() {
        System.out.println("TEST5");
    }

    @Test
    void test6() {
        System.out.println("TEST6");
    }
}
