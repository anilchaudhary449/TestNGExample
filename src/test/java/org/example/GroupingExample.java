package org.example;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = "regression")
    void method1() {
        System.out.println("method1");
    }

    @Test(groups = "critical")
    void method2() {
        System.out.println("method2");
    }

    @Test(groups = "smoke")
    void method3() {
        System.out.println("method3");
    }

    @Test(groups = "sanitary")
    void method4() {
        System.out.println("method4");
    }

    @Test(groups = {"critical", "regression"})
    void method5() {
        System.out.println("method5");
    }

    @Test(groups = "regression")
    void method6() {
        System.out.println("method6");
    }
}
